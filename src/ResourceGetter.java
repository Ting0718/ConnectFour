import java.net.URL;

final public class ResourceGetter {
	
	public static URL load(String path) {
		URL input = ResourceGetter.class.getResource(path);
		if (input == null) {
			input = ResourceGetter.class.getResource("/" + path);
		}
		return input;
	}

}
