package model;

public class MonoPattino extends VeicoloNonTargato{

	public MonoPattino() {
		this.tipo = TipoVeicolo.MONO_PATTINO;
		this.prezzo = getPrezzoCasuale();
	}
	
	@Override
	public double getCostoNoleggio() {
		return getPrezzoVendita()/ tipo.getFattore();
	}

	@Override
	public double getPrezzoVendita() {
		// TODO Auto-generated method stub
		return (prezzo * 1.22) + 5000;
	}

}
