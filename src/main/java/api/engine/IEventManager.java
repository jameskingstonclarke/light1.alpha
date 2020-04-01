package api.engine;

import api.event.Event;

public interface IEventManager {

    /**
     * Pass an instance of an object that has a @SubscribeEvent annotation to listen for events.
     * Used for non-static listeners
     * @param object Instance of the class that wants to listen for events
     */
    void registerListener(Object object);
    /**
     * Pass a class that has a @SubscribeEvent annotation to listen for events. Used for static listeners
     * @param clss The class that wants to listen for events
     */
    void registerListener(Class clss);

    void pluginEvent(Event.PluginEvent event);
    void enviromentEvent(Event.EnviromentEvent event);
    void artifactEvent(Event.ArtifactEvent event);
}
