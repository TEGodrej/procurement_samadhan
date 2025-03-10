package GenericUtilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtility implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		String failed = result.getMethod().getMethodName();
		TakesScreenshot ss=(TakesScreenshot)BaseClass_Farmer.sdriver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File dst=new File("failed"+failed+".jpg");
		try {
		   FileUtils.copyFile(source, dst);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		String failed = result.getMethod().getMethodName();
		TakesScreenshot ss=(TakesScreenshot)BaseClass_Farmer.sdriver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File dst=new File("failed"+failed+".jpg");
		try {
		   FileUtils.copyFile(source, dst);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
