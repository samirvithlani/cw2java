package threads;

class Thread1 extends Thread{

	@Override
	public void run() {
		for(int i=100;i<=1000;i+=100) {
			System.out.println(Thread.currentThread().getName() + " i = "+i);
		}
		
	}
}

class Thread2 extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() + " i = "+i);
		}
		
		//System.out.println(Thread.currentThread().getName());
	}
	
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.setName("A");
		t2.setName("B");
		t1.start();
		t2.start();
		
	}
}
