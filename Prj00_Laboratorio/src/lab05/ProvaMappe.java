package lab05;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ProvaMappe {

	public static void main(String[] args) {
		
		//come se fosse doppia collezione, l'interfaccia map ha bisogno di chiave e valore
		//Map<K(Set), V(List)>
		Map<String, String[]> capoluoghi = new TreeMap<>(); //mappa di cui non è importante l'ordine
		
		//per aggiungere si usa put
		capoluoghi.put("Piemonte", new String[] {"Torino", "Asti", "Cuneo"});
		capoluoghi.put("Lombardia", new String[] {"Milano", "Brescia", "Como"});
		capoluoghi.put("Lazio", new String[] {"Roma", "Frosinone", "Ostia"});
		
		//per scorrere la map:
		//mi faccio dare le chiavi del set
		Set<String> keySet = capoluoghi.keySet(); //ritorna un set di chiavi
		
		for (String regione : keySet) {
			System.out.println(regione);
			
			List<String> comuni = Arrays.asList(capoluoghi.get(regione));
			Collections.sort(comuni);
			for (String comune : comuni) {
				System.out.println("\t" + comune);
			}
			
	
		}

	}

}
