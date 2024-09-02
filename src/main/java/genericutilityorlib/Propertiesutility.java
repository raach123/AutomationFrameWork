package genericutilityorlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * this class is the properties class with generic function
 * @author Karthik
 * @version 1.8.24
 * 
 */


public class Propertiesutility {
	
	/**
	 * this is the genric method to read data from properties
	 * 
	 */
	public String getDataFromProperties(String data) throws Exception {
		
		FileInputStream fis=new FileInputStream(IconstantUtility.propertiesPath);
		Properties pro=new Properties();
		pro.load(fis);
		String value=pro.getProperty(data);
		
		return value;
		
	}

}
