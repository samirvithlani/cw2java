package collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>(); // linkedlist
		// List<String> l = new LinkedList<String>(); //list

		list.add("jay");
		list.addFirst("prajay");
		list.add(0, "ajay");
		list.addLast("vijay");
//		for (String s : list) {
//
//			System.out.println(s);
//		}

		// list.clear();
		// String element = list.pop(); exception if empty
		// list.poll(); null if empty

		// String element = list.remove(0);
		// boolean flag = list.remove("ajay");
		// System.out.println(flag);
		// if ajay is thera an remove true false...
		// System.out.println(flag);
		// list.clear();
		// list.peek();
		// String element = list.peek();
		// System.out.println("removing.."+element);

		System.out.println("contains..." + list.contains("ajay"));
		// list.removeFirst();
		// list.removeLast();
		System.out.println("first" + list.getFirst());
		System.out.println(list.getLast());

		System.out.println("index of" + list.lastIndexOf("vijay"));
		System.out.println("last index of" + list.lastIndexOf("vijay"));

		// list.set(index, element)

		for (String s : list) {

			System.out.println(s);
		}

	}
}
