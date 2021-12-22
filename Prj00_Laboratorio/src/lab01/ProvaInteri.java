package lab01;

public class ProvaInteri {

	public static void main(String[] args) {
		
		//int a, b; //dichiarare più variabili dello stesso tipo, posso associargli anche un valore iniziale. si può fare anche su più righe
		//int a; int b; //variabili locali, nel metodo main
		//a= 4; b=4; 
		//static appartiene alla classe, se non sono static appartengono agli oggetti
		
		int a; //dichiarazione
		int b; // se metto final int b=3 e dopo ci assegno un altro valore, non posso farlo
		
		
		a = 4; //inizializzazione
		b = 4; //è una variabile quindi posso cambiare valore, deve essere intero
		
		final int RIGHE = 10;
		final int COLONNE = 10;
		
		for (int i = 1; i <= RIGHE; i++) {
			//innestare un secondo ciclo for ed eseguire l'istruzione per andare a capo
			for (int j = 1; j < COLONNE; j++) {
				System.out.print(i*j + "\t");
				
			}

			System.out.println();
		}
		
		
//		
//		
//		if (a==b) { //confronta se due tipi primitivi sono uguali
//			System.out.println("a e b sono uguali");
//		} else {
//			System.out.println("a e b sono diversi");
//		}
		
		
		
		
		
		
		
		
		

	}

}
