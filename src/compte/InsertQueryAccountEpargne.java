package compte;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DbConnection;

public class InsertQueryAccountEpargne {
	private static Connection conn;
	
	public InsertQueryAccountEpargne() throws SQLException {
		DbConnection.connect();
		conn=DbConnection.getConnexion();// conn =  DriverManager.getConnection(url , userName, password);
	}
	
	public void insertQueryAccountEpargne(Compte c, CompteEpargne ac, int idClient) {
		try {
			PreparedStatement psCompte = conn.prepareStatement("insert into compte (idcompte, idclient, numcompte, soldeactuel, typeofaccount) values (?,?,?,?,?)");
			PreparedStatement psCompteCourant = conn.prepareStatement("insert into compte_epargne (idcompte, tauxint, plafond) values (?,?,?)"); 
			psCompte.setInt(1, c.getIdCompte());
			psCompte.setInt(2, idClient);
			psCompte.setString(3, c.getNumCompte());
			psCompte.setInt(4, c.getSoldeActuel());
			psCompte.setString(5, "Epargne"); 
			psCompteCourant.setInt(1, c.getIdCompte());
			psCompteCourant.setInt(2, ac.getTauxInt());
			psCompteCourant.setInt(3, ac.getPlafond());
			psCompte.executeUpdate();
			psCompte.close();
			psCompteCourant.executeUpdate(); 
			psCompteCourant.close(); 
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
