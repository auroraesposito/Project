package com.espo.concessionariaauto.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espo.concessionariaauto.entities.Auto;

public interface AutoDAO extends JpaRepository<Auto, Integer>{

}
