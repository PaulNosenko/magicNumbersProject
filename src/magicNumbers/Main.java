package magicNumbers;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

import magicNumbers.exception.UnresolvableExtensionException;
import magicNumbers.factory.ResolverFactory;
import magicNumbers.utils.Utility;

/**
 * 
 * @author Paul
 *
 *         In order to start working with this program you may use one of
 *         built-in example file. In order to do that provide the name of chosen
 *         file in the console e.g.: 'src/tenor.gif' and press Enter
 *
 */
public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {

		sc = new Scanner(System.in);
		String answer = "";

		do {
			System.out.println("Please enter the path and the name of the file");
			String fileName = sc.nextLine();

			File f = new File(fileName);

			String ext = Utility.getExtension(new File(fileName));
			StringBuilder sb = null;
			String verdict;

			if (f.exists()) {
				byte[] b = Files.readAllBytes(f.toPath());
				sb = new StringBuilder();
				try {
					for (int i = 0; i < 9; i++) {
						sb.append(String.format("%02X ", b[i]));
					}
					verdict = ResolverFactory.resolveType(sb.toString(), ext);
					System.out.println(verdict);
				} catch (UnresolvableExtensionException | ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
				}
			} else {
				System.out.println("File '" + fileName + "' not found. Try once again ");
			}
			System.out.println("Wuold you like to try it once again? (Y/N)");
			answer = sc.nextLine();
		} while (answer.equalsIgnoreCase("Y"));
		System.out.println("Have a nice day!");
	}
}
