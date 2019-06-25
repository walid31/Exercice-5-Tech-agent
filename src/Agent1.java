import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import jade.core.behaviours.*;
public class Agent1 extends Agent {
	protected void setup() {
		ACLMessage msg = new ACLMessage (ACLMessage.INFORM);
		msg.setContent("Bonjour");
		msg.addReceiver(new AID("Cedric",AID.ISLOCALNAME));
		send(msg);
	  addBehaviour(new CyclicBehaviour(this) {
		  public void action() {
			  ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
		      msg = receive();
		      if (msg != null) {
		    	  System.out.println("Je suis "+getLocalName()+ " j'ai reçu le message "+msg.getContent()+
		    			  " de la part de l'agent "+msg.getSender().getLocalName()+" .");
		    	  doDelete();
		    	  Runtime.getRuntime().exit(Agent1.AP_DELETED);
		      } block();
		  }
	  });
	}
}
