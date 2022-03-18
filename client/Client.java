package client;


public class Client {


	private int idClient;
	private String nom;
	private String prenom;
	private String raisonSociale;
	private String numClient;
	private int idConseiller;

	public Client(int idClient, String Nom, String Prenom, String RaisonSociale, String NumClient, int idConseiller) {
		this.nom = Nom;
		this.prenom = Prenom;
		this.raisonSociale = RaisonSociale;
		this.numClient = NumClient;

	}
	
	public int getIdClient() {
		return idClient;
	}
	
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	public String getNameClient() {
		return nom;
	}
	
	public void setNameClient(String nom) {
		this.nom = nom;
	}
	
	public String getFirstNameClient() {
		return prenom;
	}
	
	public void setFirstNameClient(String prenom) {
		this.prenom = prenom;
	}
	
	public String getRaisonSociale() {
		return raisonSociale;
	}
	
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	
	public String getNumClient() {
		return numClient;
	}
	
	public void setNumClient(String numClient) {
		this.numClient = numClient;
	}
	

	public int getIdConseiller() {
		return idConseiller;
	}


	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}
}

