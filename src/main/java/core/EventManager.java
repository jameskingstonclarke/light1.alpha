package core;

import api.engine.IEventManager;
import api.event.Event;
import api.event.EventBus;
import test.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EventManager implements IEventManager {
    private HashMap<Class, EventBus> eventBuses;

    public EventManager(){
        initBuses();
    }

    private void initBuses(){
        this.eventBuses = new HashMap<>();
        this.eventBuses.put(Event.EngineEvent.class, new EventBus<Event.EngineEvent>());
        this.eventBuses.put(Event.PluginEvent.class, new EventBus<Event.PluginEvent>());
        this.eventBuses.put(Event.EnviromentEvent.class, new EventBus<Event.EnviromentEvent>());
        this.eventBuses.put(Event.ArtifactEvent.class, new EventBus<Event.ArtifactEvent>());
    }

    public void flush(){
        Iterator iterator = this.eventBuses.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            // Flush the event buses
            ((EventBus)pair.getValue()).flush();
            iterator.remove(); // avoids a ConcurrentModificationException
        }
    }

    /**
     * Go through each object method, and subscribe it to the correct event bus
     * @param object Instance of the class that wants to listen for events
     */
    public void registerListener(Object object){}
    /**
     * Go through each object method, and subscribe it to the correct event bus
     * @param clss The class that wants to listen for events
     */
    public void registerListener(Class clss){}

    public void registerBus(EventBus eventBus){

    }

    /**
     * Generate an event
     * @param event
     */
    public void event(Event event){
        this.eventBuses.get(event.getClass()).push(event);
    }
}
