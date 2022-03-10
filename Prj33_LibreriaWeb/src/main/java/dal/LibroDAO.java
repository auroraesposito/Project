package dal;

import java.util.List;

import entities.Libro;

public interface LibroDAO {

	
	String ALL = "select * from libro";
	String ONE = "select * from libro where id = ?";
	String INSERT = "insert into libro (titolo, prezzo, pagine, editore_id) values (?, ?, ?, ?)";
	
	List<Libro> getAll();
	Libro getLibroById (int id);
	void addLibro (Libro l);
	
	
	
	
}
