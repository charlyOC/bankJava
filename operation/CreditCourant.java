package operation;

import java.sql.SQLException;
import java.util.Scanner;

import compte.Compte;

public class CreditCourant {


// On va s�parer entre cr�diter courant et cr�diter Epargne
	
// Le courant est le plus simple car il n'y a pas de plafond
	
		// On va recherche l'idCompte pour viser le bon compte
	// Puis on fera un return dessus
	public void recupCurrentCC(int idCompte, Compte compte) {
			int rcc = compte.getIdCompte();
	}
	 
	
	public void crediterCourant(double montant, Compte compte) {
		 
		double fcc = compte.getSoldeActuel() + montant;
//		montant += montant;
		
		System.out.println("Le compte courant a �t� cr�dit� de " + montant + "�");
		

	}

	
}
