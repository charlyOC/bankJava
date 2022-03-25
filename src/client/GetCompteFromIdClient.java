package client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import compte.Compte;
import db.DbConnection;

public class GetCompteFromIdClient {
	private static Connection conn;
	
	public GetCompteFromIdClient() {
		try {
			DbConnection.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn=DbConnection.getConnexion();// conn =  DriverManager.getConnection(url , userName, password);
	}
	
	public ArrayList<Compte> getCompteFromIdClient(int idClient) {
		
		ArrayList<Compte> allCompte = new ArrayList<Compte>(); 
		
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement("select * from compte where idclient = ?");
			ps.setInt(1, idClient);
			
			ResultSet resultat = ps.executeQuery();
			
			while (resultat.next()) {
				
				Compte compte = new Compte();
				compte.setIdCompte(resultat.getInt("idcompte"));
				compte.setIdClient(resultat.getInt("idclient"));
				compte.setNumCompte(resultat.getString("numcompte"));
				compte.setSoldeActuel(resultat.getInt("soldeactuel"));
				compte.setTypeOfAccount(resultat.getString("typeofaccount"));
				allCompte.add(compte); 
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allCompte; 
}
}
