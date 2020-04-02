package core;

import api.artifact.Artifact;
import api.engine.IRegistryManager;

import java.util.HashMap;

public class RegistryManager implements IRegistryManager {

    private HashMap<String, Registry> registries;

    public RegistryManager(){
        this.registries = new HashMap<>();
    }

    public void addRegistry(String enviromentID){
        this.registries.put(enviromentID, new Registry(enviromentID));
    }

    public void registerArtifact(String enviromentID, Artifact artifact){
        this.registries.get(enviromentID).register(artifact);
    }
}
