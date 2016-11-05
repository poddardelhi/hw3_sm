package ut.systems.modelling;

/**
 * Created by pskpartha on 11/4/2016.
 */
public class MyEvent extends Node {

    public enum eventType {start,intermadiate,end};

    public eventType eType;

    public MyEvent(eventType etype) {
        this.eType = etype;
    }
}
