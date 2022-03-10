package com.sg.webApp.service;

import java.util.List;

import com.sg.webApp.entities.Domanda;

public interface DomandaService {

	void addDomanda(Domanda d);

	void updateDomanda(Domanda d);

	void deleteDomanda(int id);

	Domanda getDomandaById(int id);

	List<Domanda> getDomande();

}
