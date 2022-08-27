package files.nio;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo2 {

	public static void main(String[] args) {
		
		Path path = Paths.get("D:\\ppts");
		System.out.println(path.getFileName());
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println(path.getFileSystem());
		//File file = path.toFile();
		System.out.println(path.isAbsolute());
		path = path.resolve("royal.png");
		System.out.println(path.getFileName());
		System.out.println(path.toAbsolutePath());
		Path p = Paths.get("D:\\");
		path = path.relativize(p);
		System.out.println(path.toAbsolutePath());
		
	}
}
