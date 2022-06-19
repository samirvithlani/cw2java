package oops.constructor;

public class ThisDemo {

	int x,amount;

	public ThisDemo() {

		x = 100;
		amount = 0;
	}

	void demo() {

		// local variable..
		int x = 150;
		System.out.println(this.x);
	}
	
	void sum(int amount) {
		
		this.amount = this.amount + amount;
		System.out.println(this.amount);
	}

	public static void main(String[] args) {

		ThisDemo t1 = new ThisDemo();
		t1.demo();
		t1.sum(1580);
	}
}
