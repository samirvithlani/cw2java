package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//treeset sorted // hashtable
		HashSet<String> set = new HashSet<String>();
		set.add("abc");
		set.add("nayan");
		set.add("jay");
		set.add("might");
		
		
		for(String s:set) {
			
			System.out.println(s);
		}
		
		
	}
}
