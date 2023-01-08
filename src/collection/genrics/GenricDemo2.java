package collection.genrics;

import java.util.ArrayList;
import java.util.List;

public class GenricDemo2 <T extends Number> {

	public void add1(int a) {
		
		System.out.println(a);
	}
	
	public void add(T a,T b) {
		
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		
		
		//GenricDemo2<String,Integer> s = new GenricDemo2<String,Integer>();
		GenricDemo2<Integer> genricDemo2 = new GenricDemo2<>();
		genricDemo2.add(15, 45);
		
		
		
		
		
		
		
		
	}
}
