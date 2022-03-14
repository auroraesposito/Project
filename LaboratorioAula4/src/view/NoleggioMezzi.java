package view;

import java.util.Random;

import anagrafica.AnagraficaClienti;
import controller.VeicoliNoleggio;
import model.Noleggiabile;
import model.Veicolo;
import model.clienti.Cliente;

public class NoleggioMezzi {

	public static void main(String[] args) {
		
		VeicoliNoleggio ctrlNolo = new VeicoliNoleggio();
		
		//ctrlNolo.getVeicoliList().stream().forEach(System.out::println);
		
		
		//ctrlNolo.getVeicoliList().stream().filter(v -> (v instanceof Noleggiabile)).forEach(System.out::println);
	
	//Cliente cliente = AnagraficaClienti.clienti.get(2);
		
		Random r = new Random();
	
	for (Cliente c : AnagraficaClienti.clienti.values()) {
		
		Veicolo v = ctrlNolo.getVeicoliList().get(r.nextInt(ctrlNolo.getVeicoliList().size()));
		
		ctrlNolo.addNoleggio(v, c);
	}
	
	ctrlNolo.addNoleggio(ctrlNolo.getVeicoliList().get(0), AnagraficaClienti.clienti.get(3));
	
	ctrlNolo.printNoleggi("C:\\Users\\sviluppo.EDU-IL\\Desktop\\noleggi.txt");
	
	}
	
}
