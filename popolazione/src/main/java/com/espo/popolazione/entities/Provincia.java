package com.espo.popolazione.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "popolazione_italiana_regione")
public class Provincia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String regione;
	
	@Column(name= "comune")
	private String provincia;
	
	private int maschi;
	private int femmine;
	private int totale;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegione() {
		return regione;
	}
	public void setRegione(String regione) {
		this.regione = regione;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int getMaschi() {
		return maschi;
	}
	public void setMaschi(int maschi) {
		this.maschi = maschi;
	}
	public int getFemmine() {
		return femmine;
	}
	public void setFemmine(int femmine) {
		this.femmine = femmine;
	}
	public int getTotale() {
		return totale;
	}
	public void setTotale(int totale) {
		this.totale = totale;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provincia [id=");
		builder.append(id);
		builder.append(", regione=");
		builder.append(regione);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", maschi=");
		builder.append(maschi);
		builder.append(", femmine=");
		builder.append(femmine);
		builder.append(", totale=");
		builder.append(totale);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
