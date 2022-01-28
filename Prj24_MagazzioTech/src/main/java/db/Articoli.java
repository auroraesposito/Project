package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Articolo;

public class Articoli {

	private static Map<Integer, Articolo> ALL = new HashMap<>();

	static {// blocco di inizializzazione, dove posso inserire comandi

		String[] tech = { "Monitor", "Telefono", "Mouse", "Computer", "Tastiera", "Case", "Stampante" };

		for (String art : tech) {
			Articolo a = new Articolo(art, 100);
			ALL.put(a.getId(), a);
		}

	}

	public static Map<Integer, Articolo> getALL() {
		return ALL;
	}
	
	
	
}


