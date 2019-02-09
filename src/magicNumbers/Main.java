package magicNumbers;

import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Please enter the path and the name of the file");
		String fileName = sc.nextLine();
		System.out.println(fileName);
		
	}
}
