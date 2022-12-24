package lambda;

@FunctionalInterface
interface Banking{
	
	int withdraw(int w);
	
	
}
public class BankDemo {

	
	public static void main(String[] args) {
		
		Banking b = (w)->{
			
			return w*2;
		};
		System.out.println(b.withdraw(1500));
	}
}
