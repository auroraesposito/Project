package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import model.Articolo;
import model.Movimento;

public class MagazzinoCtrl {

	private Articoli ctrlArticoli; 
	private MovimentiCtrl ctrlMovimenti; 
	
	public MagazzinoCtrl() {
		this.ctrlArticoli = new Articoli();
		this.ctrlMovimenti = new MovimentiCtrl(new ArrayList<Movimento>());
		this.init();
	}
	
	private  void init() {
		
		for (	Articolo a : db.Articoli.getAsList()) {
			this.ctrlArticoli.addArticolo(a);
		}
		
	}
	
	public void caricaMagazzino(Articolo a, int q) {
		
		//creo un oggetto di tipo movimento
		Movimento m = new Movimento("Carico magazzino", q, a);
		
		//aggiungo il movimento alla lista di movimenti del ctrl movimenti
		this.ctrlMovimenti.addMovimento(m);
		
		//modificare la quantita disponibile pèer l'articolo a
		this.ctrlArticoli.caricaArticolo(a, q);
		
	}
	public void scaricaMagazzino(Articolo a, int q) {
		
		//creo un oggetto di tipo movimento
		Movimento m = new Movimento("scarico magazzino", q, a);
		
		//aggiungo il movimento alla lista di movimenti del ctrl movimenti
		this.ctrlMovimenti.addMovimento(m);
		
		//modificare la quantita disponibile pèer l'articolo a
		this.ctrlArticoli.scaricaArticolo(a, q);
		
	}
	
	public Articoli getCtrlArticoli() {
		return ctrlArticoli;
	}
	
	public MovimentiCtrl getCtrlMovimenti() {
		return ctrlMovimenti;
	}
	
}
