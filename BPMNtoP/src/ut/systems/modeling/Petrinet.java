package ut.systems.modeling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pskpartha on 11/4/2016.
 */
public class Petrinet {

    public List<Place> obPlaces = new ArrayList<Place>();
    public List<Transition> obTrans = new ArrayList<Transition>();
    public List<P2T> obP2T = new ArrayList<P2T>();

    public Place addPlace(String name) {
        Place ob = new Place(name);
        obPlaces.add(ob);
        return ob;
    }

    public Transition addTransition(String name) {
        Transition obp = new Transition(name);
        obTrans.add(obp);
        return obp;
    }

    public void addArcP2T(Place p,Transition t){
       P2T ob= new P2T(p,t);

    }
    public void addArcT2P(Transition t,Place p){
        T2P ob= new T2P(t,p);

    }


}
