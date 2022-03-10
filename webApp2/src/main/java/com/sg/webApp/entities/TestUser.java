package com.sg.webApp.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "testUser")
public class TestUser {

	@EmbeddedId
	TestUserKey id;

	private int punteggioTotale;

	@ManyToOne
	@MapsId("idTest")
	@JoinColumn(name = "id_test")
	Test test;

	@ManyToOne
	@MapsId("idUser")
	@JoinColumn(name = "id_user")
	User user;

	public TestUserKey getId() {
		return id;
	}

	public void setId(TestUserKey id) {
		this.id = id;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getPunteggioTotale() {
		return punteggioTotale;
	}

	public void setPunteggioTotale(int punteggioTotale) {
		this.punteggioTotale = punteggioTotale;
	}

}
