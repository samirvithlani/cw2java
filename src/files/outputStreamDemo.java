package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class outputStreamDemo{

	public static void main(String[] args) {

		String name = "raj";
		try {
			OutputStream fout = new FileOutputStream(new File("byt1.txt"),true);
			
			byte b[] = name.getBytes();
			fout.write(b);
			
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
