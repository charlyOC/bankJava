package client;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DbConnection;

public class Getclient {

	private static Connection conn;
	
	public void GetClient() throws SQLException {
		DbConnection.connect();
		conn=DbConnection.getConnexion();// conn =  DriverManager.getConnection(url , userName, password);
	
	}
	
	public ArrayList<Client> getClientFromIdConseiller(int idConseiller){
		
		ArrayList<Client> AllClients = new ArrayList<Client>() ;
		
		
		try {
			
			catch{
				
			} finally {
				
			}
		}
		
		
		return AllClients;
		}
		
	}

