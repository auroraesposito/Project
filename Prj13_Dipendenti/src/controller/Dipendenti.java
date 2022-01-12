package controller;

import java.util.ArrayList;

import model.Dipendente;

public class Dipendenti {
	
	private ArrayList<Dipendente> libromatricola;

	public Dipendenti() {
		this.libromatricola = new ArrayList<>();
	}
	
	public void addDipendente(Dipendente d) {
		this.libromatricola.add(d);
	}
	
	public ArrayList<Dipendente> getLibromatricola() {
		return libromatricola;
	}
	
	public Dipendente getDipendenteById(int mat) {
		for (Dipendente dipendente : libromatricola) {
			if (dipendente.getMatricola() == mat) {
				return dipendente;
			}
		}
		return null;
	}
	

}
