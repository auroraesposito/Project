package com.espo.studenticorsi.services;

import java.util.List;

import com.espo.studenticorsi.entities.Esame;
import com.espo.studenticorsi.entities.Studente;
import com.espo.studenticorsi.entities.StudentiEsami;

public interface ScuolaService {

	void addStudente(Studente s);
	void addEsame(Esame e);
	void addStudenteEsame(StudentiEsami se);
	
	List<Studente> getStudenti();
	List<Esame> getEsami();
	List<StudentiEsami> getStudentiEsami();
	
	List<Esame> getEsameByStudente (Studente s);
	List<Studente> getStudenteByEsame(Esame e);
	
	
}
