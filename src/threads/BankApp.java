package threads;

class Banking {

	int amount = 2500;

	public synchronized void withdraw(int bal) {

		System.out.println("inside withdraw..");
		System.out.println("checking bal");
		try {
			wait();
			System.out.println("tracaction successfulll");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public synchronized void checkBalance(int bal) throws Exception {

		System.out.println("inside check..");
		if (bal < amount) {
			notify();
		} else {
			
			throw new Exception("insufficent balance..");
			
			
		}
	}

}

class WithClass extends Thread {

	Banking b;

	public WithClass(Banking b) {
		this.b = b;
	}

	@Override
	public void run() {
		b.withdraw(15000);
	}
}

class Checkbal extends Thread {

	Banking b;

	public Checkbal(Banking b) {
		this.b = b;
	}

	@Override
	public void run() {

		try {
			b.checkBalance(15000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class BankApp {

	public static void main(String[] args) {

		Banking b = new Banking();
		WithClass w = new WithClass(b);
		Checkbal c = new Checkbal(b);

		w.start();
		c.start();

	}
}
