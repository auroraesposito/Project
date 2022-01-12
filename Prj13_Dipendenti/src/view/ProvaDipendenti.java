package view;

import java.util.ArrayList;

import controller.Dipendenti;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class ProvaDipendenti {

	public static void main(String[] args) {
		
		Dipendenti controller = new Dipendenti();
		
		controller.addDipendente(new Fattorino("giuseppe", "verdi"));//devo aggiungere un sottotipo di dipendente. non si può aggiungere dipendente perchè è una classe aastratta
		controller.addDipendente(new Fattorino("giuseppe", "garibaldi"));
		controller.addDipendente(new Fattorino("dante", "alighieri"));
		controller.addDipendente(new Fattorino("gioacchino", "rossini"));
		controller.addDipendente(new Fattorino("carlo", "alberto"));
		
		controller.addDipendente(new Impiegato("cristoforo", "colombo"));
		controller.addDipendente(new Impiegato("marco", "polo"));
		controller.addDipendente(new Impiegato("amerigo", "vespucci"));

		controller.addDipendente(new Dirigente("pietro", "micca"));
		
		ArrayList<Dipendente> libromatricola = controller.getLibromatricola(); //Alt + Shift + L
		
		for (Dipendente dipendente : libromatricola) {
			
			if (dipendente instanceof Fattorino) {
				System.out.println("è un fattorino!!!");
				//cast: forzo il dipendente ad essere fattorino
				((Fattorino)dipendente).setConsegne(100);
			}
			
			if (dipendente instanceof Impiegato) {
				System.out.println("è un impiegato!!!");
				//cast: forzo il dipendente ad essere impiegato
				((Impiegato)dipendente).setGiorniLavoro(20);;
			
			if (dipendente.getMatricola() == 7) {
				((Impiegato) dipendente).setGiorniLavoro(22);
			}
			}
			
			System.out.println(dipendente);
		}
		
		System.out.println(controller.getDipendenteById(7));
	}

}
