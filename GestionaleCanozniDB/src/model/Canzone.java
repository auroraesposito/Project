package model;

public class Canzone implements Comparable<Canzone> {
	
	private int id;
	private String titolo, cantante, genere;
	private int anno;
	
	public Canzone(String titolo, String cantante, String genere, int anno) {
		
		this.titolo = titolo;
		this.cantante = cantante;
		this.genere = genere;
		this.anno = anno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getCantante() {
		return cantante;
	}
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	@Override
	public int compareTo(Canzone altraCanzone) {
		return this.titolo.compareTo(altraCanzone.titolo);
	}
	
	
	

}
