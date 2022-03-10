package com.espo.alimenti.service;

import java.util.List;
import java.util.Map;

import com.espo.alimenti.entities.Alimento;

public interface AlimentoService {

	void addAlimento(Alimento a);
	void updateAlimento (Alimento a);
	void deleteAlimento(int id);
	
	Alimento getAlimentoById(int id);
	List<Alimento> getAlimenti();
	List<Alimento> getAlimentiByCategoria(String categoria);
	List<Alimento> getAlimentiByEnergia(int min, int max);
	
	List<String> getCategorie();
	Map<Integer, Alimento> getAlimentiMap();
	
	
}
