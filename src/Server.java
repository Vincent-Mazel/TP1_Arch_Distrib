import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {

	public Server() {}

	public static void main(String args[]) {

		try {
			if(System.getSecurityManager()==null) {
				System.setProperty( "java.security.policy", "/home/e20190011390/workspace/Architecture distribuee/TP1/src/animal.policy");
				System.setSecurityManager (new SecurityManager());
			}
			
			AnimalImpl obj = new AnimalImpl("Chipie", "Vincent", "Chat" , null, new DossierSuivi("faut laver le chat"));
			Registry registry = LocateRegistry.createRegistry(1099);
			
			if (registry == null){
				System.err.println("RmiRegistry not found");
			}else{
				registry.bind("Animal", obj);
				System.err.println("Server ready");
			}
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}