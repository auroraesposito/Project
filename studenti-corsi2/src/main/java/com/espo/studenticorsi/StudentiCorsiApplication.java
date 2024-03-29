package com.espo.studenticorsi;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.espo.studenticorsi.dal.EsameDAO;
import com.espo.studenticorsi.dal.StudenteDAO;
import com.espo.studenticorsi.dal.StudentiEsamiDAO;
import com.espo.studenticorsi.entities.Esame;
import com.espo.studenticorsi.entities.Studente;
import com.espo.studenticorsi.entities.StudentiEsami;

@SpringBootApplication
public class StudentiCorsiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentiCorsiApplication.class, args);
	}

	//@Bean
	public CommandLineRunner demo(StudenteDAO sd, EsameDAO ed, StudentiEsamiDAO sed) {
		return args -> {
			Studente s1 = new Studente("pippo", 20);
			Studente s2 = new Studente("pluto", 21);
			Studente s3 = new Studente("paperina", 20);
			Studente s4 = new Studente("minnie", 21);
			
			sd.save(s1);sd.save(s2);sd.save(s3);sd.save(s4);
			
			Esame e1 = new Esame("matematica 1", "MAT1", 10); 
			Esame e2 = new Esame("lingua ita 1", "ITA1", 10); 
			Esame e3 = new Esame("matematica 2", "MAT2", 12); 
			Esame e4 = new Esame("lingua eng 1", "ENG1", 12); 
			
			Collection<Esame> esami = Arrays.asList(e1,e2, e3, e4);
			ed.saveAll(esami);

			
			StudentiEsami se = new StudentiEsami();
			se.setStudente(s1);
			se.setEsame(e1);
			se.setVoto(25);
			se.setDataEsame(LocalDateTime.now());
			sed.save(se);
			
			/*
			s1.getEsami().add(e1);
			s1.getEsami().add(e2);
			s1.getEsami().add(e4);
			
			s2.getEsami().add(e3);
			s2.getEsami().add(e2);
			s2.getEsami().add(e4);
			
			s3.getEsami().add(e1);
			s3.getEsami().add(e3);
			
			s4.getEsami().add(e4);
			sd.save(s1);sd.save(s2);sd.save(s3);sd.save(s4);*/
		
			
		
		};
		
	}
	
	
}
