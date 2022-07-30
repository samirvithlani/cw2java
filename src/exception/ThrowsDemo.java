package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsDemo {

	void demo() throws FileNotFoundException {

		Scanner sc = new Scanner(new File(""));
	}

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

		}
	}
}
