import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICabinetVeterinaire extends Remote {
	public Animal getAnimal(String nom) throws RemoteException;
	public void createAnimal() throws RemoteException;
	public void addPatient(Animal patient) throws RemoteException;
}
