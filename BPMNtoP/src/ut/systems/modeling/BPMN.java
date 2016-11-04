package ut.systems.modeling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pskpartha on 11/4/2016.
 */
public class BPMN {

    List<Sequence_Flow> sfl = new ArrayList<Sequence_Flow>();


    void getStartEvent() {
        Event obn = new Event(true);
    }

    List<Sequence_Flow> getFlows() {
        return this.sfl;
    }
}
