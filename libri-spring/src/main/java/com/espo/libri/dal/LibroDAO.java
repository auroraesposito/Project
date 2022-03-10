package com.espo.libri.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espo.libri.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer>{

}
