package methods;

public class VariableDemo1 {

	// global -> instance varible ==> class level varible...
	// static variable non static non static variable....
	// instance varible must be instialize inside constructor
	// non static variable....
	// instance non static varible can not use inside static method
	// non static instance varible can be access inside static method but only
	// through object
	int x;
	static int y;

	public void demo() {

		System.out.println(x);
		//sttaic variable can be used inside non static method without object aslo
		System.out.println(y);
	}

	public static void main(String[] args) {

		VariableDemo1 v1 = new VariableDemo1();
		v1.x = 100;
		v1.demo();
		//sttaic variable can be used inside  static method without object aslo
		System.out.println(y);
		
		// System.out.println(x); compilation erro
		// local variable
		// scope of local variable is only within method block
	}

}
