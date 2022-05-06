package com.espo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.espo.entities.Documento;
import com.espo.entities.Viaggio;

@Repository
public interface DocRepo extends JpaRepository<Documento, Integer>{

	//derived query = bisgona scriverle in un certo modo per fargliela fare in automatico
	List<Documento> findByTipo(String tipo);
	
	
	
	
	
}