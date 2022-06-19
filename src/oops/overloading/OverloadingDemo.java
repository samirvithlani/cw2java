package oops.overloading;

/*
 * polymorephisam : many form of function.
 * 
 * 2 type
 * runtime poly / dynamic binding    compile runtime / static binding
 * overriding,       					overloaidng  function,ol* ++
 * 
 * */

/*
 * ol = function with same name but diff args
 * 
 * */
public class OverloadingDemo {

	void order() {
		System.out.println("order function called with no args");
	}
	void order(String fname) {
		
		System.out.println("order called with fname");
	}
	
	void order(int price) {
		
		System.out.println("order with price"+price);
	}
	
	void order(long price) {
		
		System.out.println("order function called with long"+price);
	}
	void order(short price) {
		
		System.out.println("order function called with short "+price);
	}
	void order(float order) {
		System.out.println("order function called with float"+order);
	}
	void order(double order) {
		System.out.println("order function called with double..."+order);
	}
	
	void order(int x,int y) {
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		OverloadingDemo obj = new OverloadingDemo();
		obj.order(9898989899898l);
		obj.order(15480.25f);
		obj.order(0);
		
		
	}
	
	
	
}
