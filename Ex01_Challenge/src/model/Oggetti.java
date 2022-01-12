package model;

public class Oggetti {

	private String descrizione;
	private double peso;
	
	
	public Oggetti(String descrizione, double peso) {
		this.descrizione = descrizione;
		this.peso = peso;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Oggetti [descrizione=" + descrizione + ", peso=" + peso + "]";
	}
	
	
	
	
	
	
}
