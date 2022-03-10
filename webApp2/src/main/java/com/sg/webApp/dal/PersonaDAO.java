package com.sg.webApp.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.webApp.entities.Persona;

@Repository
public interface PersonaDAO extends JpaRepository<Persona, Integer> {

}
