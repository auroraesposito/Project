package dal;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import model.Acquisto;
import model.Cliente;
import model.Prodotto;

public interface ProdottoDAO {
	
	String ALL_PR = "select* from prodotti";
	String ONE_PR = "select* from prodotti WHERE id=  ";
	String INSERT_PR = "insert into prodotti (nome, prezzo) values(?,?)";
	
	void addProdotto(Prodotto p) throws SQLException;
	List<Prodotto> getProdotti() throws SQLException;
	Prodotto getprodottoById(int id) throws SQLException;
	List<Prodotto> getProdottiByData(LocalDateTime d) throws SQLException;
	int numAcquistiByProdotto(Prodotto p) throws SQLException;
	
	String ALL_CL = "select* from clienti";
	String ONE_CL = "select* from clienti WHERE id=  ";
	String INSERT_CL = "insert into clienti (nome, indirizzo) values(?,?)";
	
	void addCliente(Cliente c) throws SQLException;
	List<Cliente> getClienti() throws SQLException;
	Cliente getClienteById(int id) throws SQLException;
	List<Cliente> getClientiByProdotto(Prodotto p) throws SQLException;
	List<Cliente> getClientiByData(LocalDateTime d) throws SQLException;
	
	String ALL_ACQ = "select* from acquisti";
	String ONE_ACQ = "select* from acquisti WHERE id=  ";
	String INSERT_ACQ = "insert into acquisti (data, prodotti) values(?,?)";
	
	void addAcquisto(Acquisto a) throws SQLException;
	List<Acquisto> getAcquistiByCliente(Cliente c) throws SQLException;
	
	

}
