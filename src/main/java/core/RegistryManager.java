package core;

import api.artifact.Artifact;
import api.engine.IRegistryManager;

import java.rmi.registry.Registry;
import java.util.HashMap;

public class RegistryManager implements IRegistryManager {

    private HashMap<String, api.engine.Registry> registryMap;

    public RegistryManager(){
        this.registryMap = new HashMap<>();
    }

    public void addRegistry(Registry registry){}
    public void registerArtifact(Artifact artifact){}
}
