package magicNumbers.resolverImpl;

import magicNumbers.resolverAbs.Resolver;

public class GifResolver extends Resolver{
	
	public static String gifMagicCode1 = "47 49 46 38 37 61";
	public static String gifMagicCode2 = "47 49 46 38 39 61";

	@Override
	public String differentiate(String magicNumber) {
		String verdict = "File specified as GIF, while it is not";
		if (magicNumber.startsWith(gifMagicCode1) || magicNumber.startsWith(gifMagicCode2)) {
			verdict = "GIF file is GIF file";
		} else if (magicNumber.startsWith(PngResolver.pngMagicCode)) {
			verdict = "File is GIF, while actually is PNG";
		} else if ((magicNumber.startsWith(JpgResolver.jpgMagicCode1)
				|| magicNumber.startsWith(JpgResolver.jpgMagicCode2)
				|| magicNumber.startsWith(JpgResolver.jpgMagicCode3)
				|| magicNumber.startsWith(JpgResolver.jpgMagicCode4)
				|| magicNumber.startsWith(JpgResolver.jpgMagicCode5))) {
			verdict = "File is GIF, while actually is JPG";
		}else if (magicNumber.startsWith(PdfResolver.pdfMagicCode)) {
			verdict = "File is GIF, while actually is PDF";
		}
		return verdict;
	}
	
}
