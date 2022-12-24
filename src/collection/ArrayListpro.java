package collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		
		//return name.compareTo(o.name);
		if(id>o.id) {
			return 1;
		}
		else if(id==o.id) {
			return 0;
		}
		return -1;
	}

}

public class ArrayListpro {

	ArrayList<Student> students;

	public void addStudent() {

		students = new ArrayList<Student>();
		students.add(new Student(101, "raj"));
		
		students.add(new Student(103, "ajay"));
		students.add(new Student(104, "prit"));
		students.add(new Student(102, "neha"));
		students.add(new Student(102, "neha"));

	}
	
	public void displayStudent() {
		
		Collections.sort(students);
		for(Student s:students) {
			
			System.out.println(s.id +" - "+s.name);
		}
		
	}
	
	public void removeStudent(int id) {
		
		
		for(Student s:students) {
			if(s.id==id) {
				
				if(students.contains(s)) {
					
					students.remove(s);
					System.out.println("student removed...");
					displayStudent();
				}
				else {
					System.out.println("student not found...");
				}
			}
			
		}
		
		
	}

	public static void main(String[] args) {

		ArrayListpro a1 = new ArrayListpro();
		a1.addStudent();
		a1.displayStudent();
		a1.removeStudent(10);
	}

}
