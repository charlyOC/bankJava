package main;

import java.awt.EventQueue;

import Templates.TemplateListeClientsForm;

import conseiller.AddClientFromIdConseiller;
import conseiller.AuthAndGetClients;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemplateListeClientsForm frame = new TemplateListeClientsForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
    	AuthAndGetClients auth = new AuthAndGetClients(); 
    	int idConseiller = auth.AuthAndGetClient();
    	
    	AddClientFromIdConseiller addClient = new AddClientFromIdConseiller(); 
    	addClient.addClientFromIdConseiller(idConseiller);

	    
		}
	}


