package model;

public class Libro extends Pubblicazione implements Comparable<Libro>, Volante{ //Comparable per confrontare libro con altro libro (è solo una interfaccia)

	private String titolo;
	private double prezzo;
	private int pagine;
	public Libro(String titolo, double prezzo, int pagine) {
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.pagine = pagine;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [titolo=");
		builder.append(titolo);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append(", pagine=");
		builder.append(pagine);
		builder.append("]");
		return builder.toString();
	}
	//ordino per pagine
//	@Override
//	public int compareTo(Libro o) {
//		// metodo che prende un libro "o" ("other")
//		return this.pagine - o.pagine; //metto il criterio di comparazione
//		//0 sono uguali, -1 viene prima dell'altro, +1 viene dopo l'altro
//	}
	
	//ordino per titolo
//	@Override
//	public int compareTo(Libro o) {
//		// metodo che prende un libro "o" ("other")
//		return this.titolo.compareTo(o.titolo);
//	}
	
	//ordino per prezzo
	@Override
	public int compareTo(Libro o) {
		int i  = 0;
		
		if(this.prezzo - o.prezzo > 0) {
			i =1;
		}else if(this.prezzo - o.prezzo < 0) {
			i = -1;
		}
		
		return i;
	}
	@Override
	public double annoPub() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void vola() {
		System.out.println("se non ti è piaciuto puoi lanciarlo");
		
	}
	
	
	
}
