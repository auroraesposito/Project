package lab05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ProvaListe {
	
	public static void main(String[] args) {
		
		//uso classe wrapper integer se voglio fare una lista di interi
		List<Integer> voti = new ArrayList<>();
		List<Integer> voti2 = new Vector <>(); //simile all'arraylist, cambia solo il riarraggimento dello spazio, meno efficiente
		List<Integer> voti3 = new LinkedList<>(); //se voglio togliere elementi o accedere continuamente agli elementi interni
		//uso list perchè cosi posso passargli qualsiasi tipo di lista che ho creato precedentemente (arraylist, vector, linkedlist)
		
		//lista nella lista: in ogni posizione c'è una lista di interi
		//ad esempio: una lista di studenti, in cui in ogni studente ha una sua lista di voti
		// si fa: List<List<Integer>>
		
		voti3.add(2);
		voti3.add(4);
		voti3.add(6);
		voti3.add(8);
		
		//dato ciascun voto, quel voto lo stampo
		voti3.forEach(voto -> System.out.println(voto));
		
//		voti.add(3);
//		voti2.add(2);
//		voti3.add(7);
		
		//posso trasformare una lista in array
		Object[] array = voti.toArray();
		
		//posso trasformare l'array in lista (alt + shift + l)
		int[] voti4 = {2,4,6,7,5};
		List<int[]> asList = Arrays.asList(voti4);
	}

}
