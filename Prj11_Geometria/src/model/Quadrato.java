package model;

//per ereditare c'è bisogno del costruttore del rettangolo (il metodo costruttore non si eredita)
public class Quadrato extends Rettangolo {
	
	Segmento lato;
	
//ha proprietà e emtodi del rettangolo ma aggiunge delle proprietà
	public Quadrato(Segmento lato) {
		super(lato, lato); //deve essere la prima istruzione del costruttore
		this.lato = lato;
		
	}
	
	//posso riscrivere il metodo della superclasse
	@Override
	public double perimetro() {
		System.out.println("stai usando un metodo del quadrato");
		return this.lato.lunghezza() * 4;
	}
	

	
	

	
	
}
