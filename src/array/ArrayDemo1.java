package array;

import java.util.Scanner;

public class ArrayDemo1 {

	// array class
	public static void main(String[] args) {

		// int a[] = {10,20,30,40,50,60,70,80,90,100};
		int a[] = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter elements of an array ::");
		for (int i = 0; i < a.length; i++) {

			System.out.println("please enter " + (i + 1) + " element");
			a[i] = sc.nextInt();
		}

		for (int x : a) {
			System.out.println(x);
		}

		// System.out.println(a[0]);

	}
}
