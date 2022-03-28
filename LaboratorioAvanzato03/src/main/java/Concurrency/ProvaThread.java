package Concurrency;

public class ProvaThread {

	public static void main(String[] args) {
		
		System.out.println("sono il main thread");
		
		Runnable r1 = () -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Runnable r2 = () -> System.out.println("sono il thread r2");
			
		//r1.run();
		new Thread(r1).start();
		new Thread(r2).start();
		
		System.out.println("ehi! sono il thread r1");

		MioThread mt = new MioThread();
		
		mt.start();
		
	}

}
