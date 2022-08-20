package files.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Scanner;

public class NioMaster {

	public static void main(String[] args) {

		System.out.println("please enter your choice:");
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for create folde");
		System.out.println("press 2 for delete file..");
		System.out.println("press 5 for copy file..");
		System.out.println("press 6 for move file...");
		int choice = sc.nextInt();

		Path path = null;

		switch (choice) {
		case 1:
			path = Paths.get("nio");
			try {
				Files.createDirectory(path);
				System.out.println("folder created...");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("folder not created...");
			}
			break;
		case 2:
			path = Paths.get("nio.txt");
			try {
				Files.delete(path);
				System.out.println("file deleted...");
			} catch (NoSuchFileException e) {
				System.out.println("no file avaialable....");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case 3:
			path = Paths.get("nio");
			if (Files.exists(path)) {
				System.out.println("file is already exist");
			} else {

			}

			break;

		case 4:
			path = Paths.get("nio.txt");
			try {
				Files.createFile(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		case 5:

			Path src = Paths.get("nio.txt");
			Path dest = Paths.get("nio/nio1.txt");
			try {
				Files.copy(src, dest);
				System.out.println("file copied....");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		case 6:
			Path src1 = Paths.get("nio/nio1.txt");
			Path dest1 = Paths.get("raj/nio.txt");
			try {
				Files.move(src1, dest1);
				System.out.println("file moved...");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case 7:
			Path p = Paths.get("C:\\Users\\Samir\\Desktop\\task.txt");
			try {
				FileTime f = Files.getLastModifiedTime(p);
				System.out.println(f);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case 8:
			Path path2 = Paths.get("C:\\Users\\Samir\\Desktop\\task.txt");
			System.out.println(Files.isWritable(path2));
			try {
				System.out.println(Files.isHidden(path2));

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		default:
			break;
		}

	}

}
