
public class BlockDemo {

	static {
		System.out.println("static block");
	}
	static{
	System.out.println("static 2");
	}

	{
		System.out.println("instance block...");
	}
	{
		System.out.println("instance 2");
	}
	public BlockDemo() {
		
		System.out.println("constructor..");
	}

	public static void main(String[] args) {

		System.out.println("main");
		
		BlockDemo b1 = new BlockDemo();
		BlockDemo b2 = new BlockDemo();
		
	}
}
