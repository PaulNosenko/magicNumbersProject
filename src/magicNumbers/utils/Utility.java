package magicNumbers.utils;

import java.io.File;

public class Utility {
	public static String getExtension(File file) {
		String ext = "";
		try {
			if(file != null && file.exists()) {
				String name = file.getName();
				ext = name.substring(name.lastIndexOf("."));
			}
		}catch(Exception e) {
			ext = "";
		}
		return ext;
	}
}
