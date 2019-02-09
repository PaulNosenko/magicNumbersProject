package magicNumbers;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

import magicNumbers.utils.Utility;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) throws Exception {
		
		sc = new Scanner(System.in);
		System.out.println("Please enter the path and the name of the file");
		String fileName = sc.nextLine();

		File f = new File(fileName);
		String ext = Utility.getExtension(f);
		StringBuilder sb = null;
		
		if(f.exists()) {
			byte[] b = Files.readAllBytes(f.toPath());
			sb = new StringBuilder();
			for(int i=0; i<9; i++) {
				sb.append(String.format("%02X", b[i]));
			}
			System.out.println(sb.toString());
		}else {
			System.out.println("File '" + fileName + "' not found. Try once again");
		}
	}
}
