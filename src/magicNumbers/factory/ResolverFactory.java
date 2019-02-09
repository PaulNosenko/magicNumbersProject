package magicNumbers.factory;

import magicNumbers.exception.UnresolvableExtensionException;
import magicNumbers.resolverAbs.Resolver;
import magicNumbers.resolverImpl.GifResolver;
import magicNumbers.resolverImpl.JpgResolver;
import magicNumbers.resolverImpl.PdfResolver;
import magicNumbers.resolverImpl.PngResolver;

public class ResolverFactory {
	public static String resolveType(String magicNumber, String ext) throws UnresolvableExtensionException {
		Resolver res = null;

		if (ext.equalsIgnoreCase(".png")) {
			res = new PngResolver();
		} else if (ext.equalsIgnoreCase(".jpg")) {
			res = new JpgResolver();
		} else if (ext.equalsIgnoreCase(".gif")) {
			res = new GifResolver();
		}else if (ext.equalsIgnoreCase(".pdf")) {
			res = new PdfResolver();
		}else {
			throw new UnresolvableExtensionException("Extension '" + ext + "' is not supported, Try another file.");
		}
		return res.differentiate(magicNumber);
	}
}