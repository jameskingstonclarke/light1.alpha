package core;

import api.engine.IEventManager;
import api.event.Event;
import api.event.EventBus;

import java.util.HashMap;

public class EventManager implements IEventManager {
    private HashMap<Class, EventBus> eventBuses;

    public EventManager(){
        this.eventBuses = new HashMap<>();
    }

    private void initBuses(){
        this.eventBuses.put(Event.EngineEvent.class, new EventBus<Event.EngineEvent>());
        this.eventBuses.put(Event.PluginEvent.class, new EventBus<Event.PluginEvent>());
        this.eventBuses.put(Event.EnviromentEvent.class, new EventBus<Event.EnviromentEvent>());
        this.eventBuses.put(Event.ArtifactEvent.class, new EventBus<Event.ArtifactEvent>());
    }

    public void registerListener(Object object){}
    public void registerListener(Class clss){}
    public void pluginEvent(Event.PluginEvent event){}
    public void enviromentEvent(Event.EnviromentEvent event){}
    public void artifactEvent(Event.ArtifactEvent event){}
}
