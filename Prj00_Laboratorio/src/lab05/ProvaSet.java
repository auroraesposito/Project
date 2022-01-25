package lab05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {
		
		//interfaccia set
		Set<String> voti = new HashSet<>(); //non li ordina
		Set<String> voti2 = new TreeSet<>(); //ordina gli elementi
		Set<String> voti3 = new LinkedHashSet<>(); 
		
		//se tu hai un doppio numero, in automatico ne prende solo uno
		voti.add("alfa");
		voti.add("beta");
		voti.add("gamma");
		voti.add("delta");
		voti.add("ics");
		voti.add("ipsilon");
		voti.add("pippo");
		
		List<String> votitrasformati = new ArrayList<String>(voti);
		votitrasformati.add("alfa");
		Set<String> votiritrasformati = new TreeSet<String>(votitrasformati);
		
		voti.forEach(v -> System.out.println(v));
		
		//System.out.println(voti.size());
		
	}
}
