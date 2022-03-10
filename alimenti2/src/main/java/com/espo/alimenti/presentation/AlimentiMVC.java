package com.espo.alimenti.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.espo.alimenti.entities.Alimento;
import com.espo.alimenti.service.AlimentoService;

@Controller
@RequestMapping({"model", "mvc"})
public class AlimentiMVC {

	@Autowired
	private AlimentoService service;
	
	@GetMapping()
	public String getAll(Model m){
		m.addAttribute("lista", this.service.getAlimenti());
		m.addAttribute("titolo", "elenco alimenti");
		return "elenco";
	}
	
	@GetMapping("{id}")
	public ModelAndView getById(@PathVariable int id){
		ModelAndView mav = new ModelAndView("dettaglio");
		mav.addObject("titolo", "dettaglio");
		mav.addObject("alimento", this.service.getAlimentoById(id));
		return mav;
	}
	
	@PostMapping
	public void addAlimento(@RequestBody Alimento a) {
		this.service.addAlimento(a);
		
	}
	
	@PutMapping
	public void updAlimento(@RequestBody Alimento a) {
		this.service.updateAlimento(a);
	}
	
	@DeleteMapping("{id}")
	public void deleteAlimento(@PathVariable int id) {
		this.service.deleteAlimento(id);
	}
}
