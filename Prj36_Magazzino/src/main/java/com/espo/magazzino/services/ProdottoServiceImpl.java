package com.espo.magazzino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espo.magazzino.dal.ProdottoDAO;
import com.espo.magazzino.entities.Prodotto;

@Service
public class ProdottoServiceImpl implements ProdottoService {
	
	@Autowired
	private ProdottoDAO repo;

	@Override
	public void addProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		repo.save(p);
	}

	@Override
	public void updProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		repo.save(p);
	}

	@Override
	public void delProdotto(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Prodotto getProdottoById(int id) {
		
		if(repo.findById(id).isPresent())
			return repo.findById(id).get();
		return null;
		
		
	}

	@Override
	public List<Prodotto> getProdotti() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Prodotto> getProdottiByMinMax(int min, int max) {
		// TODO Auto-generated method stub
		return repo.findByQuantitaBetween(min, max);
	}

}
