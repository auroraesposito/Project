package lab06;

public class HelloVarargs {

	public static void main(String[] args) {
		
		System.out.println(calcolaMedia(24,26,28));
		System.out.println(calcolaMedia(24,26,28,30));
		System.out.println(calcolaMedia(24,26,28,24,28,25,29));
		
		

	}

	//dichiarando int... non sono obbligata a passare in argomento un array, ma lo deduce dalle proprietà che gli do (.length)
	private static double calcolaMedia(int... voti) {
		
		double totale = 0, media = 0;
		
		for (int i : voti) {
			totale += i;
		}
		
		media = totale/(voti.length);
		return media;
	}
	
}

