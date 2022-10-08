package threads;

class Printing {

	public synchronized void print(int no) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i + " * " + no + " = " + i * no);
		}
	}
}

class Thread11 extends Thread {

	// new key word??
	Printing p;

	public Thread11(Printing p) {

		this.p = p;

	}

	@Override
	public void run() {

		p.print(100);
	}

}

class Thread22 extends Thread {

	Printing p;

	public Thread22(Printing p) {

		this.p = p;
	}

	@Override
	public void run() {

		p.print(50);

	}
}

public class ThreadDemo4 {

	public static void main(String[] args) {

		Printing p = new Printing();
		Thread11 t1 = new Thread11(p);
		Thread22 t2 = new Thread22(p);
		t1.start();
		t2.start();
	}
}
