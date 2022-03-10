package com.espo.libri.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.espo.libri.entities.Libro;
import com.espo.libri.service.LibroService;

@RestController
@RequestMapping("api/libri")
public class LibroREST {
	
	@Autowired
	LibroService service;
	
	@GetMapping
	public List<Libro> getall() {
		return service.getAll();
	}

}
