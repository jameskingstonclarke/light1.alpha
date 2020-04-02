package api.engine;

import api.artifact.Artifact;

public interface IArtifactManager {
    /**
     * Create an engine-instance of an artifact
     * @param artifactID
     */
    Artifact instance(String artifactID);
}
