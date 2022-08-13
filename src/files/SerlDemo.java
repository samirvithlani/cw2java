package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	int sid;
	String sName;
	public Student(int sid, String sName) {
		
		this.sid = sid;
		this.sName = sName;
	}
	
	
}
public class SerlDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(101, "raj");
		try {
			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("stu.ser"));
			obj.writeObject(s1);
			obj.close();
			System.out.println("object stored.....");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
