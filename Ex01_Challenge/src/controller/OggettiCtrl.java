package controller;

import model.Oggetti;
import model.ToDo;
import model.Zaino;

public class OggettiCtrl {

	Oggetti oggetto;
	Zaino zaino;
	
	private  Oggetti[] lista; {
		this.lista = new Oggetti [15];
}
	public void aggiungiOggetti (String desc, int pos) {
		

//	public void aggiungiOggetti(String descrizione, double peso) {
//		oggetto = new Oggetti(descrizione, peso);
//		aggiungiOggettiAlloZaino();
//	}
//
//	public Oggetti getOggetto() {
//		return oggetto;
//	}
//
//	public void aggiungiOggettiAlloZaino(int pos) {
//		this.zaino.getOggetti()[pos] = this.oggetto;
//	}
//
//	public void aggiungiOggettiAlloZaino() {
//		int pos = primaPosizioneLibera();
//		if (pos > -1) {
//			this.zaino.getOggetti()[pos] = this.oggetto;
//		} else {
//			System.out.println("Non c'è posto nello zaino!");
//		}
		
	

	}
	
	private void stampaOggetti() {
		for (int i = 0; i < ; i++) {
		
		}
	}

	private int primaPosizioneLibera() {
		for (int i = 0; i < zaino.getOggetti().length; i++) {
			if (zaino.getOggetti() [i] == null) {
				return i;
			}
		}

		return -1;
	}
}
