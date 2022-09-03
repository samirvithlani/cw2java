package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//para --> bomb word --> position count..
public class RegexDemo1 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("JA*",Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher("java by Oracle And java is developed by abc,java is following oops,jaidev is good java developer");
		
		while(m.find()) {
			
			System.out.println("Pattern found at "+m.start()+ " to "+(m.end()-1));
		}
	}
}
