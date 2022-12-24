package lambda;

//functional interface
@FunctionalInterface
interface Fun{
	
	public void funning(String name);
	

}

public class Funin {
	
	
	public static void main(String[] args) {
		
		
		Fun f = (String name)->{
			System.out.println(name+"funning called....");
		};
		f.funning("amit");
	}

}
