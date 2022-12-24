package lambda;

@FunctionalInterface
interface Converintg{
	
	public String converion(String name);
}

public class Convert {

	public static void main(String[] args) {
		
		Converintg c = (name)->{
			
			return name.toUpperCase();
		};
		System.out.println(c.converion("raj"));
		
	}
}
