package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		// array --> index follow 0 set poistion 1
		Set<String> set = new TreeSet<String>();// method --> set behviour // treeset

		set.add("priya");
		set.add("amit");
		set.add("mit");
		set.add("jaya");

		System.out.println(set.contains("amit"));
		System.out.println(set.isEmpty());

		System.out.println(set.remove("mit"));

		// single access... ****

		for (String s : set) {
			System.out.println(s);
		}

	}
}
