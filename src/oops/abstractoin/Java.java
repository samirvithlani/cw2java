package oops.abstractoin;

/*
 *  pure virtual function -->abstract method
 * 
 * */
abstract class Tech {

	// dead class
	abstract void lanaguage();
	// non abstract
	
	//abstraction --> 0 to 100%

	void compiler() {

		System.out.println("compiler...");
	}
	
	public static void main(String[] args) {
		
	}

}

class Python extends Tech {

	void lanaguage() {

		System.out.println("python called..");

	}

}

public class Java extends Tech {

	void lanaguage() {

		System.out.println("java language called...");

	}

	public static void main(String[] args) {

		
		//we can not create an object of abstract class
		//Tech t = new Tech(); -->comilatoin error....
		
		// polymorphic ,object
		// run time polymorephisam -->parent class reference and child class object
		Java j = new Java();
		j.lanaguage();
		Tech t = new Java();
		Tech t1 = new Python();
		t1.compiler();

		t.lanaguage();
		t1.lanaguage();

	}

}
