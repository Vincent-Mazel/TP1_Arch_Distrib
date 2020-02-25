import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Espece extends UnicastRemoteObject implements IEspece {
	
	private String name;
	
	protected Espece(String name) throws RemoteException {
		this.name = name;
	}

	@Override
	public String getName() throws RemoteException {
		return name;
	}

}
