package GenericUtilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsListner implements ITestListener  {

	ExtentReports extentreports;
	ExtentTest extentTest;
	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		 extentTest = extentreports.createTest(methodName);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		extentTest.log(Status.PASS,methodName+"========Completed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
         Date d = new Date();
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String date = sim.format(d);
		 String path=".\\screenshots\\" +methodName + date +".png";
		TakesScreenshot ts = (TakesScreenshot) BaseClass_Farmer.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(path);
		try {
			FileUtils.copyFile(src, dst);
			String p = dst.getAbsolutePath();
			extentTest.addScreenCaptureFromBase64String(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
		extentTest.log(Status.FAIL,methodName+"========Failed");
		extentTest.log(Status.FAIL, result.getThrowable());

	}

	

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		extentTest.log(Status.SKIP,methodName+"========Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("Samadhan test suite result");
		spark.config().setReportName("Samadhan_Farmer Report");
		spark.config().setTheme(Theme.DARK);
		
	   extentreports= new ExtentReports();
//		add environment and create test
		extentreports.attachReporter(spark);
		extentreports.setSystemInfo("OS", "android");
		extentreports.setSystemInfo("device", "Redmi A2");
		

	}

	@Override
	public void onFinish(ITestContext context) {
		extentreports.flush();
	}

	
	
}
