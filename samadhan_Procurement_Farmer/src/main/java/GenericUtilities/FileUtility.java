package GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public void getDataFromProperty(String key) throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\testing.engineer\\OneDrive - GODREJ INDUSTRIES LIMITED\\Documents");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
//		return value;
		System.out.println(value);
	}
}
