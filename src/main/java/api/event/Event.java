package api.event;

public abstract class Event {

    public class EngineEvent extends Event{

    }
    public class RegistryEvent<T> extends EngineEvent{

    }
    public class TickEvent extends EngineEvent{

    }



    public class PluginEvent extends Event{

    }
    public class EnviromentEvent extends Event{

    }
    public class ArtifactEvent extends Event{

    }
}
