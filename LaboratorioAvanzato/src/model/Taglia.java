package model;

public enum Taglia {
	S(40), M(44), L(48), XL(52); //4 oggetti di tipo taglia a cui passo un numero quando nel costruttore indico  l'argomento che passo all'oggetto

	private int numero;
	
	private Taglia(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	
}
