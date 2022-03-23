package compte;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DbConnection;

public class InsertQueryAccountCourant {
	
	private static Connection conn;
	
	public InsertQueryAccountCourant() throws SQLException {
		DbConnection.connect();
		conn=DbConnection.getConnexion();// conn =  DriverManager.getConnection(url , userName, password);
	}
	
	public void insertQueryAccountCourant(Compte c, CompteCourant ac, int idClient) {
		try {
			PreparedStatement psCompte = conn.prepareStatement("insert into compte (idcompte, idclient, numcompte, soldeactuel, typeofaccount) values (?,?,?,?,?)");
			PreparedStatement psCompteCourant = conn.prepareStatement("insert into comptecourant (idcompte, fraistrans, soldeminautorise) values (?,?,?)"); 
			psCompte.setInt(1, c.getIdCompte());
			psCompte.setInt(2, idClient);
			psCompte.setString(3, c.getNumCompte());
			psCompte.setInt(4, c.getSoldeActuel());
			psCompte.setString(5, "Courant"); 
			psCompteCourant.setInt(1, c.getIdCompte());
			psCompteCourant.setInt(2, ac.getFraisTrans());
			psCompteCourant.setInt(3, ac.getSoldeMinAutorise());
			psCompte.executeUpdate();
			psCompte.close();
			psCompteCourant.executeUpdate(); 
			psCompteCourant.close(); 
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
