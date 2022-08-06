package exception;

public class AssertDemo {

	public static void main(String[] args) {

		int a =15;
		assert a>=20:"check value";
		System.out.println(a);

		assert(a%2 ==0):"odd";
	}
}
