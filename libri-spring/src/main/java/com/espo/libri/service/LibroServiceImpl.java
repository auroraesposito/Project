package com.espo.libri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espo.libri.dal.LibroDAO;
import com.espo.libri.entities.Libro;

@Service
public class LibroServiceImpl implements LibroService {
	@Autowired
	private LibroDAO repo;
	
	
	
	@Override
	public List<Libro> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Libro getLibroById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void addLibro(Libro l) {
		repo.save(l);

	}

}
