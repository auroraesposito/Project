package com.sg.webApp.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTest;

	@OneToMany(mappedBy = "test")
	private Set<DomandaTest> domandetests;

	@OneToMany(mappedBy = "test")
	private Set<TestUser> testsusers;

	private String titoloTest;
	private LocalDate dataTest;

	public int getIdTest() {
		return idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}

	public String getTitoloTest() {
		return titoloTest;
	}

	public void setTitoloTest(String titoloTest) {
		this.titoloTest = titoloTest;
	}

	public LocalDate getDataTest() {
		return dataTest;
	}

	public void setDataTest(LocalDate dataTest) {
		this.dataTest = dataTest;
	}

}
