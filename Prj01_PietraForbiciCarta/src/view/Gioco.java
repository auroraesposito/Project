package view;

import java.util.Scanner;

public class Gioco {

	public static void main(String[] args) {
		//sequenza, selezione, interazione
		String sceltaUmano ="";
		String sceltaPC = "";
		String risultato = "";
		int vittorieUmano = 0;
		int vittoriePC = 0;
		int numeroPartite = 5;
		
		for (int i = 0; i < numeroPartite; i++) {
			//System.out.println("il valore di i è:" + i);
			
			sceltaPC = sceltaCasualePC();
			sceltaUmano = sceltaUmano();
			risultato = valutaScelte(sceltaPC, sceltaUmano);
			
			if (risultato.equals("vince umano")) {
				vittorieUmano = vittorieUmano + 1;
			} else if (risultato.equals("vince PC")) {
				vittoriePC = vittoriePC + 1;
			}
					
				
				System.out.println(risultato);
		} //fine ciclo for
			
	} //fine main()

	 
	private static String valutaScelte(String sceltaPC, String sceltaUmano) {
		
		String res= "";
		
		if (sceltaUmano.equals(sceltaPC)) {
			res = "pareggio";
		} //fine blocco if
		else {
			if (sceltaUmano.equals("pietra")) {
				if (sceltaPC.equals("forbici")) {
					res= "vince umano";
				} else {
					res= "vince PC";
				}
				
			} else
			if (sceltaUmano.equals("forbici")) {
				if (sceltaPC.equals("carta")) {
					res= "vince umano";
				} else {
					res= "vince PC";
				}
			}else
			if (sceltaUmano.equals("carta"))
					if (sceltaPC.equals("pietra")) {
						res= "vince umano";
					} else {
						res= "vince PC";
	}	// fine blocco else
		
		}	
		return res;
	}


	private static String sceltaUmano() {
		
		
		System.out.println("scegli tra p: pietra, f: forbici, c: carta");
		
		Scanner input = new Scanner(System.in); //metodo costruttore dell'oggetto di tipo scanner
		
		String risposta = input.nextLine();
		
		return risposta;
	}


	//scrivo il metodo per far scegliere casualmente una stringa tra pietra, forbici, carta
	public static String sceltaCasualePC () {
		
		String scelta = "";
		
		double casuale = Math.random(); //numero reale casuale compreso tra 0.0 e minore di 1.0
		
		if (casuale < 0.33) {
			scelta ="pietra";
		} else if (casuale <0.66) {
			scelta ="forbici";
		} else {
			scelta= "carta";
		}
		return scelta;
		
	} //fine metodo String
	
} //Fine classe
