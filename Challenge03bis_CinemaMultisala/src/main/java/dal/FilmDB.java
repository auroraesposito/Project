package dal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Film;

public class FilmDB {
	
	public static List<Film> films = new ArrayList<>(Arrays.asList(new Film("Le colline hanno gli occhi", 01),
			new Film("Harry Potter e i doni di babbo natale", 02), new Film("Cambia la tua vita con un click", 03),
			new Film("Via brombeys",04)));

}
