package compte;

import java.sql.SQLException;
import java.util.Scanner;

import client.AddClient;
import client.Client;

public class AddCompteCourantFromIdClient {
	public void addCompteFromIdClient(int idClient) throws SQLException{
		
		
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
	    
	    
	    CompteCourant compteCourant = new CompteCourant(0, 0);
	    compteCourant.setIdCompte(idCompte);
	    compteCourant.setFraisTrans(1);
	    compteCourant.setSoldeMinAutorise(-10);
	    
	
	    
	    InsertQueryAccountCourant request = new InsertQueryAccountCourant(); 
	    request.insertQueryAccountCourant(compte, compteCourant, idClient);
	    
//	    System.out.println( client.getRaisonSociale()+ " " + client.getFirstNameClient() + " " + client.getNameClient() + " "  + "a été ajouté");
	}
}
