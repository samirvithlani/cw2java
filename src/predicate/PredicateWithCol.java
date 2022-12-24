package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class User1	{
	public User1(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	int id;
	String name;
	
	
}
public class PredicateWithCol {

	
	public static void main(String[] args) {
		
		List<User1> list = new ArrayList<User1>();
		list.add(new User1(15, "amit"));
		list.add(new User1(26, "neha"));
		list.add(new User1(45, "raj"));
		
		List<User1> filterdData = process(list, x->x.id>25);
		for(User1 u :filterdData)
		{
			System.out.println(u.id + " "+u.name);
		}
		
		
	}
	
	public static List<User1> process(List<User1> list,Predicate<User1> predicate){
		
		
		List<User1> filtedredUser = new ArrayList<User1>();
		
		for(User1 user : list) {
			
			if(predicate.test(user)) {
				filtedredUser.add(user);
			}
		}
		return filtedredUser;
	}
}
