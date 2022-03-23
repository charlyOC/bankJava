package main;

import java.util.Scanner;

import transferts.SaveTransfert;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		
//    	AuthAndGetClients auth = new AuthAndGetClients(); 
//    	int idConseiller = auth.AuthAndGetClient();
//    	
//    	AddClientFromIdConseiller addClient = new AddClientFromIdConseiller(); 
//    	addClient.addClientFromIdConseiller(idConseiller);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez un premier compte");
		int idCompte_1 = sc.nextInt();
		
		System.out.println("entrez un deuxieme compte");
		int idCompte = sc.nextInt();

//		AddTransfert addT = new AddTransfert();
//		addT.AddTransfert(idCompte_1, idCompte);
		
		SaveTransfert st = new SaveTransfert();
		
		st.saveTransfert(idCompte, idCompte_1);
	}

}
