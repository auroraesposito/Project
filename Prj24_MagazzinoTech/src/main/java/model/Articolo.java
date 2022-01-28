package model;

public class Articolo implements Comparable<Articolo> {
	
	private static int counter = 0;
	private String descrizione;
	private int quantita;
	private int id;
	
	public Articolo(String descrizione, int quantita) {
		this.id =counter++;
		this.descrizione = descrizione;
		this.quantita = quantita;
		
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Articolo [descrizione=");
		builder.append(descrizione);
		builder.append(", quantita=");
		builder.append(quantita);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Articolo o) {
		return this.id - o.id;
	}
	
	
	
	
	

}
