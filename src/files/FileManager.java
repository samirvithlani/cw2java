package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		File file;

		int choice;
		System.out.println("please enter your choice");
		System.out.println("press 1 for create file");
		System.out.println("press 2 for check file is exist or not !!");
		System.out.println("press 3 for create new folder !!");
		System.out.println("press 5 for create new folders !!");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("please enter file name :");
			String fileName = sc.next();
			fileName = fileName.concat(".txt");
			file = new File(fileName);
			try {
				if (!file.exists()) {
					if (file.createNewFile()) {
						System.out.println(fileName + " Is created..");
					} else {
						System.out.println(fileName + " something went wrong..");
					}
				} else {
					System.out.println("file is already exist...");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		case 2:

			System.out.println("please enter file name to check existance !!!");
			fileName = sc.next();
			file = new File(fileName);
			if (file.exists()) {
				System.out.println(fileName + " is exist..");
			} else {
				System.out.println(fileName + " is not exist..");
			}
			break;
		case 3:
			System.out.println("please eneter folder name to create..");
			String folderName = sc.next();
			folderName = folderName.trim();
			file = new File("src//a//" + folderName);
			// please check exist first...
			if (file.mkdir()) {
				System.out.println(folderName + " is created...");
			} else {

				System.out.println("folder is not created...");
			}
			break;
		case 4:
			file = new File("D://royal//cw2c++");
			String files[] = file.list();
			for (String s : files) {
				System.out.println(s);
			}
			break;

		case 5:
			file = new File("raj//uvesh//daksh");
			file.mkdirs();

			break;
		case 6:
			file = new File("D://royal//cw2c++");
			File fileList[] = file.listFiles();
			for (File f : fileList) {

				System.out.println(f.getAbsolutePath());

			}
			break;

		case 7:
			file = new File("C:\\Users\\Samir\\Desktop\\demo1.txt");
			try {
				file.createNewFile();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
			System.out.println(file.isHidden());
			System.out.println(file.canRead());
			System.out.println(file.canExecute());
			System.out.println(file.canWrite());

			break;
		case 8:
			file = new File("C:\\Users\\Samir\\Desktop\\demo1.txt");
			System.out.println(file.getPath());
			System.out.println(file.getParent());
			System.out.println(file.toPath());
			System.out.println(file.getName());
			System.out.println(file.getFreeSpace());

			break;
		case 9:

			System.out.println("please add location...");
			String l = sc.next();
			
			System.out.println("please file name to delete");
			fileName = sc.next();
			
			file = new File(l+"//"+fileName);
			System.out.println(file.getPath());
			if(file.delete()) {
				System.out.println("deleted..");
			}
			
			
			break;
		default:
			break;
		}

	}
}
