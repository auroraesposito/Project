package com.sg.webApp.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "domandatest")
public class DomandaTest {

	@EmbeddedId
	DomandaTestKey id;

	@ManyToOne
	@MapsId("idDomanda")
	@JoinColumn(name = "id_domanda")
	Domanda domanda;

	@ManyToOne
	@MapsId("idTest")
	@JoinColumn(name = "id_test")
	Test test;

	public DomandaTestKey getId() {
		return id;
	}

	public void setId(DomandaTestKey id) {
		this.id = id;
	}

	public Domanda getDomanda() {
		return domanda;
	}

	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

}
