package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.Acquisto;
import model.Cliente;
import model.Prodotto;

public class ProdottoDAOImpl implements ProdottoDAO {
	
	private Connessione connessione;
	private Connection conn;
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;

	public ProdottoDAOImpl() {
		this.connessione = new Connessione();
		this.conn = this.connessione.getConn();
	}
	
	
	

	@Override
	public void addProdotto(Prodotto p) throws SQLException {
		this.ps = this.conn.prepareStatement(INSERT_PR);
		this.ps.setInt(1, p.getId());
		this.ps.setString(2, p.getNome());
		this.ps.setDouble(3, p.getPrezzo());

		if (this.ps.execute()) {
			System.out.println("prodotto inserito: " + p);
		}

	}
	
	@Override
	public List<Prodotto> getProdotti() throws SQLException {
		List<Prodotto> prodottiTemp = new ArrayList<Prodotto>();
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ALL_PR);
		while (this.rs.next()) {
			
			Prodotto p = new Prodotto();
			p.setId(rs.getInt("id"));
			p.setNome(rs.getString("nome"));
			p.setPrezzo(rs.getDouble("prezzo"));
			
			prodottiTemp.add(p);
			
		}
		return prodottiTemp;
	}


	@Override
	public Prodotto getprodottoById(int id) throws SQLException {
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ONE_PR + id);
		this.rs.next();

		Prodotto p = new Prodotto();
		p.setId(rs.getInt("id"));
		p.setNome(rs.getString("nome"));
		p.setPrezzo(rs.getDouble("prezzo"));

		return p;
	}

	@Override
	public List<Prodotto> getProdottiByData(LocalDateTime d) throws SQLException {
		List<Prodotto> prodottiTemp = new ArrayList<Prodotto>();
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ONE_PR + d);

		while (this.rs.next()) {

			Prodotto p = new Prodotto();
			p.setId(rs.getInt("id"));
			p.setNome(rs.getString("nome"));
			p.setPrezzo(rs.getDouble("prezzo"));
			prodottiTemp.add(p);
		}

		return prodottiTemp;
	}

	@Override
	public int numAcquistiByProdotto(Prodotto p) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addCliente(Cliente c) throws SQLException {
		this.ps = this.conn.prepareStatement(INSERT_CL);
		this.ps.setInt(1, c.getId());
		this.ps.setString(2, c.getNome());
		this.ps.setString(3, c.getIndirizzo());

		if (this.ps.execute()) {
			System.out.println("cliente inserito: " + c);
		}

	}
	
	@Override
	public List<Cliente> getClienti() throws SQLException {
		List<Cliente> clientiTemp = new ArrayList<Cliente>();
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ALL_CL);
		while (this.rs.next()) {
			
			Cliente c = new Cliente();
			c.setId(rs.getInt("id"));
			c.setNome(rs.getString("nome"));
			c.setIndirizzo(rs.getString("indirizzo"));
			
			clientiTemp.add(c);
			
		}
		return clientiTemp;
	}


	@Override
	public Cliente getClienteById(int id) throws SQLException {
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ONE_CL + id);
		this.rs.next();

		Cliente c = new Cliente();
		c.setId(rs.getInt("id"));
		c.setNome(rs.getString("nome"));
		c.setIndirizzo(rs.getString("indirizzo"));

		return c;
	}

	@Override
	public List<Cliente> getClientiByProdotto(Prodotto p) throws SQLException {
		List<Cliente> clientiTemp = new ArrayList<Cliente>();
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ONE_CL + p);

		while (this.rs.next()) {

			Cliente c = new Cliente();
			c.setId(rs.getInt("id"));
			c.setNome(rs.getString("nome"));
			c.setIndirizzo(rs.getString("prezzo"));
			clientiTemp.add(c);
		}

		return clientiTemp;
	}

	@Override
	public List<Cliente> getClientiByData(LocalDateTime d) throws SQLException {
		List<Cliente> clientiTemp = new ArrayList<Cliente>();
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ONE_CL + d);

		while (this.rs.next()) {

			Cliente c = new Cliente();
			c.setId(rs.getInt("id"));
			c.setNome(rs.getString("nome"));
			c.setIndirizzo(rs.getString("prezzo"));
			clientiTemp.add(c);
		}

		return clientiTemp;
	}

	@Override
	public void addAcquisto(Acquisto a) throws SQLException {
		this.ps = this.conn.prepareStatement(INSERT_ACQ);
		this.ps.setInt(1, a.getId());
		this.ps.setObject(2, a.getData());
		this.ps.setObject(3, a.getProdotti());
		if (this.ps.execute()) {
			System.out.println("cliente inserito: " + a);
		}


	}

	@Override
	public List<Acquisto> getAcquistiByCliente(Cliente c) throws SQLException {
		List<Acquisto> acquistiTemp = new ArrayList<Acquisto>();
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ONE_ACQ + c);

		while (this.rs.next()) {

			Acquisto a = new Acquisto();
			a.setId(rs.getInt("id"));
			//a.setData(rs.getDate("data"));
			//a.setProdotti(rs.getObject("prodotto"));
			acquistiTemp.add(a);
		}

		return acquistiTemp;
	}




	



	
}
