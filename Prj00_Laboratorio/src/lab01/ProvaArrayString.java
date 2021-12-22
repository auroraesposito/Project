package lab01;

import java.util.Arrays;

public class ProvaArrayString {

	public static void main(String[] args) {
		
		
		String[] nani = new String[7]; //array di stringhe, devo dare new ed indicare la grandezza dell'array
		
		nani[0] = "pisolo";
		nani[1] = "eolo";
		nani[2] = "mammolo";
		nani[3] = "gongolo";
		nani[4] = "cucciolo";
		nani[5] = "dotto";
		nani[6] = "brontolo";
		
		/*Oppure si può fare
		String[] nani = {
		"pisolo",
		"eolo",
		"mammolo",
		"gongolo",
		"cucciolo",
		"dotto",
		"brontolo",
		};
		*/
		
		int lunghezza = nani.length; //length è una proprietà negli array e non un metodo come per le string
		
		//metodi e proprietà statiche sono possedute dalla classe. Ordino un array
		Arrays.sort(nani);
		
		
		for (int i = 0; i < nani.length; i++) {
			if(nani[i].length() > 5)
			System.out.println(nani[i]);
		}
		
		
		
		
		

	}

}
