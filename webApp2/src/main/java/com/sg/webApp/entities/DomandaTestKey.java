package com.sg.webApp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class DomandaTestKey implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "id_domanda")
	private int idDomanda;

	@Column(name = "id_test")
	private int idTest;

	public int getIdDomanda() {
		return idDomanda;
	}

	public void setIdDomanda(int idDomanda) {
		this.idDomanda = idDomanda;
	}

	public int getIdTest() {
		return idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}

}
