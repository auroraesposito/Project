package model;

public class Ricetta {

	private static int counter;
	private int id;
	private String nome;
	private String regione;
	
	public Ricetta(String nome, String regione) {
		this.nome = nome;
		this.regione = regione;
		this.id = counter++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "{\"id\":" + id + ", \"nome\":" + "\"" + nome + "\"" +  ", \"regione\":" + "\"" + regione + "\"" + "}";
	}
	
	
	
	
	
}
