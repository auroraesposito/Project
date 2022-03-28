package funzionale;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Funzionale4 {

	public static void main(String[] args) {
		
		//Arrays: metodi statici per manipolare gli array
		//varargs: argomenti variabili (es. automobile...caratteristiche)
		List<String> nani = Arrays.asList(
					"eolo",
					"gongol",
					"pisolo",
					"mammolo",
					"adrianolo",
					"zigulì",
					"firuli",
					"MIGNOLO",
					"aaaaaaaaaaaaa"
				);
		
		
		
		//Collections.sort(nani, (o1, o2) -> o2.length() -o1.length());
		
		//comparable: ordinamento naturale degli oggetti
		//comparator: ordinare per qualcosa che vuoi tu
		
		//programmazione funzionale, non modificano quello che è esterno alla collazione
		nani.stream()
		.sorted((o1, o2) -> o2.length() -o1.length())
		.forEach(System.out::println);
		
		//parallel stream: fa partire diversi processi stream in parallelo (incremento di prestazioni)
	
	}
	
	
	
}
