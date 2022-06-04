package methods;

public class VariableDemo3 {

	final float intRate = 7.5f;

	public void display() {

		// final variable can not be changed..
		// intRate = 7.6f; compilation error
		System.out.println(intRate);
	}

	public static void main(String[] args) {

		VariableDemo3 v1 = new VariableDemo3();
		v1.display();

	}
}
