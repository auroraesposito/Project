package view;

import java.util.Scanner;

import controller.OggettiCtrl;

public class DemoZaino {
	
	private Scanner scanner;
	private OggettiCtrl controller;
	
	
	public DemoZaino() {
		this.scanner = new Scanner(System.in);
		this.controller = new OggettiCtrl();
	}

	public static void main(String[] args) {
		DemoZaino dz = new DemoZaino();
		
		boolean continua = true;
		while (continua) {
			dz.stampaElenco();
			int scelta = dz.sceltaUtente();	
			
			switch (scelta) {
			case 1: 
				System.out.println("Per aggiungere un nuovo oggetto, inserisci il suo nome");
				String descr = dz.scanner.next();
				System.out.println("Indica la posizione in cui vuoi mettere l'oggetto");
				int pos = dz.scanner.nextInt();
				dz.controller.aggiungiOggetti(descr, pos);
				break;
				
			case 2:
				break;
				
			case 3:
				System.out.println("Elenco degli oggetti nello zaino");
				
				break;
				
			case 4:
				continua = false;
				System.out.println("Grazie per aver usato il software!");
				break;
			}
		}
		
		
		
		

	}//fine main



	private void stampaElenco() {
		System.out.println("1) Aggiungi un oggetto");
		System.out.println("2) Peso oggetti" );
		System.out.println("3) Stampa elenco degli oggetti");
		System.out.println("4) Esci dal programma");
		
	}
	
	private int sceltaUtente() {
		System.out.println("Inserisci un numero intero");
		return this.scanner.nextInt();
	}

}
