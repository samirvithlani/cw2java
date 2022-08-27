package files.nio;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIoDemp3 {

	public static void main(String[] args) {
		
		
		//a/x/y
		//a/x/y/z/p/q
		Path path = Paths.get("/../function");
		System.out.println(path.normalize());
		
		
	}
}
