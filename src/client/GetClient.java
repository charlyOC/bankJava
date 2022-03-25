package client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DbConnection;

public class GetClient {
	
	private static Connection conn;
	
	public GetClient() {
		try {
			DbConnection.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn=DbConnection.getConnexion();// conn =  DriverManager.getConnection(url , userName, password);
	}
	
	
	public ArrayList<Client> getClientFromIdConseiller(int idConseiller) {
		
		ArrayList<Client> allClients = new ArrayList<Client>(); 
		
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement("select * from client where idconseiller = ?");
			ps.setInt(1, idConseiller);
			
			ResultSet resultat = ps.executeQuery();
			
			while (resultat.next()) {
				
				Client client = new Client(0, null, null, null, null, idConseiller);
				client.setIdClient(resultat.getInt("idclient"));
				client.setNameClient(resultat.getString("nom"));
				client.setFirstNameClient(resultat.getString("prenom"));
				client.setRaisonSociale(resultat.getString("raisonsociale"));
				client.setNumClient(resultat.getString("numclient"));
				client.setIdConseiller(resultat.getInt("idconseiller"));
				allClients.add(client); 
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allClients;
	
}

}