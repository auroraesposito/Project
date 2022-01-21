package controller;

import java.util.ArrayList;

import model.Libro;

public class LibriCtrl {

	private ArrayList<Libro> libri;

	public LibriCtrl() {
		this.libri = new ArrayList<>();

		init();
	}

	public void init() {
		this.libri.add(new Libro("Vita", 10));
		this.libri.add(new Libro("Bici", 20));
		this.libri.add(new Libro("Camper", 12));
		this.libri.add(new Libro("Albero", 26));
		this.libri.add(new Libro("Italia", 5));
	}

	public void addLibro(String titolo, double prezzo) {

		Libro l = new Libro(titolo, prezzo);

		this.libri.add(l);
	}

	public ArrayList<Libro> getLibri() {
		return libri;
	}

}
