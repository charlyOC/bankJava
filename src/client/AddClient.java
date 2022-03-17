package client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DbConnection;


public class AddClient {
	
	private static Connection conn;
	
	public AddClient() throws SQLException {
		DbConnection.connect();
		conn=DbConnection.getConnexion();// conn =  DriverManager.getConnection(url , userName, password);
	}
	

	public void addClient(Client c, int idConseiller) {
		try {
			PreparedStatement ps = conn.prepareStatement("insert into client (idclient, nom, prenom, raisonsociale, numclient, idconseiller) values (?,?,?,?,?,?)");
			ps.setInt(1, c.getIdClient());
			ps.setString(2, c.getNameClient());
			ps.setString(3, c.getFirstNameClient());
			ps.setString(4, c.getRaisonSociale());
			ps.setString(5, c.getNumClient());
			ps.setInt(6, idConseiller);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
