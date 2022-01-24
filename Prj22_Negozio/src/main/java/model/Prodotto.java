package model;

public class Prodotto implements Cloneable {
	
	private static int counter = 0;
	
	private int codProdotto;
	private String nome;
	private double prezzo;
	
	
	public Prodotto(String nome, double prezzo) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.codProdotto = ++counter;
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


	public int getCodProdotto() {
		return codProdotto;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prodotto [codProdotto=");
		builder.append(codProdotto);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	
}
