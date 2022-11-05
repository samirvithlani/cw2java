package collection.set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();

		set.add("priya");
		set.add("amit");
		set.add("mit");
		set.add("jaya");

		System.out.println(set.first());
		System.out.println(set.higher("priya"));
		System.out.println(set.lower("priya"));

		// intraface
		// NavigableSet<String> ns = set.subSet("amit", true, "priya", false);

		// sortedset
		SortedSet<String> ns = set.subSet("amit", "priya");

		// to
		SortedSet<String> ss = set.headSet("mit");
		// from
		SortedSet<String> ss1 = set.tailSet("jaya");

		// System.out.println(set.pollFirst());
		// set.pollLast();

		for (String s : ss1) {

			System.out.println("." + s);
		}

	}
}
