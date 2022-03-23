package main;

import java.awt.EventQueue;
import java.util.Scanner;

import Templates.TemplateLogin;
import client.AddClient;
import client.Client;
import compte.AddCompteCourantFromIdClient;
import compte.AddCompteEpargneFromIdClient;
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
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Entrez un id Client");
	    int idClient = sc.nextInt(); 
		
//    	AuthAndGetClients auth = new AuthAndGetClients(); 
//    	int idConseiller = auth.AuthAndGetClient();
//    	
//    	AddClientFromIdConseiller addClient = new AddClientFromIdConseiller(); 
//    	addClient.addClientFromIdConseiller(idConseiller);
		
		AddCompteEpargneFromIdClient addCompteEpargne = new AddCompteEpargneFromIdClient(); 
		addCompteEpargne.addCompteEpargneFromIdClient(idClient);


		}

	}


