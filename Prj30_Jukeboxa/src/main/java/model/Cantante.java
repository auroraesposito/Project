package model;

import java.util.ArrayList;
import java.util.List;

public class Cantante {

	private int id;
	private String nome;
	private List<Canzone> canzoni;
	
	public Cantante() {
		this.canzoni = new ArrayList<Canzone>();
	} //utile perchè se voglio modificare l'arraylist con altro, posso farlo senza andare a cambiare tutto
	
	public Cantante(int id, String nome) {
		this(); //chiamo il costruttore senza parametri di this oggetto
		this.id = id;
		this.nome = nome;

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

	public List<Canzone> getCanzoni() {
		return canzoni;
	}

	public void setCanzoni(List<Canzone> canzoni) {
		this.canzoni = canzoni;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cantante [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", canzoni=");
		builder.append(canzoni);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
