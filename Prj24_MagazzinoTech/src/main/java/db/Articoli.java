package db;

import java.util.HashMap;
import java.util.Map;

import model.Articolo;

public class Articoli {

	private static Map<Integer, Articolo> ALL = new HashMap<>();

	static {

		String[] tech = { "Computer", "Monitor", "Telefono", "Tastiera", "Mouse", "Stampante", "Scanner" };

		for (String art : tech) {
			Articolo a = new Articolo(art, 100);
			ALL.put(a.getId(), a);
		}

	}
	
	public static Map<Integer, Articolo> getALL() {
		return ALL;
	}
	
	

}
