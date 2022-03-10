package dal;

import java.sql.SQLException;
import java.util.List;

import model.Canzone;

public interface CanzoneDAO {

	String GET_ALL = "select * from canzoni";
	
	//Update al db
	void addCanzone(Canzone c) throws SQLException;
	void addCanzone(String titolo, String cantante, String genere) throws SQLException;
	void updCanzone(Canzone c) throws SQLException;
	void delCanzone(int id) throws SQLException;
	
	//query
	Canzone getCanzoneById(int id) throws SQLException;
	Canzone getCanzoneByTitolo(String titolo) throws SQLException;
	List<Canzone> getCanzoni() throws SQLException;
	
	
	
	
}
