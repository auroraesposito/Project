package model;

public class Dono {
	//incapsulamento: rendere private le proprietà(non accessibili o modificabili) ma rendere pubblico in lettura
	private String descrizione;
	private double peso;

	public Dono(String descrizione, double peso) {
		this.descrizione = descrizione;
		this.peso = peso;
	}

	public String etichetta() {
		return this.descrizione + " " + this.peso;
	}

	// se voglio solo una caratteristica di dono (es. peso)

	public double getPeso() {
		return this.peso;
	}

}
