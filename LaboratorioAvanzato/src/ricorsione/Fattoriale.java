package ricorsione;

public class Fattoriale {

	public static void main(String[] args) {
		int x = 5;
		int res = calcolaFatt(x);
		System.out.println(res);

		
	
	}

	private static int calcolaFatt(int x) {//5
		
		if(x==0) {
			return 1;
		}else {
			System.out.println("il valore di x è:" + x);
			return x * calcolaFatt(x -1);
		}
		
	}
	
	private static int fatt2(int n) {
		int res = 1;
		
		for (int i = 0; i<=n; i++) {
			
		}
	}
	
	
}
