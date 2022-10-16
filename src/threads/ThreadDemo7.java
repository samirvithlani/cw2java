package threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Bank {

	Lock lock = new ReentrantLock();

	public  void print(int no) {

		
		System.out.println(Thread.currentThread().getName()+"accesing lock");
		try {
			
			System.out.println(Thread.currentThread().getName()+ " trying to get lock");
			lock.tryLock(10,TimeUnit.MILLISECONDS);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i <= 100; i++) {

			System.out.println(Thread.currentThread().getName()+" holded lock");
			System.out.println(i + " * " + no + " = " + i * no);
		}
		lock.unlock();
		
		
		

		
	}

}

class icici extends Thread {

	Bank b;

	public icici(Bank b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {
		b.print(100);
	}

}

class Hdfc extends Thread {

	Bank b;

	public Hdfc(Bank b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {

		b.print(50);
	}

}
class Sbi extends Thread {

	Bank b;

	public Sbi(Bank b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {

		b.print(5);
	}

}

public class ThreadDemo7 {

	public static void main(String[] args) {

		Bank b = new Bank();
		icici i = new icici(b);
		Hdfc h = new Hdfc(b);
		Sbi s = new Sbi(b);
		

		i.setName("I");
		h.setName("H");
		s.setName("S");

		i.start();
		h.start();
		s.start();

	}
}
