package threads;

public class ThreadDeadLock {

	public static void main(String[] args) {

		final String res1 = "India";
		final String res2 = "Usa";

		Thread t1 = new Thread() {

			
			public void run() {
				synchronized (res1) {
					System.out.println("Thread 1:locked resource 2");
				}
				
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (res2) {
				
					System.out.println("Thrad1 locked resource 1");
				}
			}
		};
		
		Thread t2 = new Thread() {

			
			public void run() {
				synchronized (res1) {
					System.out.println("Thread 2:locked resource 1");
				}
				
				
				
				synchronized (res1) {
				
					System.out.println("Thrad2 locked resource 2");
				}
			}
		};

		t1.start();
		t2.start();
	}
}
