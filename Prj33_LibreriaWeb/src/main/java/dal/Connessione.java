package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	private final String DB_NAME="tss_2022";
	private final String DRIVER="com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3307/" + DB_NAME;
	private final String USER = "root";
	private final String PASS = "";

	private Connection conn; 
	
	public Connection getConn() {
		
		connetti();
		
		return conn;
	} //per farsi ritornare la connessione, metto privato il metodo connetti, cos� nessuno pu� accedere
	
	private void connetti() {
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(this.conn == null) {
			try {
				this.conn = DriverManager.getConnection(URL, USER, PASS);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println("errore di connessione:" + e.getMessage());
			}
		} else {
			System.out.println("sei connesso");
		}
	}
	
	
	
	
	
	
}
