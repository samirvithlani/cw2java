package threads;

class Mobile {

	public synchronized void runningCall(int flag) {

		System.out.println("Call is running...");
		try {
			Thread.sleep(10000);
			if (flag == 1) {

				System.out.println("new call is on wait...");
				System.out.println("ongoing call is putting on hold..");
				System.out.println("new call is about to recived..");
				wait();
				System.out.println("Holded call recived");
				System.out.println("ongoing call is ended..");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public synchronized void newCall() {

		System.out.println("New call recived...");
		System.out.println("new call is goinong");
		try {
			Thread.sleep(10000);
			System.out.println("new call is about to end...");
			System.out.println("notifying holded call...");
			notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class per1 extends Thread {

	Mobile m;

	public per1(Mobile m) {

		this.m = m;
	}

	@Override
	public void run() {
		m.runningCall(1);
	}

}

class per2 extends Thread {

	Mobile m;

	public per2(Mobile m) {
		super();
		this.m = m;
	}

	@Override
	public void run() {
		m.newCall();
	}

}

public class CallDemo {

	public static void main(String[] args) {

		Mobile m = new Mobile();
		per1 p1 = new per1(m);
		per2 p2 = new per2(m);

		
		
		p1.setName("p1");
		p2.setName("p2");

		p1.start();
		p2.start();

	}

}
