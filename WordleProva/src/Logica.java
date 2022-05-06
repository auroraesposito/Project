import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Logica {

	public static void main(String[] args) {

		boolean condizione = true;
		
		

		
		String[] parArray = { "p", "i", "z", "z", "a" };

		Scanner sc = new Scanner(System.in);

		System.out.println("Hai  tentativi.");
		System.out.println("Inserisci la parola");

		String risposta = sc.nextLine();
		String[] risArray = risposta.split("(?!^)");

		if (risposta.length() != 5) {
			System.out.println("Parola non accettata");
		} else {
			for (int r = 0; r < risArray.length; r++) {
				if (risArray[r].equals(parArray[r])) {
					System.out.println("lettera giusta");
				} else if (Arrays.stream(parArray).anyMatch(risArray[r]::equals)) {
					
					System.out.println("lettera giusta in posizione sbagliata");
				} else {
					System.out.println("lettera sbagliata");
				}

			}

		}
		
	
	}
}
