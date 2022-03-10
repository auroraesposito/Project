package com.sg.webApp.service;

import java.time.LocalDate;
import java.util.List;

import com.sg.webApp.entities.Domanda;
import com.sg.webApp.entities.Persona;
import com.sg.webApp.entities.Test;

public interface webAppService {

	void addDomanda(Domanda d);

	void addTest(Test t);

	void updateDomanda(Domanda d);

	void updateTest(Test t);

	void deleteDomanda(Domanda d);

	void deleteTest(Test t);

	void getTestByData(LocalDate data);

	void getTestByPersona(Persona p);

	Persona getPersonaById(int id);

	List<Domanda> getDomande();

	List<Test> getTests();

}
