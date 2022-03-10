package com.espo.alimenti.integration;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.espo.alimenti.entities.Alimento;
import com.espo.alimenti.service.AlimentoService;

@RestController
@RequestMapping({"api", "rest"})
public class AlimentiREST {

	@Autowired
	private AlimentoService service;
	
	@GetMapping()
	public List<Alimento> getAll(){
		return service.getAlimenti();
	}
	
	@GetMapping("{id}")
	public Alimento getById(@PathVariable int id){
		return service.getAlimentoById(id);
	}
	
	@PostMapping
	public void addAlimento(@RequestBody Alimento a) {
		this.service.addAlimento(a);
		this.getAll();
	}
	
	@PutMapping
	public void updAlimento(@RequestBody Alimento a) {
		this.service.updateAlimento(a);
	}
	
	@DeleteMapping("{id}")
	public void deleteAlimento(@PathVariable int id) {
		this.service.deleteAlimento(id);
	}
	
	@GetMapping("/categoria/{cat}")
	public List<Alimento> getByCat(@PathVariable ("cat") String categoria){
		return this.service.getAlimentiByCategoria(categoria);
	}
	
	@GetMapping("/categorie")
	public List<String> getCategorie(){
		return this.service.getCategorie();
	}
	
	@GetMapping("/categorieFunzionali")
	public List<String> getCatFunct(){
		return this.service.getAlimenti()
				.stream()
				.map(a -> a.getCategoria())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
	@GetMapping("/alimentiMAP")
	public Map<Integer, Alimento> getAliMap(){
		return this.service.getAlimentiMap();
	} //ottieni la tabella in json
	
	@GetMapping("/energia/{min}/{max}")
	public List<Alimento> getByEnergia(@PathVariable ("min") int min, @PathVariable ("max") int max){
		return this.service.getAlimentiByEnergia(min, max);
	}
}
