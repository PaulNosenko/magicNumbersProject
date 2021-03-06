package magicNumbers.resolverImpl;

import magicNumbers.resolverAbs.Resolver;

public class PngResolver extends Resolver {
	public static String pngMagicCode = "89 50 4E 47 0D 0A 1A 0A";

	@Override
	public String differentiate(String magicNumber) {
		String verdict = "File specified as PNG, while it is not";
		if (magicNumber.startsWith(pngMagicCode)) {
			verdict = "PNG file is PNG file";
		} else if (magicNumber.startsWith(GifResolver.gifMagicCode1)
				|| magicNumber.startsWith(GifResolver.gifMagicCode2)) {
			verdict = "File is PNG, while actually is GIF";
		}else if ((magicNumber.startsWith(JpgResolver.jpgMagicCode1)
				|| magicNumber.startsWith(JpgResolver.jpgMagicCode2)
				|| magicNumber.startsWith(JpgResolver.jpgMagicCode3)
				|| magicNumber.startsWith(JpgResolver.jpgMagicCode4)
				|| magicNumber.startsWith(JpgResolver.jpgMagicCode5))) {
			verdict = "File is PNG, while actually is JPG";
		}else if (magicNumber.startsWith(PdfResolver.pdfMagicCode)) {
			verdict = "File is PNG, while actually is PDF";
		}
		return verdict;
	}

}

