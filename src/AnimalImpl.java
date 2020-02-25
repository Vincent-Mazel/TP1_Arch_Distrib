import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class AnimalImpl extends UnicastRemoteObject implements Animal {
	public String nom;
	public String nomMaitre;
	public String espece;
	public String race;
	public IDossierSuivi dossier;
	
	public AnimalImpl(String nom, String nomMaitre, String espece, String race, DossierSuivi dossier) throws RemoteException  {
		this.nom = nom;
		this.nomMaitre = nomMaitre;
		this.espece = espece;
		this.race = race;
		this.dossier = dossier;
	}

	@Override
	public String getNom() throws RemoteException {
		return nom;
	}

	@Override
	public String getNomMaitre() throws RemoteException {
		return nomMaitre;
	}

	@Override
	public String getEspece() throws RemoteException {
		return espece;
	}

	@Override
	public String getRace() throws RemoteException {
		return race;
	}

	@Override
	public IDossierSuivi getDossier() throws RemoteException {
		return dossier;
	}
}
