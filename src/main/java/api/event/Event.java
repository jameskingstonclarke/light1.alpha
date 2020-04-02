package api.event;

/**
 * Note: Events MUST BE read only! This is because events are serially distributed, one artifact will read an event
 * before the other and so must NEVER modify it!
 */
public abstract class Event {

    public static class EngineEvent extends Event{

    }
    public static class RegistryEvent<T> extends EngineEvent{

    }
    public static class TickEvent extends EngineEvent{

    }


    public static class PluginEvent extends Event{

    }
    public static class EnviromentEvent extends Event{

    }
    public static class ArtifactEvent extends Event{

    }
}
