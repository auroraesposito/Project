package dal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Ricetta;

public class FintoDatabase {
	
	public static List<Ricetta> ricetteBase = new ArrayList<>(
			
			Arrays.asList(
					new Ricetta("Risotto al barolo", "Piemonte"),
					new Ricetta("Brasato al barolo", "Piemonte"),
					new Ricetta("Friciò piemontesi", "Piemonte"),
					new Ricetta("Crostini ai tartufi", "Piemonte")
					)
			
			
			
			);
	

	
}
