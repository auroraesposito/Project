package controller;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import dal.ProdottoDAO;
import dal.ProdottoDAOImpl;
import model.Acquisto;
import model.Cliente;
import model.Prodotto;


public class GestioneNegozioImpl implements GestioneNegozio {
	
	private ProdottoDAO repo;
	
	public GestioneNegozioImpl() {
		this.repo = new ProdottoDAOImpl();
		
	}
	
	

	@Override
	public void addProdotto(Prodotto p) {
		try {
			this.repo.addProdotto(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Prodotto getprodottoById(int id)  {
		try {
			this.repo.getprodottoById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} return null;
	}

	@Override
	public List<Prodotto> getProdottiByData(LocalDateTime d) {
		try {
			this.repo.getProdottiByData(d);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int numAcquistiByProdotto(Prodotto p) {
	
		return 0;
	}

	@Override
	public void addCliente(Cliente c)  {
		try {
			this.repo.addCliente(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Cliente getClienteById(int id)  {
		try {
			this.repo.getClienteById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> getClientiByProdotto(Prodotto p)  {
		try {
			this.repo.getClientiByProdotto(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> getClientiByData(LocalDateTime d)  {
		try {
			this.repo.getClientiByData(d);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addAcquisto(Acquisto a)  {
		try {
			this.repo.addAcquisto(a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Acquisto> getAcquistiByCliente(Cliente c)  {
		try {
			this.repo.getAcquistiByCliente(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}



	public List<Prodotto> TuttiProdotti() {
		
		try {
			return this.repo.getProdotti();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} return null;
	}



	@Override
	public List<Cliente> TuttiClienti() {
		try {
			return this.repo.getClienti();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} return null;
	}
	
}
	

