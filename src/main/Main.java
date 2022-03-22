package main;

import java.awt.EventQueue;
import java.util.Scanner;

import Templates.TemplateLogin;
import client.AddClient;
import client.Client;
import conseiller.AddClientFromIdConseiller;
import conseiller.Auth;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemplateLogin frame = new TemplateLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
//    	AuthAndGetClients auth = new AuthAndGetClients(); 
//    	int idConseiller = auth.AuthAndGetClient();
//    	
//    	AddClientFromIdConseiller addClient = new AddClientFromIdConseiller(); 
//    	addClient.addClientFromIdConseiller(idConseiller);

	    
		}

	}


