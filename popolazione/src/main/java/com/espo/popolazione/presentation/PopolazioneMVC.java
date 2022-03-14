package com.espo.popolazione.presentation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.espo.popolazione.entities.Provincia;
import com.espo.popolazione.service.PopolazioneService;

@Controller
@RequestMapping("")
public class PopolazioneMVC {

	@Autowired
	private PopolazioneService service;
	
	@GetMapping("regione/{regione}")
	public String getProvinceByRegione(@PathVariable String regione, Model m){
		
		List<Provincia> provinciaByRegione = service.getProvinciaByRegione(regione);
		m.addAttribute("province", provinciaByRegione);
		m.addAttribute("regione", regione);
		
		System.out.println(provinciaByRegione);
		return "province";
	}
	
	
	
	@GetMapping("regioni")
	public String getRegioni(Model m){
		
		List<String> regioni = service.getProvincia().stream()
									.map(r -> r.getRegione())
									.distinct()
									.sorted()
									.collect(Collectors.toList());
		
		m.addAttribute("regioni", regioni);
		
		return "regioni";
	}
	
	
	
	
	
	
}
