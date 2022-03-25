package transferts;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import client.AddClient;

public class SaveTransfert {

	public void saveTransfert(int idCompte,int idCompte_1) throws SQLException {
		
		Transferts transferts = new Transferts(idCompte, idCompte_1, 0, null);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez un montant");
		float montant = sc.nextInt();
		
		
		Date date = java.sql.Date.valueOf(LocalDate.now());
		
		transferts.setMontanttransfert(montant);
		transferts.setDatetransfert(date);
		
	    AddTransfert request = new AddTransfert(); 
	    request.AddTransfert(transferts);
		
	}
	
}