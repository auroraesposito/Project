package com.espo.libri.service;

import java.util.List;

import com.espo.libri.entities.Libro;

public interface LibroService {

	List<Libro> getAll();
	Libro getLibroById (int id);
	void addLibro (Libro l);
	
}
