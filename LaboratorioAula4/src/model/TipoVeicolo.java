package model;

public enum TipoVeicolo {

	AUTO(500), CAMION(400), CAMPER(400), BICI(1000), BARCA(200), MONO_PATTINO(500);
	
	double fattore;
	
	private TipoVeicolo(double fattore) {
		this.fattore = fattore;
	}
	
	public double getFattore() {
		return fattore;
	}
	
}
