package com.espo.magazzino.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.espo.magazzino.entities.Prodotto;
import com.espo.magazzino.services.ProdottoService;

@RestController
public class ProdottiREST {
	
	@Autowired
	private ProdottoService service;
	
	
	//REST
	
	@GetMapping("prodotti")
	public List<Prodotto> getAll() {
		return service.getProdotti();
	}
	
	@GetMapping("prodotti/{id}")
	public Prodotto getOne(@PathVariable int id) {
		return service.getProdottoById(id);
	}
	
	
	@PostMapping("prodotti")
	public void addProdotto(@RequestBody Prodotto p) {
		service.addProdotto(p);
		
		getAll();
	}
	
	//put: stai andando a modificare tutte le proprietà
	//patch: modifico solo una proprietà
	
	@PutMapping("prodotti/{id}") //endpoint
	public void updProdotto(@PathVariable int id,  @RequestBody Prodotto p) {
		
		Prodotto prodottoById = service.getProdottoById(id);
		prodottoById = p;
		service.updProdotto(prodottoById);
		
		getAll();
	}
	
	@DeleteMapping("prodotti/{id}")
	public void delProdotto(@PathVariable int id) {
		service.delProdotto(id);
		
		getAll();
	}
	
	
}
