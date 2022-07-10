package enums;

enum Color {

	red("101"), blue("102"), green("103");

	String value;

	private Color(String c) {

		this.value = c;
	}
}

public class EnumDemo1 {

	public static void main(String[] args) {

		System.out.println(Color.red.value);
		System.out.println(Color.blue);
	}
}
