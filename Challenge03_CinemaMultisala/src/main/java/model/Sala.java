package model;

import java.util.List;

import dal.FilmDB;

public class Sala  {
	
	private int counter;
	
	private String nome;
	private int posti = 100;
	
	
	

	public Sala(String nome, int posti) {
		this.nome = nome;
		this.posti = counter--;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	
	public int getPosti() {
		return posti;
	}
	
	public void setPosti(int posti) {
		this.posti = posti;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sala [nome=");
		builder.append(nome);
		builder.append(", posti=");
		builder.append(posti);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
