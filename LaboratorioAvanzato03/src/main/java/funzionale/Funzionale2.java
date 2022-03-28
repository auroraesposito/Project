package funzionale;

import java.util.Arrays;
import java.util.Comparator;

class Comparatore implements Comparator<Studente>{

	@Override
	public int compare(Studente s1, Studente s2) {
		// TODO Auto-generated method stub
		return s1.getCognome().compareTo(s2.getCognome());
	}
	
	
	
	
	
	
}



public class Funzionale2 {

	public static void main(String[] args) {
		
		Studente s1 = new Studente("fabio", "zamoruso");
		Studente s2 = new Studente("matteo", "agamba");
		
		Studente[] studenti = {s1, s2};
		
		List<Studente> studentiList = Arrays.sort(studenti);
		
		Comparatore c = new Comparatore();
		
		studentiList.sort(c);
		
		System.out.println(studentiList);
	}
	
	
	
}
