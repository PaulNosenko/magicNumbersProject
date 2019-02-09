package magicNumbers.resolverImpl;

import magicNumbers.resolverAbs.Resolver;

public class PdfResolver extends Resolver{

	public static String pdfMagicCode = "25 50 44 46 2D";

	@Override
	public String differentiate(String magicNumber) {
		String verdict = "File specified as PDF, while it is not";
		if (magicNumber.startsWith(pdfMagicCode)) {
			verdict = "PDF file is PDF file";
		} else if (magicNumber.startsWith(GifResolver.gifMagicCode1)
				|| magicNumber.startsWith(GifResolver.gifMagicCode2)) {
			verdict = "File is PDF, while actually is GIF";
		} else if ((magicNumber.startsWith(JpgResolver.jpgMagicCode1)
				|| magicNumber.startsWith(JpgResolver.jpgMagicCode2)
				|| magicNumber.startsWith(JpgResolver.jpgMagicCode3)
				|| magicNumber.startsWith(JpgResolver.jpgMagicCode4)
				|| magicNumber.startsWith(JpgResolver.jpgMagicCode5))) {
			verdict = "File is PDF, while actually is JPG";
		}else if (magicNumber.startsWith(PngResolver.pngMagicCode)) {
			verdict = "File is PDF, while actually is PNG";
		} 
		return verdict;
	}

}
