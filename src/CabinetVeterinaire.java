import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class CabinetVeterinaire extends UnicastRemoteObject implements ICabinetVeterinaire {
	
	private List<Animal> patients;
	
	private CabinetVeterinaire() throws RemoteException {}

	@Override
	public Animal getAnimal(String nom) throws RemoteException {
		for (Animal a : patients) {
			if (a.getNom() == nom)
				return a;
		}
		
		System.out.println("Pas d'animal portant le nom " + nom + " !");
		return null;
	}


	@Override
	public void createAnimal() throws RemoteException {
		
	}

	@Override
	public void addPatient(Animal patient) throws RemoteException {
		patients.add(patient);
	}
	
	
}	
