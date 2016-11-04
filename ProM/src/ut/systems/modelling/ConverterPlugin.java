package ut.systems.modelling;

import org.processmining.contexts.uitopia.UIPluginContext;
import org.processmining.contexts.uitopia.annotations.UITopiaVariant;
import org.processmining.framework.plugin.annotations.Plugin;
import org.processmining.framework.plugin.annotations.PluginVariant;

import org.processmining.models.graphbased.NodeID;
import org.processmining.models.graphbased.directed.bpmn.BPMNDiagram;
import org.processmining.models.graphbased.directed.bpmn.BPMNNode;
import org.processmining.models.graphbased.directed.bpmn.elements.*;
import org.processmining.models.graphbased.directed.petrinet.Petrinet;
import org.processmining.models.graphbased.directed.petrinet.elements.Place;
import org.processmining.models.graphbased.directed.petrinet.elements.Transition;
import org.processmining.models.graphbased.directed.petrinet.impl.PetrinetImpl;
import org.processmining.models.shapes.Gate;

import java.util.UUID;


@Plugin(
        name = "Converter BPMN-PN",
        parameterLabels = { "BPMNDiagram" },
        returnLabels = { "Petri-Net" },
        returnTypes = { Petrinet.class },
        userAccessible = true,
        help = "Convert a BPMN diagram into a Petri-Net"
)
public class ConverterPlugin {

    @UITopiaVariant(
            affiliation = "University of Tartu",
            author = "Partha Kar",
            email = "partha89@ut.ee"

    )
    @PluginVariant(variantLabel = "Convert BPMN into PN", requiredParameterLabels = {0})
    public static Petrinet optimizeDiagram(UIPluginContext context, BPMNDiagram diagram) {

//        for(Activity activity : diagram.getActivities()){
//            activity.getId();
//        }

        for(Event event : diagram.getEvents()){
            String eventType = event.getEventType().toString();
        }

        for(Gateway gateway : diagram.getGateways()){
            String gatewayType = gateway.getGatewayType().toString();

            if(gatewayType.equals(Gateway.GatewayType.DATABASED)){
                //XORJoin or XORSplit
            }
            else if(gatewayType.equals(Gateway.GatewayType.PARALLEL)){
                //ANDJoin or ANDSPlit
            }
        }

        for(Activity activity : diagram.getActivities()){
            if(activity instanceof SubProcess){
                //Compound Task
            }else{
                //Simple Task
            }
        }

        for(Flow flow: diagram.getFlows()){
            //Sequence flow
            BPMNNode targetNode = flow.getTarget();
            BPMNNode sourceNode = flow.getSource();

            if(targetNode instanceof Event){

            }
            else if(targetNode instanceof Activity){
                if(targetNode instanceof SubProcess){

                }else{
                    //simple task
                }
            }
            else if(targetNode instanceof Gateway){

            }

            NodeID nodeID = targetNode.getId();

            String idAsString = nodeID.toString();
            idAsString = idAsString.substring(5,idAsString.length());
            UUID nodeUuid = UUID.fromString(idAsString);
        }



        Petrinet pn = new PetrinetImpl("Test petri");

        for(Transition transition : pn.getTransitions()){
            transition.getId();
        }

        for(Place place : pn.getPlaces()){
            place.getId();
        }

        pn.addTransition("hello world");
        pn.addPlace("my place");
        //pn.addArc() takes references for transition and place

//        MyBPMNModel myBPMNModel = getMyBPMNModel(diagram);
//        pn = MyConverter.getPN(myBPMNModel);

        return pn;
    }
}
