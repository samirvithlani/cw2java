package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(new File("writer1.txt"),true));
			br.write("\n hi this is buffered writer..");
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
