package methods;

//diff static method and non static method...
// 1)non static copy -->at every call, it can be called by object only, 
///2)static single copy... it can be called by class name, it violates oops methodolgy
public class MethodDemo2 {

	public static void demo1() {
		System.out.println("static method wo r wo a");
	}
	public static int sum(int a,int b) {
		
		
		return a + b;
 	}

	public static void main(String[] args) {

//		MethodDemo2 m2 = new MethodDemo2();
//		m2.demo1();
		MethodDemo2.demo1();
		System.out.println(MethodDemo2.sum(150, 200));
	}
}
