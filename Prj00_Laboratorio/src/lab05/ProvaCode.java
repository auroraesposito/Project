package lab05;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProvaCode {

	public static void main(String[] args) {
		String[] personaggi= new String [] {"pippo", "pluto", "paperino"};
		//Quando devo gestire una coda
		Queue<String> voti = new PriorityQueue<String>();
		
		for (String string : personaggi) {
			voti.add(string);
		}
		int size = voti.size();
		System.out.println(size);
		
		System.out.println(voti.peek()); //ritorna l'ultimo e non lo rimuove
		System.out.println(voti.poll()); //ritorna l'ultimo e lo rimuove
		
		System.out.println(voti.size());

	}

}
