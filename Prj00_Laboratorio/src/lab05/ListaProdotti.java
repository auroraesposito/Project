package lab05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//*
//Questo oggetto ha il solo scopo di ordinare
class OrdinaPrezzoAsc implements Comparator<Prodotto>{

	@Override
	public int compare(Prodotto o1, Prodotto o2) {
		double diff = o1.prezzo - o2.prezzo;

if (diff > 0) {
	return 1;
}else if (diff <0) {
	return -1;
}

return 0;	

	}
	
}

public class ListaProdotti {

	public static void main(String[] args) {
		
		//list è un'interfaccia
		List<Prodotto> prodottiList = new ArrayList<Prodotto>();
		
		prodottiList.add(new Prodotto("pigiama", 10, 2));
		prodottiList.add(new Prodotto("maglietta gialla", 12, 2));
		prodottiList.add(new Prodotto("pantaloni verdi", 8, 8));
		prodottiList.add(new Prodotto("giacca leopardata", 80, 5));
		prodottiList.add(new Prodotto("cappotto cammello", 74, 9));
		
		
		Collections.sort(prodottiList);
		
	
		
		//*
		Collections.sort(prodottiList, (o1, o2) -> o1.nome.compareTo(o2.nome);
		

		prodottiList.forEach(p -> System.out.println(p)); //lambda expression
	
		//diamo un'altra chiave di ordinamento creando un'altra classe*
		
		
	
	
	}

}
