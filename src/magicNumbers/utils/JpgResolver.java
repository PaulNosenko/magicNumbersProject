package magicNumbers.utils;

import magicNumbers.resolverAbs.Resolver;
import magicNumbers.resolverImpl.PngResolver;

public class JpgResolver extends Resolver{
	public static String jpgMagicCode1 = "FF D8 FF DB";
	public static String jpgMagicCode2 = "FF D8 FF E0 00";
	public static String jpgMagicCode3 = "FF D8 FF EE";
	public static String jpgMagicCode4 = "FF D8 FF E2 0B";
	public static String jpgMagicCode5 = "FF D8 FF E1 11";
	
	@Override
	public String differentiate(String magicNumber) {
		String verdict = "File specified as JPG, while it is not";
		if (magicNumber.startsWith(jpgMagicCode1) || magicNumber.startsWith(jpgMagicCode2)
				|| magicNumber.startsWith(jpgMagicCode3) || magicNumber.startsWith(jpgMagicCode4)
				|| magicNumber.startsWith(jpgMagicCode5)) {
			verdict = "JPG file is JPG file";
		}else if (magicNumber.startsWith(PngResolver.pngMagicCode)) {
			verdict = "File is JPG, while actually is PNG";
		}
		
		return verdict;
	}

}
