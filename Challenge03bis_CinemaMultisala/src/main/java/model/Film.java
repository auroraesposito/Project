package model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Film {

	private String titolo;
	private int id;
	private Sala sala;
	private LocalDateTime giornoOra;
	
	public Film(String titolo, int id) {
		super();
		this.titolo = titolo;
		this.id = id;
		this.sala = sala;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public Sala getSala() {
		return sala;
	}
	public LocalDateTime getGiornoOra() {
		return giornoOra;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [titolo=");
		builder.append(titolo);
		builder.append(", id=");
		builder.append(id);
		builder.append(", sala=");
		builder.append(sala);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
