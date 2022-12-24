package collection.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream2 {

	public static void main(String[] args) {
		
		List<String> users = new ArrayList<String>();
		users.add("Amit");
		users.add("Ajay");
		users.add("Neha");
		users.add("Parth");
		users.add("Jay");

//		for(String s:users) {
//			if(s.startsWith("A")) {
//				System.out.println(s);
//			}
//		}
//
//		for(String s:users) {
//			if(s.startsWith("A")) {
//				System.out.println(s.toUpperCase());
//			}
//		}
		
		//users.stream().filter((x)->x.startsWith("A")).map(String::toUpperCase).forEach(x->System.out.println(x));
		
		
		users.stream().sorted().map(String::toUpperCase).forEach(x->System.out.println(x));
		
		
		//users.stream().filter(x->x.startsWith("A")).forEach(x->System.out.println(x));
		
		//users.stream().forEach(x->System.out.println(x));
		
		
	}
}
