package controller;

import java.util.ArrayList;
import java.util.List;

import model.Serie;

public class SerieCtrl {

	private List<Serie> elenco;
	
	{//blocco di inizializzazione
		this.elenco = new ArrayList<>();
		this.elenco.add(new Serie("Cobra Kai", "azione"));
		this.elenco.add(new Serie("Breaking bad", "thriller"));
		this.elenco.add(new Serie("Il trono di spade", "fantasy"));
	}

	public SerieCtrl() {
		
	}
	
	public List<Serie> getElenco() {
		return elenco;
	}
	
	public List<Serie> getElencobyGenere(String genere) {
		List<Serie> serie = new ArrayList<Serie>();
		
		for (Serie s : elenco) {
			if(s.getGenere().equals(genere)) {
				serie.add(s);
			}
		}
		
		return serie;
	}
	
	
	
	
	
}
