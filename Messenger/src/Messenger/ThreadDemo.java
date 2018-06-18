package Messenger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadDemo {

	static class Zaehlen implements Runnable {

		@Override
		public void run() {
		
			for(int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "zählt" + i); //mit Aufruf vom Namen
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Zaehlen());
		Thread t2 = new Thread(new Zaehlen());
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		//Threads Namen geben
		t1.setName("Erster	:");
		t2.setName("Zweiter	:");
		
		System.out.println("Start");
		executor.execute(t1);
		executor.execute(t2);
		executor.shutdown();
		
		try {
			while(!executor.awaitTermination(1, TimeUnit.SECONDS)) {
				System.out.println("Das Zählen läuft noch");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ende");
	}

}
