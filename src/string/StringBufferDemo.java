package string;

public class StringBufferDemo {

	public static void main(String[] args) {

		// Not Thread safe class
		StringBuilder sb1 = new StringBuilder();
		///////////////////////////////////////
		StringBuffer sb = new StringBuffer("java");
		// Thread safe class
		System.out.println(sb);
		// sb.append("-python");
		// sb.reverse();
		System.out.println(sb.capacity());
		// String s = sb.substring(0, 2);
		sb.setCharAt(1, 'p');
		// sb.delete(0, 2);
		// sb.deleteCharAt(index)
		sb.insert(1, "*-*-*-*");

		// System.out.println(s);
		System.out.println(sb);
	}
}
