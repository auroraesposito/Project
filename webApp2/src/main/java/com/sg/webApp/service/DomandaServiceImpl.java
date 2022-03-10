package com.sg.webApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.webApp.dal.DomandaDAO;
import com.sg.webApp.entities.Domanda;

@Service
public class DomandaServiceImpl implements DomandaService {

	@Autowired
	private DomandaDAO repo;

	@Override
	public void addDomanda(Domanda d) {
		repo.save(d);
	}

	@Override
	public void updateDomanda(Domanda d) {
		repo.save(d);

	}

	@Override
	public void deleteDomanda(int id) {
		repo.deleteById(id);

	}

	@Override
	public Domanda getDomandaById(int id) {
		if (repo.findById(id).isPresent())
			return repo.findById(id).get();
		else
			return new Domanda();
	}

	@Override
	public List<Domanda> getDomande() {
		return repo.findAll();
	}

}
