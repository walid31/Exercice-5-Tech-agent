import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.core.behaviours.*;

public class Agent2 extends Agent{
	protected void setup() {
		addBehaviour(new CyclicBehaviour(this) {
			public void action() {
				ACLMessage msg = receive();
				if(msg != null) {
					System.out.println("Je suis "+getLocalName()+ " j'ai reçu le message "+msg.getContent()+
			    			  " de la part de l'agent "+msg.getSender().getLocalName()+ " .");
					ACLMessage reply = msg.createReply();
					reply.setPerformative(ACLMessage.INFORM);
					reply.setContent("Merci");
					send(reply);
					doDelete();					
				} block();
			}
		});
	}
}
