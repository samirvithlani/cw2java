package collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream6 {

	public static void main(String[] args) {

		List<String> users = new ArrayList<String>();
		users.add("ajay");
		users.add("jay");
		users.add("neha");
		users.add("priya");
		users.add("ok");
		users.add("neeta");

		List<String> filteredData = new ArrayList<String>();
		
		filteredData = users.stream().filter(s->s.length()>4).collect(Collectors.toList());
		filteredData.stream().forEach(x->System.out.println(x));
		

//		for (String s : users) {
//			if (s.length() > 4) {
//				filteredData.add(s);
//			}
//		}
//
//		for (String s : filteredData) {
//			System.out.println(s);
//		}
	}
}
