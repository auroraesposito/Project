package com.espo.concessionariaauto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.espo.concessionariaauto.entities.Auto;
import com.espo.concessionariaauto.service.AutoService;

@SpringBootTest
class ConcessionariaAutoApplicationTests {

	@Autowired
	private AutoService service;
	
	@Test
	void provaApp() {
		
		Auto a1 = new Auto(0, "tesla", "xxx", 4.5, 2, 3);
		Auto a2 = new Auto(0, "fiat", "xxx", 4.5, 2, 3);
		Auto a3 = new Auto(0, "ferrari", "xxx", 4.5, 2, 3);
		
		service.addAuto(a1);
		service.addAuto(a2);
		service.addAuto(a3);
		
		System.out.println(service.getAll());
		
		asserttr(a1.getPrezzo()> 10);
	}

}
