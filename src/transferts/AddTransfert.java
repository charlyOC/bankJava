package transferts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import db.DbConnection;

public class AddTransfert {

	
private static Connection conn;
	
	public AddTransfert() throws SQLException {
		DbConnection.connect();
		conn=DbConnection.getConnexion();// conn =  DriverManager.getConnection(url , userName, password);
	
	}
	
	public void AddTransfert(int IdCompte,int IdCompte_1, Transferts t) {
		try {
			PreparedStatement ps = conn.prepareStatement("insert into transfert (idCompte, idCompte_1, montanttransfert, datetransfert) values (?,?,?,?)");
			ps.setInt(1, IdCompte);
			ps.setInt(2, IdCompte_1);
			ps.setFloat(3,t.getMontanttransfert());
			ps.setDate(4, java.sql.Date.valueOf(LocalDate.now()));
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

