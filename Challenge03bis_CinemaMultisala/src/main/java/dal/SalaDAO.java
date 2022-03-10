package dal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import model.Film;
import model.Sala;

public interface SalaDAO {
	
	void addFilm(Film f);
	
	List<Film> getAll();
	List<Film> getFilmByTitolo (String titolo);
	List<Film> getFilmByData (LocalDateTime giornoOra);
	List<Film> getFilmBySala(Sala s);
	
	void updFilm(Film f);
	void deleteFilm(Film f);

	
	

}
