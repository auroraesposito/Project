package service;

import java.util.List;

import dal.RicettaDAO;
import model.Ricetta;

public class RicetteService implements RicettaIService {
	
	RicettaDAO repo = new RicettaDAO();

	@Override
	public void addRicetta(Ricetta r) {
		repo.addRicetta(r);
		
	}

	@Override
	public void addRicetta(String nome, String regione) {
		repo.addRicetta(nome, regione);		
	}

	@Override
	public Ricetta getRicettaById(int id) {
		// TODO Auto-generated method stub
		return repo.getRicettaById(id);
	}

	@Override
	public List<Ricetta> getAll() {
		// TODO Auto-generated method stub
		return repo.getAll();
	}

	@Override
	public List<Ricetta> getAllByRegione(String regione) {
		// TODO Auto-generated method stub
		return repo.getAllByRegione(regione);
	}

	@Override
	public void updateRicetta(Ricetta r) {
		repo.updateRicetta(r);		
	}

	@Override
	public void deleteRicetta(int id) {
		// TODO Auto-generated method stub
		repo.deleteRicetta(id);
	}
	
	

}
