package model;

public class Camion extends VeicoloTargato{

	public Camion(String targa) {
		super(targa);
		this.tipo = TipoVeicolo.CAMION;
		this.tipoPatente = TipoPatente.C;
		this.prezzo = getPrezzoCasuale();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCostoNoleggio() {
		return getPrezzoVendita()/ tipo.getFattore();
	}

	@Override
	public double getPrezzoVendita() {
		// TODO Auto-generated method stub
		return (prezzo * 1.22) + 10000;
	}

}
