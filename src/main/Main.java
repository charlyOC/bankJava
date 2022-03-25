package main;

import java.awt.EventQueue;
import java.util.Scanner;

import Templates.TemplateLogin;
import client.AddClient;
import client.Client;
import client.GetCurrentClient;
import compte.AddCompteCourantFromIdClient;
import compte.AddCompteEpargneFromIdClient;
import conseiller.AddClientFromIdConseiller;
import conseiller.Auth;
import transferts.SaveTransfert;


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
		



		}

	}


