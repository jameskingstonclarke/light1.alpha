package api.engine;

import api.artifact.Artifact;

import java.util.ArrayList;

/**
 * Registries store instances of the artifacts they control.
 */
public class Registry {

    /**
     * The ID this registry is assigned to
     */
    private String enviromentID;

    private ArrayList<Artifact> artifacts;

    public void register(Artifact... artifacts){}

    public class RegistryBuilder{
        /**
         * Create a new registry for an enviroment
         * @return
         */
        public Registry enviroment(String enviromentID){
            return null;
        }
    }
}
