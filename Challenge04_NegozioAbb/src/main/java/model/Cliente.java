package model;

public class Cliente {

	private int id;
	private String nome;
	private String indirizzo;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nome, String indirizzo) {
		this.id = id;
		this.nome = nome;
		this.indirizzo = indirizzo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", indirizzo=");
		builder.append(indirizzo);
		builder.append("]");
		return builder.toString();
	}

}
