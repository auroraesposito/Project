package Concurrency;

public class MioThread extends Thread{

	//dobbiamo definire cosa succede quando questo thread runna
	@Override
	public void run() {
		int volte = 5;
		
		for (int i = 1; i <= volte; i++) {
			System.out.println("ehi! sono il thread MioThread" +  i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	
	
	
}
