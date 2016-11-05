package ut.systems.modelling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pskpartha on 11/4/2016.
 */
public class MyPetrinet {

    public List<MyPlace> obPlaces = new ArrayList<MyPlace>();
    public List<MyTransition> obTrans = new ArrayList<MyTransition>();
    public List<P2T> obP2T = new ArrayList<P2T>();
    public List<T2P> obT2P = new ArrayList<T2P>();

    public MyPlace addPlace(String name) {
        MyPlace ob = new MyPlace(name);
        obPlaces.add(ob);
        return ob;
    }

    public MyTransition addTransition(String name) {
        MyTransition obp = new MyTransition(name);
        obTrans.add(obp);
        return obp;
    }

    public void addArcP2T(MyPlace p, MyTransition t){
       P2T ob= new P2T(p,t);
        obP2T.add(ob);
    }
    public void addArcT2P(MyTransition t,MyPlace p){
        T2P ob= new T2P(t,p);
        obT2P.add(ob);
    }


}
