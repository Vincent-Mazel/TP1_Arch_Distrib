import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDossierSuivi extends Remote{
	public String getText() throws RemoteException;
	public void setText(String text) throws RemoteException;
}
