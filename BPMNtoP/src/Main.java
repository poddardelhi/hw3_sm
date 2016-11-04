import ut.systems.modeling.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Map<Event, Transition> nodeTransition = new HashMap<Event, Transition>();
        Petrinet obPetrinet = new Petrinet();
        Place startPlace = obPetrinet.addPlace("start");
        Transition startTransition = obPetrinet.addTransition("startTranstion");
        obPetrinet.addArcP2T(startPlace,startTransition);

        Place endPlace = obPetrinet.addPlace("end");
        Transition endTransition = obPetrinet.addTransition("endTranstion");
        obPetrinet.addArcT2P(endTransition,endPlace);

       //BPMN
        BPMN obBPMN= new BPMN();
        Event startEvent=obBPMN.getStartEvent();
        nodeTransition.put(startEvent, startTransition);
        Event endEvent = new Event(false);
        nodeTransition.put(endEvent, endTransition);




    }
}
