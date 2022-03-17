package client;

public class Client {
	private int idClient; 
	private String nameClient;
	private String firstNameClient; 
	private String raisonSociale; 
	private String numClient; 
	private int idConseiller; 
	
	public Client(int IdClient, String NameClient, String FirstNameClient, String RaisonSociale, String NumClient, int IdConseiller) {
		this.idClient = IdClient; 
		this.nameClient = NameClient; 
		this.firstNameClient = FirstNameClient; 
		this.raisonSociale = RaisonSociale; 
		this.numClient = NumClient; 
		this.idConseiller = IdConseiller; 
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getFirstNameClient() {
		return firstNameClient;
	}

	public void setFirstNameClient(String firstNameClient) {
		this.firstNameClient = firstNameClient;
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
