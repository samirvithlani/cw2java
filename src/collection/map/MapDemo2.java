package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		List<String> list2 = new ArrayList<String>();
		list2.add("p");
		list2.add("q");
		list2.add("r");
		
		
		map.put(1, list1);
		map.put(2, list2);
		
		
		for(Map.Entry m :map.entrySet()) {
			
			System.out.println(m.getKey());
			List<String> list = (List<String>) m.getValue();
			for(String s:list) {
				
				System.out.println(s);
			}
			
			
			
		}
		
		
	}
}
