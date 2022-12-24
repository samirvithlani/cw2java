package predicate;

import java.util.function.Predicate;

public class PredicateDemo {

//	Predicate p = (i)->{
//		
//		return i<18
//	}
	public static void main(String[] args) {
		
		//predicate chainin
		Predicate<Integer> lessthen = i->(i<18);
		Predicate<Integer> greterThn = i->(i>10);
		
		boolean flag = lessthen.or(greterThn).test(9);
		System.out.println(flag);
	
	}
}
