import jade.core.Agent;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.*;

public class CreateAgent {
	public static void main(String[] args) {
		try {Runtime rt = Runtime.instance();
			ProfileImpl p = new ProfileImpl("localhost",1099,null);
			ContainerController mc = rt.createMainContainer(p);
			AgentController ag1 = mc.createNewAgent("Walid", "Agent1",null);
			ag1.start();
			AgentController ag2 = mc.createNewAgent("Cedric", "Agent2",null);
			ag2.start();
		}catch (Exception e) {e.printStackTrace();}
	}

}
