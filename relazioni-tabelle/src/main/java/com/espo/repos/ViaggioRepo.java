package com.espo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.espo.entities.Viaggio;

@Repository
public interface ViaggioRepo extends JpaRepository<Viaggio, Integer>{

	//derived query = bisgona scriverle in un certo modo per fargliela fare in automatico
	List<Viaggio> findByDestinazione (String destinazione);
	
	
	
	
}