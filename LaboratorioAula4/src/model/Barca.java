package model;

public class Barca extends VeicoloTargato implements Noleggiabile{

	
	
	public Barca(String targa) {
		super(targa);
		this.tipo = TipoVeicolo.BARCA;
		this.tipoPatente = TipoPatente.A;
		this.prezzo = getPrezzoCasuale();
	}

	@Override
	public double getCostoNoleggio() {
		// TODO Auto-generated method stub
		return getPrezzoVendita()/ tipo.getFattore();
	}

	@Override
	public double getPrezzoVendita() {
		// TODO Auto-generated method stub
		return (prezzo * 1.22) + 5000;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" +  MESSAGGIO;
	}
}
