package com.espo.alimenti.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.espo.alimenti.entities.Alimento;

public interface AlimentoDAO extends JpaRepository<Alimento, Integer>{

	List<Alimento> findByCategoria(String categoria);
	
	@Query(value = "SELECT DISTINCT (categoria) FROM alimenti ORDER BY categoria", nativeQuery = true)
	List<String> trovaCategorie(); //ti restituisce una lista di stringhe della proprietà categoria, da esplicitare sempre il nativeQuery

	
	List<Alimento> findByEnergiaBetweenOrderByEnergiaDesc(int min, int max);





}
