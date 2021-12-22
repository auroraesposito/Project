package view;

import model.Dado;

public class GiocaDadi {

	public static void main(String[] args) {

		Dado d1 = new Dado();//dichiaro oggetto d1 di tipo dado
		Dado d2 = new Dado(6, "rosso"); //dichiaro oggetto d2 di tipo dado

		final int NUMERO_LANCI = 100; //costante
		int contaVittorie = 0; //costante

		long start = System.currentTimeMillis(); //tempo di inizio
		for (int i = 0; i < NUMERO_LANCI; i++) { //ciclo for che inizializza i di tipo intero = 0, i minore di numero lanci,

			int res1 = d1.lancia();
			int res2 = d2.lancia();
			if (res1 == res2) {
				// System.out.println("hai vinto con una coppia di " + res1);
				contaVittorie++;
			} else {
//				System.out.println("dado 1: " + res1);
//				System.out.println("dado 2: " + res2);
//				System.out.println("non hai vinto, ritenta!!!");
			}
		}
		long stop = System.currentTimeMillis();

		System.out.println("l'elaborazione è durata " + (stop - start) + " ms");

		System.out.println("hai giocato " + NUMERO_LANCI + " volte");
		System.out.println("hai vinto " + contaVittorie + " volte");
		double percentuale = (double) contaVittorie / NUMERO_LANCI * 100;
		System.out.println("la percentuale di successo è di: " + percentuale + "%");

	}

}
