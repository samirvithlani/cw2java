package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {

		InputStream inputStream = new FileInputStream(new File("byt1.txt"));
		int c = 0;
		try {
			while ((c = inputStream.read()) != -1) {

				System.out.println((byte) c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
