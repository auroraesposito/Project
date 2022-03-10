package com.espo.canzoni.service;

import java.util.List;

import com.espo.canzoni.entities.Canzone;

public interface CanzoneService {
	
	void addCanzone(Canzone c);
	void updCanzone(Canzone c);
	void delCanzone(int id);

	List<Canzone> getCanzoni();
	List<Canzone> getCanzoniByGenere(String genere);
	List<Canzone> getCanzoniByCantante(String cantante);
	List<Canzone> getCanzoniByTitolo(String titolo);
	
	Canzone getCanzoneById(int id);
	
}
