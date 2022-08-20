package files.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo1 {

	// Path -->center interface
	// Paths -->
	// Files class

	public static void main(String[] args) {

		Path path = Paths.get("nio.txt");
		
		
		
		
		
		try {
			Files.createFile(path);
			System.out.println("file created...");
		} catch (IOException e) {
			System.out.println("file not created....");
		}

	}

}
