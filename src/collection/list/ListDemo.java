package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

//java.util -> utility
//<E> type of data / type safty
public class ListDemo {

	public static void main(String[] args) {

		// polymor //
		List<String> name = new ArrayList<String>();
		name.add("jay");
		name.add("parth");
		name.add("ajay");
		name.add(1, "priya");
		name.add("jay");

//		for (int i = 0; i < name.size(); i++) {
//
//			System.out.println(name.get(i));
//		}

//		for (String s : name) {
//			System.out.println(s);
//		}

//		Iterator<String> itr = name.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		String removedelm = name.remove(0);
		// boolean removed = name.remove("jaya");
		// System.out.println("removing..." + removed);
		name.set(1, "parthvi");

		// name.clear();
		System.out.println(name.contains("jay"));
		System.out.println(name.isEmpty());
		System.out.println(name.indexOf("jaya"));
		System.out.println(name.lastIndexOf("jay"));

		// name.sort();
		for (String s : name) {
			System.out.println(s);
		}

	}
}
