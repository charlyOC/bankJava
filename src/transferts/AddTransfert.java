package transferts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DbConnection;

public class AddTransfert {

	
private static Connection conn;
	
	public AddTransfert() throws SQLException {
		DbConnection.connect();
		conn=DbConnection.getConnexion();// conn =  DriverManager.getConnection(url , userName, password);
	}
	
	public void AddTransfert() {
		try {
			PreparedStatement ps = conn.prepareStatement("insert into transfert (idCompte, idCopmte_1, montanttransfert, datetransfert) values (?,?,?,?)");
			ps.setInt(1, c.getIdCompte());
			ps.setString(2, c.getIdCompte_1d());
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

