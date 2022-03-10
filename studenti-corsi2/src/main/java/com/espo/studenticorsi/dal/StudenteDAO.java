package com.espo.studenticorsi.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espo.studenticorsi.entities.Studente;

public interface StudenteDAO extends JpaRepository<Studente, Integer> {
	
	List<Studente> findByEta(int eta);

}
