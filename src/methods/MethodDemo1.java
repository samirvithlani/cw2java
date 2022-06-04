package methods;

//1 java --> n
//1 java -->public 1
//main method must be inside of public class
//all non static method coverd....

public class MethodDemo1 {

	// resublity//readblity
	// static method non static method...

	public void demo1() {
		System.out.println("non static wo rtype wo args");
	}

	public String demo2() {

		return "hello ";
	}

	public String demo3(String name) {

		return name.toUpperCase();
	}

	public static void main(String[] args) {

		// MethodDemo1 m1; reference-->
		// JVM ->java virtual machine..-> classLoader call --> class memory load....
		MethodDemo1 m1 = new MethodDemo1();
		m1.demo1();
		String res = m1.demo2();
		System.out.println(res);
		System.out.println(m1.demo2());
		System.out.println(m1.demo3("raj"));

	}
}
