package com.espo.concessionariaauto.service;

import java.util.List;

import com.espo.concessionariaauto.entities.Auto;

public interface AutoService {

	List<Auto> getAll();
	Auto getOneById(int id);
	void addAuto(Auto a);
	
}
