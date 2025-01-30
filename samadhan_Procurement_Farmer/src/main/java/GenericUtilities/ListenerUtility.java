package GenericUtilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * @author Testing Engineer
 */
public class ListenerUtility implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
	    String failed = result.getMethod().getMethodName();
	    TakesScreenshot ss = (TakesScreenshot) BaseClass_Farmer.sdriver;
	    File source = ss.getScreenshotAs(OutputType.FILE);

	    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	    
	    File dst = new File("screenshots/failed_" + failed + "_" + timestamp + ".jpg");

	    try {
	        File parentDir = dst.getParentFile();
	        if (!parentDir.exists()) {
	            parentDir.mkdirs();
	        }
	        
	        FileUtils.copyFile(source, dst);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	    String skipped = result.getMethod().getMethodName();
	    TakesScreenshot ss = (TakesScreenshot) BaseClass_Farmer.sdriver;
	    File source = ss.getScreenshotAs(OutputType.FILE);

	    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

	    File dst = new File("screenshots/skipped_" + skipped + "_" + timestamp + ".jpg");

	    try {
	        File parentDir = dst.getParentFile();
	        if (!parentDir.exists()) {
	            parentDir.mkdirs();
	        }
	        
	        FileUtils.copyFile(source, dst);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
