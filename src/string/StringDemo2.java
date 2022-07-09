package string;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String s1 = "hello all good morning how are you";
		String words[] = s1.split(" ");
		for(String s:words) {
			System.out.println(s);
		}
				
	}
}
