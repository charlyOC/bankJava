package conseiller;

import java.sql.SQLException;
import java.util.Scanner;

import client.AddClient;
import client.Client;

public class AddClientFromIdConseiller {
	
	public void addClientFromIdConseiller(int idClient, String nameValue, String firstNameValue, String raisonSocialeValue, String numeroClientValue, int idConseiller ) throws SQLException{
		
		//Ancienne m�thode pour v�rifier si �a marche!
		
		
//	    Scanner sc = new Scanner(System.in);
//	    
//	    System.out.println("Entrez un id Client");
//	    int idClient = sc.nextInt(); 
//	    
//	    System.out.println("Entrez un Pr�nom de client");
//	    String firstName = sc.next(); 
//	    
//	    System.out.println("entrez un nom de client");
//	    String name = sc.next();
//	    
//	    System.out.println("entrez une raison Sociale");
//	    String raisonSociale = sc.next();
//	    
//	    System.out.println("entrez un num�ro de client");
//	    String numClient = sc.next();
//	    
	   // Appel de m�thode du template!
		
		
	    Client client = new Client(0, null, null, null, null, 0);
	    client.setIdClient(idClient);
	    client.setFirstNameClient(firstNameValue);
	    client.setNameClient(nameValue);
	    client.setRaisonSociale(raisonSocialeValue);
	    client.setNumClient(numeroClientValue);
	    client.setIdConseiller(idConseiller);
	    
	    AddClient request = new AddClient(); 
	    request.addClient(client, idConseiller);
	    
	    System.out.println( client.getRaisonSociale()+ " " + client.getFirstNameClient() + " " + client.getNameClient() + " "  + "a �t� ajout�");
	}

}
