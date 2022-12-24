package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class CompDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("amit");
		list.add("mit");
		list.add("abhi");
		list.add("jay");
		list.add("zara");
		list.add("parth");
		
		//Collections.sort(list);
		
		
		for(String s:list) {
			System.out.println(s);
		}
	}
}
