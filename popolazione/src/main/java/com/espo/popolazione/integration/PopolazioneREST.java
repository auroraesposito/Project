package com.espo.popolazione.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.espo.popolazione.entities.Eta;
import com.espo.popolazione.entities.Provincia;
import com.espo.popolazione.service.PopolazioneService;

@RestController
@RequestMapping("api")
public class PopolazioneREST {

	@Autowired
	private PopolazioneService service;

	@GetMapping("eta")
	public List<Eta> getEta() {

		return service.getAllEta();
	}

	@GetMapping("eta/{eta}")
	public Eta getDatiByEta(@PathVariable int eta) {

		return service.getDatiByEta(eta);
	}
	
	@GetMapping("eta/range/{min}/{max}")
	public List<Eta> getEtaByRange( @PathVariable int min,@PathVariable int max) {
		return service.getEtaByRange(min, max);
	}

	@GetMapping("province")
	public List<Provincia> getProvince() {

		return service.getProvincia();
	}

	@GetMapping("province/{regione}")
	public List<Provincia> getProvinceByRegione(@PathVariable String regione) {

		return service.getProvinciaByRegione(regione);
	}

	@GetMapping("provincia/{id}")
	public Provincia getProvinciaById(@PathVariable int id) {

		return service.getProvinciaById(id);
	}
	
	@GetMapping("infoprovincia/{provincia}")
	public Provincia getProvinciaByNome(@PathVariable String provincia) {
		
		return service.getProvinciaByProvincia(provincia);
	}
	
	
	

}
