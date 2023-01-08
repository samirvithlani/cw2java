package dp;

class Test{
	
	int id;
	String name;
	
	static Test t;
	
	private Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static Test getInstance() {
		
		if(t==null) {
			
			t = new Test();
		}
		
		return t;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}


public class SingleTon {
	
	
	public static void main(String[] args) {
		
		
//		Test t1 = new Test();
//		Test t2 = new Test();
//		Test t3 = new Test();
//		
//		System.out.println(t1.hashCode());
//		System.out.println(t2.hashCode());
//		System.out.println(t3.hashCode());
//		
		
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		Test t3 = Test.getInstance();
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		
		
		
	}

}
