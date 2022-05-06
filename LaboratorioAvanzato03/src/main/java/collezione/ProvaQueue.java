package collezione;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class ProvaQueue {

	public static void main(String[] args) {

		List<String> master = Arrays.asList("mammolo", "brontolo", "pisolo", "eolo");
		List<String> master2 = Arrays.asList("mammolo", "cucciolo", "cotto", "gongolo");
		
		Set<String> master3 = new HashSet<String>(master);
		master3.addAll(master2);
		
		Set<String> intersezione = new HashSet<String>(master);
		intersezione.retainAll(master2);
		
		System.out.println(intersezione);
		
		Set<String> differenza = new HashSet<String>(master);
		differenza.removeAll(master2);
		
		System.out.println(differenza);
		
		//queue: pila FIFO - first in first out
		//LinkedList implementa due interfacce (List e Queue)
		//Queue<String> nani = new LinkedList<String>();
		
		//altra pila, 
		//gestisce le priority
		//PriorityQueue<String> nani = new PriorityQueue<>();
		
		//coda da entrambe le parti
		//pila LIFO
		//Deque<String> nani = new ArrayDeque<String>(master4);
//		
//		
//		nani.add("pisolo");
//		nani.offer("mammolo");
//		nani.offer("brontolo");
//		nani.addFirst("cucciolo");
//		
//		
//		String peek = nani.peek();
//		String poll = nani.poll();
//		
//		
//		
		//ti dà il primo elemento
//		System.out.println("peek: " + peek);
//		
		//ti dà il primo elemento e te lo toglie dalla collezione
//		System.out.println("poll: " + poll);
//		
		
		System.out.println("-------------------------------nani------");
		
		//con iterator la collezione si consuma
//		Iterator<String> iterator = nani.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		//usa il threading all'interno per fare operazioni nella tua collezione. molto più veloce dello stream
//		nani.parallelStream();
//		
		//nani.forEach(System.out::println);
		
		
		
		
		
		
	}

}
