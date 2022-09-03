package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//regex quantifiers...
public class RegexDemo3 {

	public static void main(String[] args) {
		
		//occurs once and not at all
		//Pattern p1 = Pattern.compile("[abc]?"); //single char..
		//+ occus once or more
		//Pattern p1 = Pattern.compile("[0-9 a-z]+"); //single char..
		//* zero and more
		//Pattern p1 = Pattern.compile("[0-9 a-z]*");
		//{range}
		//{range,}
		//{range,torange}
		Pattern p1 = Pattern.compile("[+91]+[6-9]{1}[0-9]{9}");
		Matcher m1 = p1.matcher("+918432178948");
		System.out.println("->"+m1.matches());
		//
		
		
		
	}
}
