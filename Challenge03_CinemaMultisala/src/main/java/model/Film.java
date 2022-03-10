package model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Film {
	
	
	private String titolo;
	private LocalTime ora;
	private int id;
	private Sala sala;
	
	public Film(String titolo, Sala sala, int id ) {
		this.titolo = titolo;
		this.sala = sala.getNome();
		this.id = id;
	}
	
	public Sala getSala() {
		return sala;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalTime getOra() {
		return ora;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [titolo=");
		builder.append(titolo);
		builder.append(", data=");
		builder.append(ora);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

	
	
	

}
