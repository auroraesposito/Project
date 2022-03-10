package com.espo.studenticorsi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espo.studenticorsi.dal.EsameDAO;
import com.espo.studenticorsi.dal.StudenteDAO;
import com.espo.studenticorsi.dal.StudentiEsamiDAO;
import com.espo.studenticorsi.entities.Esame;
import com.espo.studenticorsi.entities.Studente;
import com.espo.studenticorsi.entities.StudentiEsami;

@Service
public class ScuolaServiceImpl implements ScuolaService {

	@Autowired
	private StudenteDAO repoStudenti;
	
	@Autowired
	private EsameDAO repoEsami;
	
	@Autowired
	private StudentiEsamiDAO repoStudentiEsami;
	@Override
	public void addStudente(Studente s) {
		// TODO Auto-generated method stub
		repoStudenti.save(s);
	}

	@Override
	public void addEsame(Esame e) {
		// TODO Auto-generated method stub
		repoEsami.save(e);
	}

	@Override
	public void addStudenteEsame(StudentiEsami se) {
		// TODO Auto-generated method stub
		repoStudentiEsami.save(se);
	}

	@Override
	public List<Studente> getStudenti() {
		// TODO Auto-generated method stub
		return repoStudenti.findAll();
	}

	@Override
	public List<Esame> getEsami() {
		// TODO Auto-generated method stub
		return repoEsami.findAll();
	}

	@Override
	public List<StudentiEsami> getStudentiEsami() {
		// TODO Auto-generated method stub
		return repoStudentiEsami.findAll();
	}

	@Override
	public List<Esame> getEsameByStudente(Studente s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Studente> getStudenteByEsame(Esame e) {
		// TODO Auto-generated method stub
		return null;
	}

}
