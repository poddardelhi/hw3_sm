package ut.systems.modelling;

import java.util.ArrayList;
import java.util.List;

import static ut.systems.modelling.MyEvent.eventType.start;

/**
 * Created by pskpartha on 11/4/2016.
 */
public class BPMN {

    public List<Sequence_Flow> sfl = new ArrayList<Sequence_Flow>();


    public MyEvent getStartEvent() {
        MyEvent obn = new MyEvent(start);
        return obn;
    }

    public List<Sequence_Flow> getFlows() {
        return this.sfl;
    }
}
