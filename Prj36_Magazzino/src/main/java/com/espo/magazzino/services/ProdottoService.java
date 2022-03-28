package com.espo.magazzino.services;

import java.util.List;

import com.espo.magazzino.entities.Prodotto;


public interface ProdottoService {

	void addProdotto(Prodotto p);
	void updProdotto(Prodotto p);
	void delProdotto(int id);

	Prodotto getProdottoById(int id);
	List<Prodotto> getProdotti();
	List<Prodotto> getProdottiByMinMax(int min, int max);
	
	
	
	
	
}
