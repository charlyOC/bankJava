package compte;

import java.sql.SQLException;
import java.util.Scanner;

public class AddCompteEpargneFromIdClient {
	public void addCompteEpargneFromIdClient(int idClient) throws SQLException{
		
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Entrez un id Compte");
	    int idCompte = sc.nextInt(); 
//	    
//	    System.out.println("Entrez un Prénom de client");
//	    String firstName = sc.next(); 
//	    
//	    System.out.println("entrez un nom de client");
//	    String name = sc.next();
//	    
//	    System.out.println("entrez une raison Sociale");
//	    String raisonSociale = sc.next();
//	    
	    System.out.println("entrez un numéro de compte");
	    String numCompte = sc.next();
	    
	    Compte compte = new Compte(); 
	    compte.setIdCompte(idCompte);
	    compte.setIdClient(idClient);
	    compte.setNumCompte(numCompte);
	    compte.setSoldeActuel(0);
	    compte.setTypeOfAccount("Courant");
	    
	    
	    CompteEpargne compteEpargne = new CompteEpargne(0, 0);
	    compteEpargne.setIdCompte(idCompte);
	    compteEpargne.setTauxInt(1);
	    compteEpargne.setPlafond(25000);
	    
	
	    InsertQueryAccountEpargne request = new InsertQueryAccountEpargne(); 
	    request.insertQueryAccountEpargne(compte, compteEpargne, idClient);
	}
}
