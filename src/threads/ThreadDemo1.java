package threads;

public class ThreadDemo1 extends Thread{

	
	public void run() {
	
		if(Thread.currentThread().getName().equals("t1")) {
			
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i=0;i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+"is printing "+ i);
		}
	}
	public static void main(String[] args) {
	
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		
		//main therea (method)
//		try {
//			Thread.sleep(1);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		t2.start();
		
	}
}
