package lab03;

public class Studente {
//proprietà con access modifier, privato: non si vede da nessuna parte, public: lo vedono tutti, se non inserisco nulla: rimane nel package
	private static int contatore = 1;
	private String nome;
	private int matricola;
	
//costruttore	
	
	public Studente(String nome) {
		this.matricola = contatore ++;
		this.nome = nome;
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

	//to string, ritorna una stringa e in particolare quella che indichi
	@Override
	public String toString() {
		return "matricola " + matricola + ", " + nome;
	}
	

	
	
}
