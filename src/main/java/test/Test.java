package test;

import api.artifact.Artifact;
import api.event.Event;
import api.event.SubscribeEvent;

public class Test extends Artifact {

    @SubscribeEvent
    public void testEvent(Event.EngineEvent event){
        System.out.println("recieved engine event!");
    }
}
