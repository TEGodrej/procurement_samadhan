package GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	/**
	 * @author DivyaPrakashAmar
	 * This method is to read data from Property file 
	 * @Exceptions NullPointerException
	 * @Param String key
	 * @Return type String 
	 * */
	public static String getDataFromProperty(String key) throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\testing.engineer\\git\\procurement_samadhan\\final\\samadhan_Procurement_Farmer\\testData\\ConfigrationFile.property");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
}
