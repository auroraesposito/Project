package service;

import java.time.LocalDateTime;
import java.util.List;

import dal.SalaDAO;
import dal.SalaDAOImpl;
import model.Film;
import model.Sala;

public class SalaServiceImpl implements SalaService {
	
	SalaDAO repo = new SalaDAOImpl();

	@Override
	public void addFilm(Film f) {
		repo.addFilm(f);
	}

	@Override
	public List<Film> getAll() {
		// TODO Auto-generated method stub
		return repo.getAll();
	}

	@Override
	public List<Film> getFilmByTitolo(String titolo) {
		// TODO Auto-generated method stub
		return repo.getFilmByTitolo(titolo);
	}

	@Override
	public List<Film> getFilmByData(LocalDateTime giornoOra) {
		// TODO Auto-generated method stub
		return repo.getFilmByData(giornoOra);
	}

	@Override
	public List<Film> getFilmBySala(Sala s) {
		// TODO Auto-generated method stub
		return repo.getFilmBySala(s);
	}

	@Override
	public void updFilm(Film f) {
		repo.updFilm(f);

	}

	@Override
	public void deleteFilm(Film f) {
		repo.deleteFilm(f);

	}

}
