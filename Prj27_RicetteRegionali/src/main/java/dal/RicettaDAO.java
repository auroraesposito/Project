package dal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Ricetta;

public class RicettaDAO implements RicettaIDAO {

	// qui avrò l'ggetto dal database
	private List<Ricetta> ricette = FintoDatabase.ricetteBase;
	private Map<Integer, Ricetta> ricetteMap = riempiMappa();

	//private static RicettaDAO istanza;

//	private RicettaDAO() {
//		this.ricette = new ArrayList<Ricetta>();
//	}

//	public static RicettaDAO getIstanza() {
//		if(istanza == null) {
//			istanza = new RicettaDAO();
//		}
//		return istanza;
//	}
	private Map<Integer, Ricetta> riempiMappa() {
		Map<Integer, Ricetta> mappa = new HashMap<>(); // non posso usare treemap perche ricetta non implementa
														// comparable
		for (Ricetta ricetta : ricette) {
			mappa.put(ricetta.getId(), ricetta);
		}
		return mappa;
	}


	@Override
	public void addRicetta(Ricetta r) {
		this.ricette.add(r);
	}

	@Override
	public void addRicetta(String nome, String regione) {
		this.ricette.add(new Ricetta(nome, regione));
	}

	@Override
	public Ricetta getRicettaById(int id) {
		return ricetteMap.get(id);
	}

	@Override
	public List<Ricetta> getAll() {
		return ricette;
	}

	@Override
	public List<Ricetta> getAllByRegione(String regione) {
		List<Ricetta> ricetteFiltrate = new ArrayList<Ricetta>();
		for (Ricetta ricetta : ricette) {
			if (ricetta.getRegione().equals(regione)) {
				ricetteFiltrate.add(ricetta);
			}
		}
		return ricetteFiltrate;
	}

	@Override
	public void updateRicetta(Ricetta r) {
		Ricetta ricetta = ricetteMap.get(r.getId());
		ricetta = r;
	}

	@Override
	public void deleteRicetta(int id) {
		ricetteMap.remove(id);
	}

}
