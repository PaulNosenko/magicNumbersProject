package magicNumbers;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) throws Exception {
		
		sc = new Scanner(System.in);
		System.out.println("Please enter the path and the name of the file");
		String fileName = sc.nextLine();

		File f = new File(fileName);
		
		if(f.exists()) {
			byte[] b = Files.readAllBytes(f.toPath());
		}else {
			System.out.println("File '" + fileName + "' not found. Try once again");
		}
	}
}
