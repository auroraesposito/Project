package dal;

import java.util.List;

import model.Ricetta;

public interface RicettaIDAO {
	
	String MESSAGGIO = "Le ricette di pippo";

	//CREATE
		void addRicetta (Ricetta r);
		void addRicetta (String nome, String regione);
		
		//READ
		Ricetta getRicettaById(int id);
		List<Ricetta> getAll();
		List<Ricetta> getAllByRegione(String regione);
		
		
		//UPDATE
		void updateRicetta(Ricetta r);
		
		//DELETE
		void deleteRicetta(int id);
		
	
}
