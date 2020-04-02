package core;

import api.artifact.Artifact;

import java.util.ArrayList;

public class Registry {

    private String enviromentID;
    private ArrayList<Artifact> artifacts;

    public Registry(String enviromentID){
        this.enviromentID = enviromentID;
    }

    /**
     * @TODO check if the artifact has already been registered
     * @param artifact
     */
    public void register(Artifact artifact){
        this.artifacts.add(artifact);
    }
}
