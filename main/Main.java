package main;

import java.awt.EventQueue;

import conseiller.AddClientFromIdConseiller;
import conseiller.AuthAndGetClients;
import templates.templateCreationCompteClient;


public class Main {

	
	public static void main(String[] args) {
		System.out.println("Moule à gaufres");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					templateCreationCompteClient frame = new templateCreationCompteClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			
			}
		});
	}

//	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		
//    	AuthAndGetClients auth = new AuthAndGetClients(); 
//    	int idConseiller = auth.AuthAndGetClient();
//    	
//    	AddClientFromIdConseiller addClient = new AddClientFromIdConseiller(); 
//    	addClient.addClientFromIdConseiller(idConseiller);

	    
		

	}


