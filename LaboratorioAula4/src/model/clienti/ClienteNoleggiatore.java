package model.clienti;

import java.util.ArrayList;
import java.util.List;

import model.Veicolo;

public class ClienteNoleggiatore extends Cliente{

	private List<Veicolo> noleggi;
	public ClienteNoleggiatore(String nome) {
		super(nome);
		this.noleggi = new ArrayList<Veicolo>();
	}
	
	public void addNoleggio(Veicolo v) {
		noleggi.add(v);
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString() + "\nnoleggi: " + noleggi.size();
}
	
	
}
