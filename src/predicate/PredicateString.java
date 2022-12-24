package predicate;

import java.util.function.Predicate;



public class PredicateString {

	public static boolean check(String s,Predicate<String> predicate) {
		
		
		return predicate.test(s);
	}
	public static void main(String[] args) {
		
		String s = "samir";
		System.out.println(check(s,(x)->x.startsWith("s")));
		
	}
}
