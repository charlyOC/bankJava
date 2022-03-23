package compte;

public class Compte {
	
	private int idCompte; 
	private int idClient;
	private String numCompte; 
	private int soldeActuel; 
	private String typeOfAccount; 
	

	public int getIdCompte() {
		return idCompte;
	}
	
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}


	public int getSoldeActuel() {
		return soldeActuel;
	}

	public void setSoldeActuel(int soldeActuel) {
		this.soldeActuel = soldeActuel;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	
	
}
