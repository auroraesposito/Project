package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Cantante;
import model.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO {
	
	private Connessione connessione;
	private Connection conn;
	private Statement stat; //lo uso quando devo ottenere
	private PreparedStatement ps; //ci permette di scrivere quella query che abbiamo scritto nell'interfaccia
	private ResultSet rs;
	
	public CanzoneDAOImpl() {
		this.connessione = new Connessione();
		this.conn = this.connessione.getConn();
	}
	
	

	@Override
	public void addCanzone(Canzone c) throws SQLException {

		//si usa per evitare SQL injection, usando gli if (ad esempio, "if non mi passi il cantante, metti di default un valore"
		this.ps = this.conn.prepareStatement(INSERT); //uso ps solo quando voglio usare insert o update
		this.ps.setString(1, c.getTitolo());
		this.ps.setString(2, c.getCantante().getNome());
		this.ps.setString(3, c.getGenere());
		this.ps.setInt(4, c.getAnno());
		
		if(this.ps.execute()) {
			System.out.println("canzone inserita: " + c);
		} else {
			
		}
		
	}

	@Override
	public Canzone getCanzoneById(int id) throws SQLException {
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ONE + id);
		this.rs.next(); //perchè torna un solo record, posso evitare il while
		Canzone c = new Canzone();
		c.setId(rs.getInt("id"));
		c.setTitolo(rs.getString("titolo"));
		c.setGenere(rs.getString("genere"));
		c.setAnno(rs.getInt("anno"));
		c.setCantante(new Cantante(0, rs.getString("cantante")));
		
		return c;
	}

	@Override
	public List<Canzone> getCanzoni() throws SQLException {
		
		List<Canzone> canzoniTemp = new ArrayList<Canzone>();
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ALL);
		while (this.rs.next()) {
			
			Canzone c = new Canzone();
			c.setId(rs.getInt("id"));
			c.setTitolo(rs.getString("titolo"));
			c.setGenere(rs.getString("genere"));
			c.setAnno(rs.getInt("anno"));
			c.setCantante(new Cantante(0, rs.getString("cantante")));
			canzoniTemp.add(c);
			
		}
		return canzoniTemp;
		
	}

	@Override
	public List<Canzone> getCanzoniByCantante(Cantante c) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
