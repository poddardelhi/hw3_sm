import ut.systems.modeling.Event;
import ut.systems.modeling.Transition;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Event startEvent= new Event(true);
        Transition startTransition= new Transition("startTranstion");
        Map<Event, Transition> nodeTransition=new HashMap<Event,Transition>();
        nodeTransition.put(startEvent,startTransition);

    }
}
