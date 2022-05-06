package com.espo.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Demo {

	@Id
	private int id;
	private String nome;
	
	
}
