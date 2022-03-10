package com.espo.studenticorsi.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.espo.studenticorsi.entities.Esame;
import com.espo.studenticorsi.entities.Studente;
import com.espo.studenticorsi.entities.StudentiEsami;
import com.espo.studenticorsi.services.ScuolaService;

@RestController
@RequestMapping("api")
public class ScuolaREST {
	
	@Autowired
	private ScuolaService service;
	
	@GetMapping("studenti")
	public List<Studente> getStudenti() {
		return service.getStudenti();
	}
	
	@GetMapping("esami")
	public List<Esame> getEsami() {
		return service.getEsami();
	}
	
	@GetMapping("studentiesami")
	public List<StudentiEsami> getStudentiEsami() {
		return service.getStudentiEsami();
	}
	
	
}
