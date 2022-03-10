package controller;

import java.util.List;

import dal.StudenteDAOImpl;
import dal.StudenteIDAO;
import model.Studente;

public class Registro {

	private StudenteIDAO repo = new StudenteDAOImpl();
	
	public List<Studente> tuttiGliStudenti() {
		return repo.getAll();
	}
	
	
}
