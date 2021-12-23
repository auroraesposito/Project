package model;

public class Sacco {

	private int id;
	private Dono [] doni;
	
	
	public Sacco(int id) {
		this.id = id;
		this.doni = new Dono[10];
	}


	public int getId() {
		return id;
	}


	public Dono[] getDoni() {
		return doni;
	}
	
	public String etichetta() {
		String etichetta = "";
		// += significa : a quella stringa inizialmente vuota aggiungi
		etichetta += "Id sacco n. " + this.id;
		etichetta += "Elenco doni ";
		
		for (int i = 0; i < doni.length; i++) {
			if (doni[i] != null) {
				etichetta += doni[i].etichetta();
			}
		}
		
		return etichetta;
	}
	
	
	
	
	
	
}
