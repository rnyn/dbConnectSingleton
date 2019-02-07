package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class DBConnect {

	private static DBConnect instance = null;
	private Connection con;
	
	private  DBConnect() {
		try {
			
			con  = DriverManager.getConnection("jdbc:mysql://localhost/java","user","password");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DBConnect getInstance(){
		if(instance == null){
			instance = new DBConnect();
		}
		return instance;
	}
	
	public Connection getConnection(){
		return con;
	}
}
