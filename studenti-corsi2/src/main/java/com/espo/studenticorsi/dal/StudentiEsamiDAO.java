package com.espo.studenticorsi.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espo.studenticorsi.entities.Esame;
import com.espo.studenticorsi.entities.Studente;
import com.espo.studenticorsi.entities.StudentiEsami;

public interface StudentiEsamiDAO extends JpaRepository<StudentiEsami, Integer> {
	
	

}
