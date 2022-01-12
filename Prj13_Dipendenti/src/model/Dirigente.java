package model;

public class Dirigente extends Dipendente {
	
	private double emolumenti;

	public Dirigente(String nome, String cognome) {
		super(nome, cognome);
		this.emolumenti = 1800;
	}

	@Override
	public double calcolaStipendio() {
		return this.emolumenti;
	}

}
