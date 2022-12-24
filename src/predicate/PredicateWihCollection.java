package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class User{
	
	int id;
	String name;
	String role;
	public User(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	
}
public class PredicateWihCollection {

	public static List<User> validate(List<User> list,Predicate<User> predicate) {
		
		List<User> res = new ArrayList<User>();
		
		
		for(User u:list) {
			
			if(predicate.test(u)) {
				res.add(u);
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		List<User> users = new ArrayList<User>();
		users.add(new User(101, "raj", "admin"));
		users.add(new User(102, "parth", "admin"));
		users.add(new User(109, "neha", "hr"));
		
		
		List<User> filterd = validate(users, (User u)->u.role.equals("admin"));
		for(User u :filterd) {
			
			System.out.println(u.id + "- "+u.name+"- "+u.role);
		}
		
		
		
	}
}
