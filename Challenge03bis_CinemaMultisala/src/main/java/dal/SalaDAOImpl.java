package dal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Film;
import model.Sala;

public class SalaDAOImpl implements SalaDAO {
	
	private List<Film> programmazione = FilmDB.films;
	private Map<Integer, Film> filmMap = riempiMappa();
	
	private Map<Integer, Film> riempiMappa() {
		Map<Integer, Film> mappa = new HashMap<>();
		for (Film film : programmazione) {
			mappa.put(film.getId(), film);
		}
		return mappa;
	}

	@Override
	public void addFilm(Film f) {
		this.programmazione.add(f);
	}

	@Override
	public List<Film> getAll() {
		
		return programmazione;
	}

	@Override
	public List<Film> getFilmByTitolo(String titolo) {
		List<Film> filmFiltrati = new ArrayList<>();
		for (Film film : programmazione) {
			if (film.getTitolo().equals(titolo))
					filmFiltrati.add(film);
		}
		return filmFiltrati;
	}

	@Override
	public List<Film> getFilmByData(LocalDateTime giornoOra) {
		List<Film> filmFiltratiOra = new ArrayList<>();
		for (Film film : programmazione) {
			if (film.getGiornoOra().equals(giornoOra))
					filmFiltratiOra.add(film);
		}
		return filmFiltratiOra;
	}

	@Override
	public List<Film> getFilmBySala(Sala s) {
		List<Film> filmFiltratiSala = new ArrayList<>();
		for (Film film : programmazione) {
			if (film.getSala().equals(s))
					filmFiltratiSala.add(film);
		}
		return filmFiltratiSala;
	}

	@Override
	public void updFilm(Film f) {
		Film film = filmMap.get(f.getId());
		film = f;
		
	}

	@Override
	public void deleteFilm(Film f) {
		filmMap.remove(f);
		
	}

}
