package lab03;

import java.util.ArrayList;

public class ProvaArrayList {

	public static void main(String[] args) { //static significa che appartiene alla classe

		ArrayList<Studente> studenti = new ArrayList<Studente>();
		studenti.add(new Studente("Daniele Sudosi"));
		studenti.add(new Studente("Simone Sudosi"));
		studenti.add(new Studente("Matteo Gamba"));
		studenti.add(new Studente("Dora Koncz"));
		studenti.add(new Studente("Aurora Esposito"));
		studenti.add(new Studente("pippo"));
		studenti.add(new Studente("ciccio"));
		studenti.add(new Studente("caio"));
		

		// foreach: ciclo che scorre la collezione da primo a ultimo
		for (Studente studente : studenti) {
			System.out.println(studente);
		}

//		Studente [] studenti = new Studente[10];
//		
//		studenti[0] = new Studente("Daniele Sudosi", 1);
//		studenti[1] = new Studente("Simone Sudosi", 2);
//		
//		
//		System.out.println(s1.getMatricola());
//		System.out.println(s1.getNome());
//		
//		System.out.println(s1);
//		System.out.println(s2);

	}

}
