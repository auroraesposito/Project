package model;

public class Camper extends VeicoloTargato{

	public Camper(String targa) {
		super(targa);
		this.tipo = TipoVeicolo.CAMPER;
		this.tipoPatente = TipoPatente.D;
		this.prezzo = getPrezzoCasuale();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCostoNoleggio() {
		// TODO Auto-generated method stub
		return getPrezzoVendita()/ tipo.getFattore();
	}

	@Override
	public double getPrezzoVendita() {
		// TODO Auto-generated method stub
		return (prezzo * 1.22) + 10000;
	}

}
