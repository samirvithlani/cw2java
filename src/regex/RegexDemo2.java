package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		
		//regular expression char classes...
		Pattern p = Pattern.compile("..s");//represnting a single char
		Matcher m = p.matcher("sas");
		System.out.println(m.matches());
		
		Pattern p1 = Pattern.compile("[abc]"); //single char..
		Matcher m1 = p1.matcher("");
		System.out.println("[abc]"+m1.matches());
		
		Pattern p2 = Pattern.compile("[a-z]"); //single char..
		Matcher m2 = p2.matcher("n");
		System.out.println("[a-z]"+m2.matches());
		
		Pattern p3 = Pattern.compile("[a-zA-Z]"); //single char..
		Matcher m3 = p3.matcher("A");
		System.out.println("[a-zA-Z]"+m3.matches());
		
		Pattern p4 = Pattern.compile("[^a-z]"); //single char..
		Matcher m4 = p4.matcher("a");
		System.out.println("[^a-z]"+m4.matches());
		
		Pattern p5 = Pattern.compile("[a-e[p-t]]"); //single char..
		Matcher m5 = p5.matcher("f");
		System.out.println("[a-e[p-t]]"+m5.matches());
		
		Pattern p6 = Pattern.compile("[a-z&&[m-p]]"); //single char..
		Matcher m6 = p6.matcher("n");
		System.out.println("[a-z&&[m-p]]"+m6.matches());
		
		
		
	}
}
