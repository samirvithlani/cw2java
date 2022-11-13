package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Employee{
	
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}
public class MapDemo3 {

	public static void main(String[] args) {
		//key sorted
		Map<Integer, Employee> employees = new TreeMap<Integer, Employee>();
		employees.put(1, new Employee(10, "name1"));
		employees.put(2, new Employee(11, "name2"));
		
		for(Map.Entry m:employees.entrySet()) {
			
			System.out.println(m.getKey());
			Employee e = (Employee) m.getValue();
			System.out.println(e.name);
			System.out.println(e.id);
			
		}
		
		
		
	}
}
