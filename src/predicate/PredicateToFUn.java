package predicate;

import java.util.function.Predicate;

public class PredicateToFUn {

	public void pred(int no,Predicate<Integer> predicate) {
		
		if(predicate.test(no)) {
			System.out.println(no+" true");
		}
		else {
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		
		PredicateToFUn p = new PredicateToFUn();
		p.pred(16, (i)->i%2==0);
	}
}
