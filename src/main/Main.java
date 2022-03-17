package main;

import java.util.Scanner;

import javax.swing.*;

import client.AddClient;
import client.Client;
import conseiller.AddClientFromIdConseiller;
import conseiller.AuthAndGetClients;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
    	AuthAndGetClients auth = new AuthAndGetClients(); 
    	int idConseiller = auth.AuthAndGetClient();
    	
    	AddClientFromIdConseiller addClient = new AddClientFromIdConseiller(); 
    	addClient.addClientFromIdConseiller(idConseiller);

	    
		}

	}


