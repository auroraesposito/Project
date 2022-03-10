package com.espo.canzoni.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "canzoni")
public class Canzone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titolo, genere, cantante;
	private int anno;
	
	public Canzone() {
		// TODO Auto-generated constructor stub
	}
	
	public Canzone(int id, String titolo, String genere, String cantante, int anno) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.genere = genere;
		this.cantante = cantante;
		this.anno = anno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getCantante() {
		return cantante;
	}
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Canzone [id=");
		builder.append(id);
		builder.append(", titolo=");
		builder.append(titolo);
		builder.append(", genere=");
		builder.append(genere);
		builder.append(", cantante=");
		builder.append(cantante);
		builder.append(", anno=");
		builder.append(anno);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}
