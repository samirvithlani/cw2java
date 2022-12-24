package collection.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream3 {

	
	public static void main(String[] args) {
		
		List<Integer> prices = new ArrayList<Integer>();
		prices.add(120);
		prices.add(25);
		prices.add(20);
		prices.add(35);
		prices.add(45);
		prices.add(10);
		
		
		//prices.stream().map(x-> x *2).forEach(x->System.out.println(x));
		prices.stream().filter(x->x>40).map(x->x/2).forEach(x->System.out.println(x));
		
		
		
		
	}
}
