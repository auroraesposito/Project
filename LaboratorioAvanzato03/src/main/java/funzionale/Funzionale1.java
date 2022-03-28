package funzionale;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Funzionale1 {

	public static void main(String[] args) {
		
		IntStream voti = IntStream.of(25,26,27,28,29,30);
		
		OptionalDouble average = voti.average();
		
		if(average.isPresent()) {
			System.out.println(average.getAsDouble());
		}
		
		//in modo procedurale(come all'inizio)*****************************************************
		
		int[] voti2 = {25,26,27,28,29,30};
		
		double totale = 0;
		
		for (int i = 0; i < voti2.length; i++) {
			totale += voti2[i];
		}
		
		double average2 = totale  / voti2.length;
		
		System.out.println(average2);
		
	}
	
	
}
