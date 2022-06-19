package oops.constructor;

/*
 * 1 --> default  --> compiler[JVM] default..
 * */

class RGB {

	public RGB(int c) {
		System.out.println("param");
	}
}

public class Color extends RGB {

	public Color() {
		super(150);
		System.out.println("default const..");
	}

	public Color(int ccode) {
		//System.out.println(""); comilation error
		super(150);
		System.out.println("param" + ccode);
	}

	public static void main(String[] args) {

		// instance..
		Color c = new Color(15);

	}
}
