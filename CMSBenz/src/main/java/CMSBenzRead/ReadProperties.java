package CMSBenzRead;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public static String readProperties(String locators) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ma12828\\git\\isolvecmsbenz\\CMSBenz\\src\\test\\java\\CMSBenz\\Object.Properties");
		Properties p = new Properties();
		p.load(file);
		return (p.getProperty(locators));
	}
}
