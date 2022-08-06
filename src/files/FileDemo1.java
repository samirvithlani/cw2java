package files;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	// File
	public static void main(String[] args) {

		File file = new File("demo.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("file is created...");
			}
			else {
				System.out.println("file not created...");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
