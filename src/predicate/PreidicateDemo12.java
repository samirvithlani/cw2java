package predicate;

import java.util.function.Predicate;

public class PreidicateDemo12 {

	public static void main(String[] args) {
		
		Predicate<Integer> lessthen = (i)->(i<18);
		Predicate<String> containing =x -> x.contains("s");
		
		System.out.println(lessthen.test(25));
		
		System.out.println(containing.test("samir"));
		
	}
}
