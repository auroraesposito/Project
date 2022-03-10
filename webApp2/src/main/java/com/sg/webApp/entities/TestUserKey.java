package com.sg.webApp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TestUserKey implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "id_test")
	private int idTest;

	@Column(name = "id_user")
	private int idUser;

	public int getIdTest() {
		return idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

}
