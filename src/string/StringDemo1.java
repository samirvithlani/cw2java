package string;

public class StringDemo1 {

	public static void main(String[] args) {

		String s1 = "java";
		// String str = new String("java");

//		s1 = s1.concat("-python");
		System.out.println(s1.isEmpty());
		boolean em = s1.isEmpty();
		System.out.println(em);
		if (s1.isEmpty()) {
			System.out.println("string is empty");
		} else {
			System.out.println("string is not empty");
		}
		// System.out.println(s1.concat("-abc"));

		System.out.println("compare to -->" + s1.compareTo("JAVA"));
		System.out.println("compare to ec"+s1.compareToIgnoreCase("java"));

		System.out.println("equals -->" + s1.equals("java"));
		System.out.println("equal eq"+s1.equalsIgnoreCase("JAVA"));

		System.out.println("contains ->" + s1.contains("@"));

		System.out.println("ends with.." + s1.endsWith("j"));
		System.out.println("starts with " + s1.startsWith("a"));

		System.out.println(s1.indexOf("a"));
		System.out.println(s1.lastIndexOf("a"));

		System.out.println("length..." + s1.length());
		System.out.println("char at ->" + s1.charAt(1));
		byte[] b1 = s1.getBytes();

		for (byte b : b1) {

			System.out.println(b);
		}

		//s1 = s1.replace('j', 's');
		String str = "  python   ";
		System.out.println(str.length());
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
		System.out.println(str.length());
		
		//s1 = s1.replace("ja", "xa");
		s1 = s1.toUpperCase();
		System.out.println(s1);
		s1 = s1.toLowerCase();
		System.out.println(s1);
		
		// System.out.println(str);
	}
}
