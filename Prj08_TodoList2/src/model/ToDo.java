package model;

public class ToDo {

	//primo passo: indico le proprietà della classe
	private boolean completo;
	private String descrizione;
	
	//secondo passo - metodo costruttore: passo degli argomenti per inizializzare l'oggetto di tipo todo
	//new todo("pane"): sarà creato un oggetto dove la stringa pane sarà utilizzata per dare descrizione al todo
	public ToDo(String descrizione) { 
		this.descrizione = descrizione; 
		this.completo = false;
		System.out.println("Hai inserito");
		}

	
	//terzo passo: metto getters per ottenere i dati e setters per modificare le proprietà
	//ne abbiamo bisogno perchè abbiamo reso private le proprietà: incapsulamento
	public boolean isCompleto() {
		return completo;
	}

	public void setCompleto(boolean completo) {
		this.completo = completo;
	}

	public String getDescrizione() {
		//return descrizione;
		//se voglio dire di aggiungere la descrizione in maiuscolo
		return descrizione.toUpperCase();
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	//creato modello toString
	@Override
	public String toString() {
		return "ToDo [completo=" + completo + ", descrizione=" + descrizione + "]";
	}
	
	
	
}
