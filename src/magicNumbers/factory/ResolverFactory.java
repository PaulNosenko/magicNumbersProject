package magicNumbers.factory;

import magicNumbers.exception.UnresolvableExtensionException;
import magicNumbers.resolverAbs.Resolver;
import magicNumbers.resolverImpl.JpgResolver;
import magicNumbers.resolverImpl.PngResolver;

public class ResolverFactory {
	public static String resolveType(String magicNumber, String ext) throws UnresolvableExtensionException {
		Resolver res = null;
		
		if(ext.equalsIgnoreCase(".png")) {
			res = new PngResolver();
		}else if(ext.equalsIgnoreCase(".jpg")) {
			res = new JpgResolver();
		}/*if(ext.equalsIgnoreCase(".gif")) {
			verdict = "gif";
		}else if(ext.equalsIgnoreCase(".pdf")) {
			verdict = "pdf";
		}
		*/
		else {
			throw new UnresolvableExtensionException("Extension '" + ext + "' is not supported, Try another file.");
		}
		return res.differentiate(magicNumber);
	}
}
