package model;


public abstract class CapoAbbigliamento {
	
	protected static int counter = 1;

	protected int codArt;
	protected String descrizione;
	protected Taglia taglia;
	
	protected String sigla;
	
	public CapoAbbigliamento() {
		this.codArt = counter++;
	}

	//il fatto che sia protected non obbliga a fare il costruttore completo
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		builder.append(sigla);
		builder.append(" - ");
		
		builder.append(descrizione);
		builder.append(", taglia:");
		builder.append(taglia + "(" + taglia.getNumero() +  ")");
		builder.append("]");
		return builder.toString();
	}

	public int getCodArt() {
		return codArt;
	}
	
	
	
}
