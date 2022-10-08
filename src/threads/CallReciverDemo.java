package threads;

class Calling {

	public synchronized void call(int flag) {
		
		System.out.println(Thread.currentThread().getName() + " Is running");
		if(flag==1) {
			
			System.out.println("Another thread is on waiting");
			try {
				System.out.println(Thread.currentThread().getName() + " Is going to waiting");
				wait();
				System.out.println(Thread.currentThread().getName() + "  is started...");
				System.out.println(Thread.currentThread().getName() + " is going on");
				Thread.sleep(1000);
				//
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Person1 extends Thread {

	Calling c;

	public Person1(Calling c) {
		this.c = c;
	}

	@Override
	public void run() {

		c.call(1);
	}

}

class Person2 extends Thread {

	Calling c;

	public Person2(Calling c) {
		this.c = c;
	}

	@Override
	public void run() {

		c.call(1);
	}

}

public class CallReciverDemo extends Thread {

	public static void main(String[] args) {

		Calling c = new Calling();
		Person1 p1 = new Person1(c);
		Person2 p2 = new Person2(c);

		p1.setName("P1");
		p2.setName("P2");
		p1.start();
		p2.start();

	}

}
