package conseiller;

import java.sql.SQLException;

import java.util.Scanner;

import client.GetClient;
import conseiller.GetConseiller;


public class Auth {
	
	public String checkAuthMessage(String firstName, String inputPassword) throws SQLException{

	    GetConseiller conseiller = new GetConseiller(); 
	    
	    
	    String result; 
	    
	    
	    if(conseiller.getConsFromFirstName(firstName) == null) {
	    	System.out.println("couille du néant");
	    	result = "Username incorrect"; 
	    } else {
		    if(conseiller.getConsFromFirstName(firstName).getPassword().equals(inputPassword)){
		    	result = "Authentification réussie"; 
		    	GetCurrentConseiller.setIdConseiller(conseiller.getConsFromFirstName(firstName).getIdConseiller());
		    } else {
		    	result = "Mot de passe incorrect"; 
		    }
		    
	    }
	  
	    return result; 
	}
	
	
	public boolean checkAuthBool(String firstName, String inputPassword) throws SQLException {
		
	    GetConseiller conseiller = new GetConseiller(); 
	    
	    boolean result = false;
	    
	    if(conseiller.getConsFromFirstName(firstName) == null) {
	    	System.out.println("couille du néant");
	    	result = false; 
	    } else {
	    	
		    if(conseiller.getConsFromFirstName(firstName).getPassword().equals(inputPassword)){
		    	result = true; 
		    } else {
		    	result = false; 
		    }
		    
	    }
	    
	    
		return result;
		
	}

}
