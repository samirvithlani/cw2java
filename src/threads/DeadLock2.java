package threads;

class ThreadDemo11 extends Thread {
	public static Object lock1;
	public static Object lock2;

	public ThreadDemo11(Object lock1, Object lock2) {

		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {
		
		synchronized (lock1) {
		
			System.out.println("Thread 1 locked lock 1");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 1 is waiting for lock 2");
		synchronized (lock2) {
		
			System.out.println("Thread 1 locked lock 1 & 2");
		}

	}
}

class ThreadDemo22 extends Thread {

	public static Object lock1;
	public static Object lock2;

	public ThreadDemo22(Object lock1, Object lock2) {

		this.lock1 = lock1;
		this.lock2 = lock2;

	}

	@Override
	public void run() {
		
		synchronized (lock2) {
		
			System.out.println("Thread 2 locked lock 1");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 2 is waiting for lock 2");
		synchronized (lock1) {
		
			System.out.println("Thread 2 locked lock 1 & 2");
		}

	}
}

public class DeadLock2 {

	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {

		ThreadDemo11 t1= new ThreadDemo11(lock1, lock2);
		ThreadDemo22 t2 = new ThreadDemo22(lock1, lock2);
		t1.start();
		t2.start();
	}
}
