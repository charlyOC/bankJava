package transferts;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import db.DbConnection;

public class AddTransfert {

	
private static Connection conn;
	
	public AddTransfert() throws SQLException {
		DbConnection.connect();
		conn=DbConnection.getConnexion();// conn =  DriverManager.getConnection(url , userName, password)
	}
	
	public void AddTransfert(Transferts t) {
		try {
			PreparedStatement ps = conn.prepareStatement("insert into transfert (idCompte, idCompte_1, montanttransfert, datetransfert) values (?,?,?,?)");
			ps.setInt(1, t.getIdCompte());
			ps.setInt(2, t.getIdCompte_1());
			ps.setFloat(3, t.getMontanttransfert());
			ps.setDate(4, (Date) t.getDatetransfert());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
