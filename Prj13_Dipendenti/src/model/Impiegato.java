package model;

public class Impiegato extends Dipendente {
	
	private int giorniLavoro;
	private double pagaGiornaliera;
	
	

	public Impiegato(String nome, String cognome) {
		super(nome, cognome);
		this.pagaGiornaliera = 80;
	}

	public void setGiorniLavoro(int giorniLavoro) {
		this.giorniLavoro = giorniLavoro;
	}
	
	@Override
	public double calcolaStipendio() {
		return this.pagaGiornaliera * giorniLavoro;
	}

}
