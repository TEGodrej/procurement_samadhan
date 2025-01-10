package GenericUtilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsListner implements ITestListener , ISuiteListener {

	public  static ExtentReports extentreports = new ExtentReports();
	public  ExtentTest extenttest;
	
	@Override
	public void onStart(ISuite suite) {
		ISuiteListener.super.onStart(suite);
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("Samadhan test suite result");
		spark.config().setReportName("Samadhan_Farmer Report");
		spark.config().setTheme(Theme.DARK);
		
//		add environment and create test
		extentreports.attachReporter(spark);
		extentreports.setSystemInfo("OS", "android");
		extentreports.setSystemInfo("device", "Redmi A2");
		
	}
	@Override
	public void onFinish(ISuite suite) {
		ISuiteListener.super.onFinish(suite);
		System.out.println("Report Backup");
		extentreports.flush();
	}
	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
		System.out.println("===========>"+result.getMethod().getMethodName()+"=======START=======");
		extenttest.log(Status.PASS,result.getMethod().getMethodName()+"========Started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		System.out.println("=========="+result.getMethod().getMethodName()+"=====Ends=======");
		extenttest.log(Status.PASS,result.getMethod().getMethodName()+"========Completed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String testName=result.getMethod().getMethodName();
		TakesScreenshot Edriver=(TakesScreenshot)BaseClass_Farmer.sdriver;
		String filePath=Edriver.getScreenshotAs(OutputType.BASE64);
		extenttest.addScreenCaptureFromBase64String(filePath,testName);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		ITestListener.super.onTestSkipped(result);
		extenttest.log(Status.SKIP,result.getMethod().getMethodName()+"=====Skipped");
		
	}
	
//	@Override
	public void onTestFailureButWithinSucccessPercentage(ITestResult result) {
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}
	
}
