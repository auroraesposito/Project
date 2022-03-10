package db;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dal.CanzoneDAO;
import dal.CanzoneDAOImpl;
import model.Canzone;

public class OperazioniDB {
	
	private static Connection conn;
	private static Connessione miaConn;
	
	private static Statement stat;
	
	private static Scanner sc;
	
	//lo statement è quello che mi serve pr dare una query
	private static void  esegui(String query) {
		
		miaConn = new Connessione();
		conn = miaConn.connetti();
		try {
			stat = conn.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
	}
	
	public static void ricreaTabella() {
		
		File f;
		f = new File ("files/create_table_canzoni.txt");
		try {
			sc = new Scanner(f);
			String query = "";
			while(sc.hasNextLine()) {
				query += sc.nextLine();
			}
			esegui(query);
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	public void riempiTabella(String nomeFile, int anno) {
		
		File f;
		f = new File (nomeFile);
		try {
			sc = new Scanner(f);
			String query = "";
			
			while(sc.hasNextLine()) {
				String[] riga = sc.nextLine().split("|");
				String titolo = riga[0];
				String cantante = riga[1];
				
				Canzone c = new Canzone(titolo, cantante, "pop", anno);
				
				CanzoneDAO cd = new CanzoneDAOImpl();
				cd.addCanzone(c);
				
				
			}
			System.out.println("importazione terminata");
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
		
		
		
	}
	
	
	

}
