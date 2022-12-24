package lambda;

@FunctionalInterface
interface msg{
	
	//functional interface
	// public abstract void
	void messaging();
	//void messaging1();
		
}

public class MsgDemo {

	public static void main(String[] args) {
		
		msg m = ()->{
			System.out.println("messaging...");
		};
		m.messaging();
	}
}
