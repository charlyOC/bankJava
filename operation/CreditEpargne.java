package operation;

public class CreditEpargne {}

// On passe � l'epargne o� il va falloir checker si le plafond est atteint
	private boolean plafondatteint(double montant, Compte compte, double plafond) {
		if (compte.getSoldeActuel() > plafond) {
			return true;
	} else {
		return false;
	}
		
}
	public void crediterEpargne(double montant, Compte compte) {

		if (plafondatteint(double montant, Compte compte, double plafond)==false) {
			
			montant += montant 
					
	}else {
		System.out.println("Le plafond du compte a �t� atteint. Le transfert n'a pas pu �tre �f�fctu�");
		
	}
	}
