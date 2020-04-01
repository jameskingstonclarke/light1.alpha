package core;

import api.engine.Manager;

public class Engine {


    private boolean running;


    /**
     * Load all plugins dynamically and setups engine
     */
    public void preInit(){
        // Setup the API managers
        Manager.setEventManager(new EventManager());
        Manager.setRegistryManager(new RegistryManager());
    }

    /**
     * Initialise all the relevant components and then.
     * 1. Send out a registry event to setup the registries.
     */
    public void init(){
        // Call init on all plugins, enviroments and artifacts
    }

    public void run() {
        running = true;
        while (running) {

        }
    }

    public void close(){

    }
}
