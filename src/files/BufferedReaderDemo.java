package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		FileReader reader;
		try {
			reader = new FileReader(new File("C:\\Users\\Samir\\Downloads\\dhoni.txt"));
			BufferedReader br = new BufferedReader(reader);
			String data="";
			while((data = br.readLine())!= null) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
