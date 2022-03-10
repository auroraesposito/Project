package com.sg.webApp.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sg.webApp.entities.Domanda;
import com.sg.webApp.service.webAppService;

@RestController
@RequestMapping("webApp")
public class WebAppREST {

	@Autowired
	private webAppService service;

	@GetMapping
	public List<Domanda> getAll() {
		return this.service.getDomande();
	}

}
