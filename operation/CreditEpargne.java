package operation;

import java.sql.SQLException;
import java.util.Scanner;

import compte.Compte;
import compte.CompteEpargne;



public class CreditEpargne {


	
// On passe � l'epargne o� il va falloir checker si le plafond est atteint
	private boolean plafondM(double montant, Compte compte, CompteEpargne plafond) {
		if (compare = compte.getSoldeActuel() < plafond) {
			return true;
	} else {
		return false;
	}
		
}
	public void crediterEpargne(double montant, Compte compte) {

		if (plafondM == true) {
			
	
				double fce = compte.getSoldeActuel() + montant;
//				montant += montant;
				
				System.out.println("Le compte �pargne a �t� cr�dit� de " + montant + "�");
				

			}

					
	}else {
		System.out.println("Le plafond du compte a �t� atteint. Le transfert n'a pas pu �tre �f�fctu�");
		
	}
	}
	
