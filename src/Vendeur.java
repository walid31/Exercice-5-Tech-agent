import jade.core.Agent;
import jade.core.AID;
import jade.lang.acl.ACLMessage;
public class Vendeur extends Agent {
	float prix;
	String nom;
	protected void setup() {
		Object[] args = getArguments();
		if(args != null) {
			nom = (String)args[0];
			prix = Float.valueOf((String)(args[1])).floatValue();
			System.out.println("\nAgent "+getLocalName()+ "vend le produit "+nom+ "au prix "+prix);
		}
		Runtime.getRuntime().exit(Vendeur.AP_DELETED);
	}
}
