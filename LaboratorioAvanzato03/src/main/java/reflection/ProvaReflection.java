package reflection;

import java.lang.reflect.Constructor;

import prova.Prodotto;

public class ProvaReflection {

	public static void main(String[] args) {
		
		Prodotto pr = new Prodotto() {
			
		};
		
		Class<? extends Prodotto> class1 = pr.getClass();
		
		System.out.println(class1.getName());
		
		Constructor<?>[] constructors = class1.getConstructors();
		System.out.println("costruttori: " + constructors.length);
	}

}
