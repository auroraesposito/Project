package com.sg.webApp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.webApp.dal.DomandaDAO;
import com.sg.webApp.dal.PersonaDAO;
import com.sg.webApp.dal.TestDAO;
import com.sg.webApp.entities.Domanda;
import com.sg.webApp.entities.Persona;
import com.sg.webApp.entities.Test;

@Service
public class webAppServiceImpl implements webAppService {

	@Autowired
	private DomandaDAO repoDomanda;
	private PersonaDAO repoPersona;
	private TestDAO repoTest;

	@Override
	public void addDomanda(Domanda d) {
		this.repoDomanda.save(d);

	}

	@Override
	public void addTest(Test t) {
		this.repoTest.save(t);

	}

	@Override
	public void updateDomanda(Domanda d) {
		this.repoDomanda.save(d);

	}

	@Override
	public void updateTest(Test t) {
		this.repoTest.save(t);

	}

	@Override
	public void deleteDomanda(Domanda d) {
		this.repoDomanda.delete(d);

	}

	@Override
	public void deleteTest(Test t) {
		this.repoTest.delete(t);

	}

	@Override
	public void getTestByData(LocalDate data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getTestByPersona(Persona p) {

	}

	@Override
	public Persona getPersonaById(int id) {
		// TODO Auto-generated method stub
		return this.repoPersona.getById(id);
	}

	@Override
	public List<Domanda> getDomande() {
		// TODO Auto-generated method stub
		return this.repoDomanda.findAll();
	}

	@Override
	public List<Test> getTests() {
		// TODO Auto-generated method stub
		return this.repoTest.findAll();
	}

}
