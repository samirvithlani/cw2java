package lambda;

@FunctionalInterface
interface call{
	
	void calling();
}
public class CallDemo implements call {

	
	public void calling() {
		
		System.out.println("calling");
		
	}
	
	public static void main(String[] args) {
		
		call c = new CallDemo();
		c.calling();
	}

}
