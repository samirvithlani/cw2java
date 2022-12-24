package collection.stream;

import java.util.ArrayList;
import java.util.List;

class Student{
	int id;
	
	String name;

	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
			
	
}
public class Stream4 {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(101, "raj"));
		students.add(new Student(102, "jay"));
		students.add(new Student(103, "ajay"));
		students.add(new Student(104, "neha"));
		
//		for(Student s:students) {
//			System.out.println(s.name + " " + s.id);
//		}
		
		//students.stream().forEach(s->System.out.println(s.id+" - "+s.name));
		
		//students.stream().filter(s->s.name.startsWith("n")).forEach(s->System.out.println(s.id + " "+s.name));
		students.stream().map(s->s.name.toUpperCase()).forEach(x->System.out.println(x));
		
		
		
		
	}
}
