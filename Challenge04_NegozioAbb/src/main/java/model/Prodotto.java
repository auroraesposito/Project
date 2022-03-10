package model;

public class Prodotto {

	private int id;
	private String nome;
	private double prezzo;

	public Prodotto() {
		// TODO Auto-generated constructor stub
	}

	public Prodotto(int id, String nome, double prezzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.prezzo = prezzo;
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

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prodotto [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append("]");
		return builder.toString();
	}

}
