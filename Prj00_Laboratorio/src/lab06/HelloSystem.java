package lab06;

import java.util.Properties;

public class HelloSystem {

	public static void main(String[] args) {

		
		String property = System.getProperty("java.vendor");
		System.out.println(property);
		
		
		//se voglio sapere tutte le proprietà
		Properties properties = System.getProperties();
		
		//tipo Properties: file di testo che contengono chiave = valore, sono implicitamente stringhe (no apici), solitamente ci si mettono le password
		properties.list(System.out); //mi manda in out tutte le proprietà
	}

}
