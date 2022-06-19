package array;

public class VarArgs {

	void demo(int a) {

		System.out.println(a);
	}

	void demo1(int... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//System.out.println(a);
	}

	public static void main(String[] args) {

		VarArgs v = new VarArgs();
		v.demo(15);
		v.demo1(10, 20, 30, 40);
	}
}
