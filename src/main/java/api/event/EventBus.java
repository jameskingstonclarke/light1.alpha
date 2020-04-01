package api.event;

import java.util.ArrayList;

public class EventBus<T> {

    private ArrayList<T> events;

    public EventBus(){
        this.events = new ArrayList<>();
    }

}
