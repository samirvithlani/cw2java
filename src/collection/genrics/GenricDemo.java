package collection.genrics;

import java.util.ArrayList;
import java.util.List;

public class GenricDemo {

	
	public static void main(String[] args) {
		
		List users = new ArrayList();
		users.add(15);
		users.add(15.25f);
		users.add(true);
		users.add("am");
		
		for(Object o :users) {
			
			System.out.println(o);
		}
	}
}
