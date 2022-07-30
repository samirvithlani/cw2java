package oops;

class Parent {

	public void demo() {

	}

	public Parent get() {

		return new Parent();
	}
}

public class CovDemo extends Parent {

	public void demo() {
		// TODO Auto-generated method stub

	}

	public CovDemo get() {
		// TODO Auto-generated method stub

		return new CovDemo();
	}
}
