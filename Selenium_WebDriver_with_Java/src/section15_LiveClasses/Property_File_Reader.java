package section15_LiveClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property_File_Reader {
	
	public void fetchPropertyData(String key_url) throws IOException {
		//, String name, String email, String website
		Properties prop = new Properties();  // by this object we are the config.properties file data
		File f = new File("./ConfigFiles/Config.properties");
		FileReader fr = new FileReader(f);
		prop.load(fr);
		System.out.println("The Application Url is ---> "+prop.getProperty(key_url));
//		System.out.println("The Name is ---> "+prop.getProperty(name));
//		System.out.println("The Email Id is ---> "+prop.getProperty(email));
//		System.out.println("The Website Url is ---> "+prop.getProperty(website));
	}
}
