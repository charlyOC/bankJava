package operation;

import java.sql.SQLException;
import java.util.Scanner;

public class CreditCourant {

	public static void main (String[] args) throws SQLException{
// On va séparer entre créditer courant et créditer Epargne
	
// Le courant est le plus simple car il n'y a pas de plafond
	public void crediterCourant (double montant; Compte compte ) {
		
		montant += montant;
		
		System.out.println("Le compte courant a été débité de " + montant + "€");
		

	}

	
}
}