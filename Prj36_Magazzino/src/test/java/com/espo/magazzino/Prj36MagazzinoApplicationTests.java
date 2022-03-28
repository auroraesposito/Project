package com.espo.magazzino;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.espo.magazzino.entities.Prodotto;
import com.espo.magazzino.services.ProdottoService;

@SpringBootTest
class Prj36MagazzinoApplicationTests {

	@Autowired
	private ProdottoService service;
	
	
	@Test
	void contextLoads() {
		
//		Prodotto prodotto = new Prodotto();
//		prodotto.setNome("pc");
//		prodotto.setQuantita(100);
//		
//		service.addProdotto(prodotto);
//		
//		List<Prodotto> prodotti = service.getProdotti();
//		
//		assertTrue(prodotti.get(0).getNome().equals("pc"));
//		assertTrue(service.getProdottoById(1)==null);
		
	}

}
