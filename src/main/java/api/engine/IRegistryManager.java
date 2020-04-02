package api.engine;

import api.artifact.Artifact;


public interface IRegistryManager {

    void addRegistry(String enviromentID);

    void registerArtifact(String enviromentID, Artifact artifact);
}
