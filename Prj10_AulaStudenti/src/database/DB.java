package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Studente;

public class DB {

	private static ArrayList<Studente> studenti = new ArrayList<Studente>();
	
	//per riempire contenitore dal file di testo
	public static  void inizializza() throws FileNotFoundException {
		
		File f = new File("files/studenti.txt");
		
		Scanner sc = new Scanner(f);
		
		while (sc.hasNextLine()) {
			String riga = sc.nextLine();	
			String[] parole = riga.split(",");
			
			String nome = parole[0];
			String cognome = parole [1];
			
			Studente s = new Studente(nome, cognome);
			studenti.add(s);
		
		}
		
		
	}

	//metodo che ritorna il contenitore
	public static ArrayList<Studente> getStudenti() {
		return studenti;
	}
	
	
	
}
