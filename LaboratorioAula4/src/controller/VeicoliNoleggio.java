package controller;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import anagrafica.AnagraficaVeicoli;
import model.Veicolo;
import model.clienti.Cliente;
import model.clienti.ClienteNoleggiatore;
import model.clienti.ClienteNonNoleggiatoreException;

class Noleggio {

	Veicolo v;
	Cliente c;
	LocalDate dataNoleggio;

	public Noleggio(Veicolo v, Cliente c) {
		super();
		this.v = v;
		this.c = c;
		this.dataNoleggio = LocalDate.now();
		((ClienteNoleggiatore)c).addNoleggio(v);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.dataNoleggio + ") " + this.c + " " + this.v;
	}

}

public class VeicoliNoleggio {

	List<Noleggio> noleggi = new ArrayList<Noleggio>();

	public List<Veicolo> getVeicoliList() {

		return AnagraficaVeicoli.veicoliList;

	}

	public void addNoleggio(Veicolo v, Cliente c) {

		if(c instanceof ClienteNoleggiatore)
		noleggi.add(new Noleggio(v, c));
		else {
			try {
				
				throw new ClienteNonNoleggiatoreException("Per noleggiare devi diventare un cliente premium");
			}
		 catch (ClienteNonNoleggiatoreException e) {
			System.err.println(e.getMessage());
		}
		}

	}

	public List<Noleggio> getNoleggi() {
		return noleggi;
	}

	
	public void printNoleggi(String nomeFile) {
		
		//try with resource
		
		try(BufferedWriter out = new BufferedWriter(new FileWriter(  nomeFile))){
			
			for (Noleggio n : noleggi) {
				out.write(n.toString());
				out.write("\n--------------------------------------\n");
		}
		
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	
}
