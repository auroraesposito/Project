package dal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.CapoAbbigliamento;
import model.Maglia;
import model.Pantalone;
import model.Taglia;

public class CapoDAOImpl implements CapoDAO {

	Map<Integer, CapoAbbigliamento> inventario = new HashMap<Integer, CapoAbbigliamento>();

	{// per inizializzare le classi, viene runnato prima ancora del costruttore
		String[] capi = { "Maglia marlena",  "Pantalone body", "Maglia lady", "Pantalone skinny", };

		for (String string : capi) {
			if (string.startsWith("Maglia")) {
				Maglia m1 = new Maglia(string, Taglia.S);
				Maglia m2 = new Maglia(string, Taglia.M);
				Maglia m3 = new Maglia(string, Taglia.L);
				inventario.put(m1.getCodArt(), m1);
				inventario.put(m2.getCodArt(), m2);
				inventario.put(m3.getCodArt(), m3);
				
			} else if (string.startsWith("Panta")) {
				Pantalone p1 = new Pantalone(string, Taglia.S);
				Pantalone p2 = new Pantalone(string, Taglia.M);
				Pantalone p3 = new Pantalone(string, Taglia.L);
				Pantalone p4 = new Pantalone(string, Taglia.XL);
				inventario.put(p1.getCodArt(), p1);
				inventario.put(p2.getCodArt(), p2);
				inventario.put(p3.getCodArt(), p3);
				inventario.put(p4.getCodArt(), p4);
			}

		}
	}

	@Override
	public void addCapo(CapoAbbigliamento capo) {
		this.inventario.put(capo.getCodArt(), capo);
	}

	@Override
	public CapoAbbigliamento getCapo(int codArt) {
		// TODO Auto-generated method stub
		return this.inventario.get(codArt);
	}

	@Override
	public List<CapoAbbigliamento> getCapi() {
		List<CapoAbbigliamento> capi = new ArrayList<CapoAbbigliamento>();// elemento vuoto
		Collection<CapoAbbigliamento> values = this.inventario.values(); //sono a livello di collezione e non di lista, no cast da un livello superiore a uno inferiore
		for (CapoAbbigliamento capoAbbigliamento : values) { //per ogni elemento della collezione aggiungo il valore
			capi.add(capoAbbigliamento);
		}
		return capi;
	}

	@Override
	public void updCapo(CapoAbbigliamento capo) {
		//primo modo
		//CapoAbbigliamento daModificare = this.inventario.get(capo.getCodArt());
		//daModificare = capo;
		//secondo modo
		this.inventario.put(capo.getCodArt(), capo);
		
	}

	@Override
	public void delCapo(int codArt) {
		this.inventario.remove(codArt);
	}

}
