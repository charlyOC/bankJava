package transferts;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class SaveTransfert {

	public void saveTransfert(int idCompte,int idCompte_1 ) {
		
		Transferts transferts = new Transferts(idCompte, idCompte_1, 0, null);
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez un montant");
		float montant = sc.nextInt();
		
		System.out.println();
		
		Date date =java.sql.Date.valueOf(LocalDate.now());
		
		transferts.setMontanttransfert(montant);
		transferts.setDatetransfert(date);
		
		
	}
	
}
