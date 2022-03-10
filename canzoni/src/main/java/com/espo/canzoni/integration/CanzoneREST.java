package com.espo.canzoni.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.espo.canzoni.entities.Canzone;
import com.espo.canzoni.service.CanzoneService;

@RestController
@RequestMapping("api")
public class CanzoneREST {

	@Autowired
	private CanzoneService service;
	
	@GetMapping
	public List<Canzone> getAll() {
		return this.service.getCanzoni();
	}
	
	@GetMapping("genere/{gen}")
	public List<Canzone> getByGenere(@PathVariable String gen) {
		return this.service.getCanzoni();
	}
	
	@GetMapping("canzone/{id}")
	public Canzone getCanzone(@PathVariable int id) {
		if(this.service.getCanzoneById(id).isPresent())
		return this.service.getCanzoneById(id).get();
		else
			return new Canzone();
	}
}
