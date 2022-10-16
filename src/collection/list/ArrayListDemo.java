package collection.list;

import java.util.ArrayList;
import java.util.List;
/// 0   1    2    3
///jay raj parth neha
// print
// amit
//10 11th --> 50 %  15  16 50 %22
//jay raj  neha amit
//
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		List<Integer> sl = list.subList(4, 7);
		// reverse
		ListIterator<Integer> itr = list.listIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// list.ensureCapacity(minCapacity);

//		for(int x:list) {
//			System.out.println(x);
//		}

	}
}
