import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DossierSuivi extends UnicastRemoteObject implements IDossierSuivi {
	private String text;

	public DossierSuivi(String text) throws RemoteException {
		this.text = text;
	}
	
	@Override
	public String getText() throws RemoteException {
		return text;
	}
	
	@Override
	public void setText(String text) throws RemoteException {
		this.text = text;
	}
}
