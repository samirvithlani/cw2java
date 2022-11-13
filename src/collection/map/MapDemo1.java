package collection.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		
		//data will sort by key
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		//add, put
		//key must be unique
		map.put(125, "jay");
		map.put(12, "vijay");
		map.put(15, "amit");
		map.put(25, "neha");
		map.put(52, "jay");
		map.put(15, "amita");
		//String s = map.get(125);
		//index loop 0 n
		Set<Integer> set = map.keySet();
//		for(int keys:set) {
//			
//			System.out.println(map.get(keys));
//		}
		//Entry inner interface map interface
		
		//map.isEmpty();
		//String x = map.remove(1555);
		//map.replace(255, "neel");
		
		//System.out.println("removing"+x);
		
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey() + " -"+m.getValue());
		}
		
		
	}
}
