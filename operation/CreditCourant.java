package operation;

import java.sql.SQLException;
import java.util.Scanner;

public class CreditCourant {

	public static void main (String[] args) throws SQLException{
// On va s�parer entre cr�diter courant et cr�diter Epargne
	
// Le courant est le plus simple car il n'y a pas de plafond
	public void crediterCourant (double montant; Compte compte ) {
		
		montant += montant;
		
		System.out.println("Le compte courant a �t� d�bit� de " + montant + "�");
		

	}

	
}
}