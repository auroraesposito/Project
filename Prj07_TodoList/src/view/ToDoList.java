package view;

import java.util.Scanner;

import controller.ToDoCtrl;

public class ToDoList {
	// nono passo: scrivo le proprietà
	private Scanner scanner;
	private ToDoCtrl controller;

	// metodo construttore delle proprietà
	public ToDoList() {
		this.scanner = new Scanner(System.in);
		this.controller = new ToDoCtrl();
	}

	public static void main(String[] args) {
		// gli oggetti sono locali al metodo, esistono solo qua dentro (Scope), per
		// quello la dichiaro prima nella classe

		// settimo passo: ho bisogno del controller, e lo inizializzo
		ToDoList tl = new ToDoList(); // viene inizializzato un nuovo contenitore da 10 posizioni nel controller

		// decimo passo: faccio variabile temporanea di tipo boolean
		boolean continua = true;
		while (continua) {
			// undicesimo passo: aggiungo un metodo che stampa il meno e chiede all'utende
			// cosa vuole fare
			tl.stampaMenu();
			int scelta = tl.leggiSceltaUtente();

			// provo switch invece di if
			switch (scelta) {
			case 1:
				// aggiungere todo
				System.out.println("Per aggiungere un nuovo ToDo, inserisci una stringa descrizione");
				String desc = tl.scanner.next();
				System.out.println("inserisci la posizione della nota");
				int pos = tl.scanner.nextInt();
				tl.controller.addTodo(desc, pos);
				break;
			case 2:
				// completare todo
				System.out.println("Per completare il ToDo, scrivi il numero intero del ToDo");
				int pos2 = tl.scanner.nextInt();
				tl.controller.completa(pos2);
				break;
			case 3:
				System.out.println("Elenco dei ToDo disponibili");
				tl.controller.stampaLista();
				break;
			case 0:
				continua = false;
				System.out.println("hai scelto di uscire.");
				break;
			}

//			if (scelta ==0) {
//				continua = false;
//				System.out.println("hai scelto di uscire.");
//			}
//			
//			if (scelta==1) {
//				//aggiungere todo
//				System.out.println("Per aggiungere un nuovo ToDo, inserisci una stringa descrizione");
//				String desc = tl.scanner.next();
//				System.out.println("inserisci la posizione della nota");
//				int pos = tl.scanner.nextInt();
//				tl.controller.addTodo(desc, pos);
//			}
//			
//			if (scelta==2) {
//				//completare todo
//				System.out.println("Per completare il ToDo, scrivi il numero intero del ToDo");
//				int pos = tl.scanner.nextInt();
//				tl.controller.completa(pos);
//			}
//			
//			if (scelta==3) {
//				//stampare todo
//				System.out.println("Elenco dei ToDo disponibili");
//				tl.controller.stampaLista();
//			}
		}

		// aggiungo ToDo
//		tl.controller.addTodo("pane", 0);
//		tl.controller.addTodo("vino", 1);
//		tl.controller.addTodo("acqua", 2);
//		tl.controller.addTodo("biscotti", 3);
//		
//		tl.controller.completa(1);
//		
//		tl.controller.stampaLista();

		System.out.println("Grazie pr aver usato il nostro software!");

	}

	// undicesimo passo, ritorna un intero
	private int leggiSceltaUtente() {
		System.out.println("Inserisci un numero intero");
		return this.scanner.nextInt();
	}

	// decimo passo
	private void stampaMenu() {
		System.out.println("1) Aggiungi todo");
		System.out.println("2) Completa todo");
		System.out.println("3) Stampa elenco todo");
		System.out.println("0) Esci");

	}

}
