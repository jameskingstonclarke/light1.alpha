package api.engine;

import api.artifact.Artifact;
import api.enviroment.Enviroment;

import java.rmi.registry.Registry;

public interface IRegistryManager {
    /**
     * Add a new registry to the registry manager
     * @param registry The new registry type
     */
    void addRegistry(Registry registry);

    /**
     * Add an artifact to the registry
     * @param artifact The artifact to be added
     */
    void registerArtifact(Artifact artifact);
}
