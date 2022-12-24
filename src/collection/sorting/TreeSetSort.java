package collection.sorting;

import java.util.TreeSet;

class Emp implements Comparable<Emp>{
	
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
			
}
public class TreeSetSort {

	public static void main(String[] args) {
		
		TreeSet<Emp> set = new TreeSet<Emp>();
		set.add(new Emp(152, "ram"));
		set.add(new Emp(1, "kevin"));
		set.add(new Emp(12, "parth"));
		set.add(new Emp(15, "neha"));
		
		for(Emp e:set) {
			
			System.out.println(e.name);
		}
		
	}
}
