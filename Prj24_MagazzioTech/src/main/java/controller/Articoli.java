package controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import model.Articolo;

public class Articoli {

	private Map<Integer, Articolo> articoliMap;
	private Set<Articolo> articoliSet;
	private List<Articolo> articoliList;

	public Articoli() {
		this.articoliMap = new HashMap<Integer, Articolo>();
		this.articoliSet = new TreeSet<Articolo>();
		this.articoliList = new LinkedList<Articolo>();
	}

	public void addArticolo(Articolo a) {
		this.articoliMap.put(a.getId(), a);
		this.articoliList.add(a);
		this.articoliSet.add(a); //non fa risultare i doppioni
	}

	public Articolo getArticolo(int i) {
		return this.articoliMap.get(i);
	}

	public Map<Integer, Articolo> getArticoliMap() {
		return articoliMap;
	}

	public Set<Articolo> getArticoliSet() {
		return articoliSet;
	}

	public List<Articolo> getArticoliList() {
		return articoliList;
	}
	
	public void caricaArticolo (Articolo a, int q) {
		getArticolo(a.getId()).incrementa(q);
	}
	public void scaricaArticolo (Articolo a, int q) {
		getArticolo(a.getId()).decrementa(q);
	}

}
