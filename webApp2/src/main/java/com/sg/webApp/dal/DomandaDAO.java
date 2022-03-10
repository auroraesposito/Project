package com.sg.webApp.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.webApp.entities.Domanda;

@Repository
public interface DomandaDAO extends JpaRepository<Domanda, Integer> {

}
