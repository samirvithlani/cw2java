package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("pls enter no1");
			int no1 = sc.nextInt();
			System.out.println("pls enter no2");
			int no2 = sc.nextInt();

			int ans = no1 / no2;

			System.out.println(ans);
		}

		catch (ArithmeticException e) {

			// e.printStackTrace();
			System.out.println("can not Divide by Zero");
		} catch (InputMismatchException e) {
			System.out.println("pls check your input...");

		} finally {
			System.out.println("***********");
		}

	}
}
