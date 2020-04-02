package api.event;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class EventBus<T> {

    private static int CAPACITY = 500;

    /**
     * The current active events
     */
    private ArrayList<T> events;

    /**
     * The objects that have subscribed to this event bus
     */
    private ArrayList<Object> subscribers;

    public EventBus(){
        this.events = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Object object){
        if(!this.subscribers.contains(object)){
            this.subscribers.add(object);
        }
    }

    public void push(T event){
        // Should add exceptions here
        if(events.size()<CAPACITY)
            this.events.add(event);
        else
            throw new RuntimeException("event bus capacity exceeded!");
    }

    /**
     * When flush is called, all events are dispached and the event bus is cleared
     */
    public void flush(){
        for(T event : this.events){
            // Call the callback here
            for(Object subscriber : this.subscribers) {
                try {
                    dispatchEventToObject(subscriber, event);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    private void dispatchEventToObject(Object object, T event) throws Exception {
        Class<?> clazz = object.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(SubscribeEvent.class)) {
                method.setAccessible(true);
                method.invoke(object, event);
            }
        }
    }
}
