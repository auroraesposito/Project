package com.espo.canzoni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espo.canzoni.dal.CanzoneDAO;
import com.espo.canzoni.entities.Canzone;

@Service
public class CanzoneServiceImpl implements CanzoneService {

	@Autowired
	private CanzoneDAO repo;
	
	
	@Override
	public void addCanzone(Canzone c) {
		this.repo.save(c);
		

	}

	@Override
	public void updCanzone(Canzone c) {
		this.repo.save(c);

	}

	@Override
	public void delCanzone(int id) {
		this.repo.deleteById(id);

	}

	@Override
	public List<Canzone> getCanzoni() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	@Override
	public List<Canzone> getCanzoniByGenere(String genere) {
		// TODO Auto-generated method stub
		return this.repo.findByGenere(genere);
	}

	@Override
	public List<Canzone> getCanzoniByCantante(String cantante) {
		// TODO Auto-generated method stub
		return this.repo.findByCantante(cantante);
	}

	@Override
	public List<Canzone> getCanzoniByTitolo(String titolo) {
		// TODO Auto-generated method stub
		return this.repo.findByTitolo(titolo);
	}

	@Override
	public Canzone getCanzoneById(int id) {
		// TODO Auto-generated method stub
		return this.repo.findById(id);
	}

}
