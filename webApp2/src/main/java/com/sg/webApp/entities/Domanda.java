package com.sg.webApp.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "domanda")
public class Domanda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDomanda;

	@OneToMany(mappedBy = "domanda")
	private Set<DomandaTest> domandetests;

	private String testoDomanda;
	private int punteggioDomanda;
	private String rispostaEsatta;

	public Set<DomandaTest> getDomandetests() {
		return domandetests;
	}

	public void setDomandetests(Set<DomandaTest> domandetests) {
		this.domandetests = domandetests;
	}

	public int getIdDomanda() {
		return idDomanda;
	}

	public String getRispostaEsatta() {
		return rispostaEsatta;
	}

	public void setIdDomanda(int idDomanda) {
		this.idDomanda = idDomanda;
	}

	public String getTestoDomanda() {
		return testoDomanda;
	}

	public void setTestoDomanda(String testoDomanda) {
		this.testoDomanda = testoDomanda;
	}

	public int getPunteggioDomanda() {
		return punteggioDomanda;
	}

	public void setPunteggioDomanda(int punteggioDomanda) {
		this.punteggioDomanda = punteggioDomanda;
	}

	public String isRispostaEsatta() {
		return rispostaEsatta;
	}

	public void setRispostaEsatta(String rispostaEsatta) {
		this.rispostaEsatta = rispostaEsatta;
	}

}
