package lambda;


interface Courier{
	
	void supply();
}

public class Product implements Courier{

	@Override
	public void supply() {
		
		System.out.println("suplly");
	}
	
	public static void main(String[] args) {
		
		Courier c = new Product();
		c.supply();
	}

	
}
