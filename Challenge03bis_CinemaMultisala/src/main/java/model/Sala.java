package model;

public class Sala {
	
	private String nome;
	private int posti = 100;
	private int id;
	
	
	
	public Sala(String nome, int posti, int id) {
		super();
		this.nome = nome;
		this.posti = posti;
		this.id = id;
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


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sala [nome=");
		builder.append(nome);
		builder.append(", posti=");
		builder.append(posti);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
