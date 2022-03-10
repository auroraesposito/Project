package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	//jdbc: java database connection

	private final String DB_URL = "jdbc:mysql://localhost:3307/tss_2022";
	private final String USER = "root";
	private final String PASS = "";
	
	private Connection conn = null;
	
	public Connection connetti() {
		//uso try/catch quando la colpa è nella classe
		try {
			this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("connessione okkk!");
		} catch (SQLException e) {
			System.err.println("Spiacenti, si è verificato un problema di connessione al DB:");
			System.err.println(e.getMessage());
		}
		
		
		return this.conn;
	}
	
	public static void main(String[] args) {
		Connessione c = new Connessione();
		c.connetti();
	}
	
	
}
