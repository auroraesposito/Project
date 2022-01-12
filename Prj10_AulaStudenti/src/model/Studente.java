package model;

public class Studente {
//proprietà con access modifier, privato: non si vede da nessuna parte, public: lo vedono tutti, se non inserisco nulla: rimane nel package
	private int matricola;
	
	private static int contatore = 1;
	private String nome;
	private String cognome;
	
	
	
//costruttore	
	
	public Studente(String nome, String cognome) {
		this.matricola = contatore ++;
		this.nome = nome;
		this.cognome = cognome;
	}
//getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	//to string, ritorna una stringa e in particolare quella che indichi
	@Override
	public String toString() {
		return " " + matricola + ") " + nome + " " + cognome;
	}
	

	
	
}
