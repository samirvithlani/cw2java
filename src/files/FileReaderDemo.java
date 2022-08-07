package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Samir\\Downloads\\dhoni.txt");
		if(file.exists()){
			int x;
			try {
				FileReader reader = new FileReader(file);
				while((x =reader.read())!= -1) {
					System.out.print((char)x);
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else {
			System.out.println("file does not exist..");
		}
		
		
	}
}
