package threads;

public class ThreadDemo6 implements Runnable{

	
	public static void main(String[] args) {
		
	
		ThreadDemo6 t = new ThreadDemo6();
		Thread t1 = new Thread(t,"A");
		Thread t2 = new Thread(t,"B");
		Thread t3 = new Thread(t,"C");
		
		//t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(5);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.run();
		t2.run();
		t3.run();
		
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName()+"thread is runnign.."+Thread.currentThread().getPriority());
	}
}
