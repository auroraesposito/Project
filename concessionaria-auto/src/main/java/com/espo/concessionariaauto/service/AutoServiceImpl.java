package com.espo.concessionariaauto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espo.concessionariaauto.dal.AutoDAO;
import com.espo.concessionariaauto.entities.Auto;

@Service
public class AutoServiceImpl implements AutoService{

	@Autowired
	private AutoDAO repo;
	
	

	@Override
	public List<Auto> getAll() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	@Override
	public Auto getOneById(int id) {
		// TODO Auto-generated method stub
		return this.repo.getById(id);
	}

	@Override
	public void addAuto(Auto a) {
		this.repo.save(a);
		
	}
}
