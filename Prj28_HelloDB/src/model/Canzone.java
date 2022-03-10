package model;

public class Canzone {

	//ORM
	//Javabean - POJO (Plain Old Java Object)
	
	
	private int id;
	private String titolo, genere, cantante;
	
	public Canzone() {
	}
	
	public Canzone(int id, String titolo,  String cantante, String genere) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.genere = genere;
		this.cantante = cantante;
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
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
