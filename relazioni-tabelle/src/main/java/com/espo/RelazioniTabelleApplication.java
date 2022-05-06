package com.espo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.espo.entities.Documento;
import com.espo.entities.Viaggio;
import com.espo.repos.DocRepo;
import com.espo.repos.ViaggioRepo;

@SpringBootApplication
public class RelazioniTabelleApplication {

	@Autowired
	private ViaggioRepo repoV;
	
	@Autowired
	private DocRepo repoD;
	
	
	public static void main(String[] args) {
		SpringApplication.run(RelazioniTabelleApplication.class, args);
	}

	@Bean
	public CommandLineRunner esempio1() {
		
		return a-> {
			
			Viaggio v = new Viaggio();
			v.setDestinazione("Roma");
			
			Documento d = new Documento();
			d.setNome("locandina Roma");
			d.setTipo("pdf");
			d.setPath("/docs/locandina.pdf");
			
			repoV.save(v);
			repoD.save(d);
			
			v.getDocumenti().add(d);
			repoV.save(v);
		};
	
	}
}
