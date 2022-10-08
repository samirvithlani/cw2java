package threads;

public class ThreadDemo3 extends Thread {

	// runnable interface...
	public void run() {

		if (Thread.currentThread().getName().equals("A")) {

			for (int i = 1; i <= 10; i++) {

				System.out.println("Thread  = " + Thread.currentThread().getName() + " - " + i);
			}
		}
		if (Thread.currentThread().getName().equals("B")) {

			for (int i = 100; i <= 1000; i += 100) {

				System.out.println("Thread  = " + Thread.currentThread().getName() + " - " + i);
			}
		}
		if (Thread.currentThread().getName().equals("C")) {

			for (int i = 5000; i <= 15000; i += 1000) {

				System.out.println("Thread  = " + Thread.currentThread().getName() + " - " + i);
			}
		}
	}

	public static void main(String[] args) {

		ThreadDemo3 t1 = new ThreadDemo3();
		ThreadDemo3 t2 = new ThreadDemo3();
		ThreadDemo3 t3 = new ThreadDemo3();

		t1.setName("A");
		t2.setName("B");
		t3.setName("C");

		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();

	}
}
