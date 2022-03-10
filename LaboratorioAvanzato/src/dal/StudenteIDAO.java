package dal;

import java.util.List;

import model.Studente;

public interface StudenteIDAO {

	String CORSO = "TSS2022";
	String TAB = "studenti";
	
	void addStudente(String nome, String cognome);
	List<Studente> getAll();
	Studente getStudenteByMat (int nMatr);
	void updStudente(Studente s);
	void delStudente (int nMatr);
	
	
}
