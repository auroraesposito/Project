package model;

import java.util.Random;

public abstract class Veicolo implements Comparable<Veicolo> {

	private static int counter = 1;
	
	private int id;
	protected TipoVeicolo tipo;
	protected int anno;
	protected double prezzo;
	protected double costoNoleggio;
	protected double prezzoVendita;
	
	public Veicolo() {
		this.id = counter++;
	}
	
	
	
	public Veicolo(int anno) {
		super();
		this.anno = anno;
	}

	
	
	public void setAnno(int anno) {
		this.anno = anno;
	}


	protected double getPrezzoCasuale() {
		double price = 0;
		Random r = new Random();
		
		switch (tipo) {
		case AUTO:
			price = r.nextDouble() * 5000; break;
		case BARCA:
			price = r.nextDouble() * 50000; break;
		case CAMION:
			price = r.nextDouble() * 150000; break;
		case BICI:
			price = r.nextDouble() * 5000; break;
		case CAMPER:
			price = r.nextDouble() * 75000; break;
		case MONO_PATTINO:
			price = r.nextDouble() * 1500; break;
			
		}
		return price;
	}

	public abstract double getCostoNoleggio();
	
	public abstract double getPrezzoVendita();
	
	public int getId() {
		return id;
	}
	
	@Override
	public int compareTo(Veicolo o) {

		return this.id - o.id;
	}
	
	@Override
	public String toString() {
		return "id: " + id + 
				" \ntipo: " + tipo + 
				" \nAnno: " + anno +
				" \nprezzo: " + getPrezzoVendita() + 
				" \nCosto noleggio " + getCostoNoleggio();
	}
	
	
	
	
	
}
