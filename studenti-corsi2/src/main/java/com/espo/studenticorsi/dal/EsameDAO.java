package com.espo.studenticorsi.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espo.studenticorsi.entities.Esame;
import com.espo.studenticorsi.entities.Studente;

public interface EsameDAO extends JpaRepository<Esame, Integer> {
	
	List<Esame> findByCrediti(int crediti);
	List<Esame> findByNomeContaining(String nome);

}
