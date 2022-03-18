package conseiller;

import java.sql.SQLException;
import java.util.Scanner;

import client.GetClient;
import conseiller.GetConseiller;




public class AuthAndGetClients {
	
	public int AuthAndGetClient() throws SQLException{
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Entrez un Prénom");
	    String firstName = sc.nextLine(); 
	    
	    System.out.println("entrez un mot de passe");
	    String inputPassword = sc.nextLine(); 
		
	    GetConseiller conseiller = new GetConseiller(); 
	    
	    GetClient client = new GetClient();
 
	    
	    int idConseiller = conseiller.getConsFromFirstName(firstName).getIdConseiller(); 

	    if(inputPassword.equals(conseiller.getConsFromFirstName(firstName).getPassword())) {
	    	System.out.println("auth réussie");
	    	System.out.println("Bonjour" + " " + conseiller.getConsFromFirstName(firstName).getFirstName());
	    	System.out.println("voici vos clients");

	    	
		   	for(int i = 0; i < client.getClientFromIdConseiller(idConseiller).size(); i++) {
	    		System.out.print(client.getClientFromIdConseiller(idConseiller).get(i).getFirstNameClient() + " ");
	    		System.out.println(client.getClientFromIdConseiller(idConseiller).get(i).getNameClient());
	    	}
	    	 
	    } else {
	    	System.out.println("auth échouée");
	    }
	    
		return idConseiller;
	   
	}
	

    

}
