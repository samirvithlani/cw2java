package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFiledemo {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Samir\\Downloads\\dhoni.txt");
		String data = "";
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {

				data = sc.nextLine();
				System.out.print(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
