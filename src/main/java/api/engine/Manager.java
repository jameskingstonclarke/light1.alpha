package api.engine;

public class Manager {

    private static boolean registryManagerSet = false;
    // Static instances of everything the API needs
    private static IRegistryManager registryManager;

    private static boolean eventManagerSet = false;
    // Static instances of everything the API needs
    private static IEventManager eventManager;

    public static void setRegistryManager(IRegistryManager registryManager){
        if(!Manager.registryManagerSet) {
            Manager.registryManager = registryManager;
            Manager.registryManagerSet = true;
        }
    }

    public static IRegistryManager getRegistryManager(){
        return Manager.registryManager;
    }


    public static void setEventManager(IEventManager eventManager){
        if(!Manager.eventManagerSet) {
            Manager.eventManager = eventManager;
            Manager.eventManagerSet = true;
        }
    }

    public static IEventManager getEventManager(){
        return Manager.eventManager;
    }
}
