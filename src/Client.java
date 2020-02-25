import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	private Client() {}

	public static void main(String[] args) {

		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			Animal stub = (Animal) registry.lookup("Animal");
			String nomAnimal = stub.getNom();
			System.out.println("nom animal: " + nomAnimal);
			
			IDossierSuivi dossier = stub.getDossier();
			System.out.println(dossier.getText());
			
			dossier.setText("animal lavé");
			System.out.println(dossier.getText());
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
