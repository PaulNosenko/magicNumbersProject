package magicNumbers.factory;

public class ResolverFactory {
	public static String resolveType(String magicNumber, String ext) {
		String verdict = "";
		
		if(ext.equalsIgnoreCase(".png")) {
			verdict = "png";
		}else if(ext.equalsIgnoreCase(".jpg")) {
			verdict = "jpg";
		}if(ext.equalsIgnoreCase(".gif")) {
			verdict = "gif";
		}else if(ext.equalsIgnoreCase(".pdf")) {
			verdict = "pdf";
		}
		
		return verdict;
	}
}
