package collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Student{
	
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class StudentApp {

	
	
	public static void main(String[] args) {
		Set<Student> students = new HashSet<Student>();
		students.add(new Student(101, "ajay"));
		
	}
}
