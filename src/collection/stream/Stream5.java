package collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream5 {

	public static void main(String[] args) {

		List<String> users = new ArrayList<String>();
		users.add("Amit");
		users.add("Ajay");
		users.add("Neha");
		users.add("Parth");
		users.add("Jay");

		//Optional<String> s = users.stream().filter(x -> x.length() > 3).findAny();
		//System.out.println(s.get());
		System.out.println(users.stream().allMatch(x->x.length()>=3));
		System.out.println(users.stream().anyMatch(x->x.length()>=5));

	}
}
