package array;

import methods.VariableDemo2;

public class VarArgsDemo2 {

	public void demo(String string) {

		System.out.println(string);
	}

	public void demo2(String... strings) {

		for (String s : strings) {

			System.out.println(s);
		}

	}

	public static void main(String[] args) {

		VarArgsDemo2 v = new VarArgsDemo2();
		v.demo("sam");

		v.demo2("sam", "raj", "parth");

	}
}
