package string;

import java.util.Scanner;

public class StringDemo3 {

	public String toString() {

		System.out.println("called...");
		return "kk";
	}

	public static void main(String[] args) {

		StringDemo3 s3 = new StringDemo3();
		System.out.println(s3);
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		String s1 = new String("hiii");
		System.out.println(s1);

	}
}
