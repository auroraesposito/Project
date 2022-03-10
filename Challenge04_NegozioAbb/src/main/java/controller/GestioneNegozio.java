package controller;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import model.Acquisto;
import model.Cliente;
import model.Prodotto;

public interface GestioneNegozio {
	
	public List<Prodotto> TuttiProdotti();
	public List<Cliente> TuttiClienti();
	
	void addProdotto(Prodotto p) throws SQLException;
	Prodotto getprodottoById(int id) throws SQLException;
	List<Prodotto> getProdottiByData(LocalDateTime d) throws SQLException;
	int numAcquistiByProdotto(Prodotto p) throws SQLException;
	
	void addCliente(Cliente c) throws SQLException;
	Cliente getClienteById(int id) throws SQLException;
	List<Cliente> getClientiByProdotto(Prodotto p) throws SQLException;
	List<Cliente> getClientiByData(LocalDateTime d) throws SQLException;
	
	void addAcquisto(Acquisto a) throws SQLException;
	List<Acquisto> getAcquistiByCliente(Cliente c) throws SQLException;
	

}
