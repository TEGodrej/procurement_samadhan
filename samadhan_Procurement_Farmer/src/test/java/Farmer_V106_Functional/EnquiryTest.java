package Farmer_V106_Functional;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class EnquiryTest extends BaseClass_Farmer{
//This is to verify that user is able to raise a new enquiry
	@Test
	public void raiseNewEnquiry() {
		driverUtility.implicitWait(10);
		homeScreen.getHambergerTab().click();
		hambergerTabScreen.getEnquiriestab().click();
		enquiryScreen.getPluseBtn().click();
		newEnquiryScreen.getLandIdTxtFld().click();
		newEnquiryScreen.getFirstLandId().click();
		newEnquiryScreen.getPlantationId().click();
		newEnquiryScreen.getFirstplatId().click();
		newEnquiryScreen.getRemarkTxtFld().sendKeys("Please visit");
		sdriver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Submit\"))"
			));
		newEnquiryScreen.getFirstcameraoption().click();
//		WebElement secCam=sdriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Capture Image\"])[2]"));
//		dutil.switchContext("com.gavl.oilpalm.samadhan");
//		dutil.explicitWait(10, secCam);
//		secCam.click();
//		WebDriverWait 
//		FluentWait<T> = new WebDriverWait(sdriver, Duration.ofSeconds(20));
//		WebElement cam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.TextView[@text=\"Capture Image\"])[2]")));
		

		FluentWait<AndroidDriver> wait = new FluentWait<>(sdriver)
		    .withTimeout(Duration.ofSeconds(20))  // Maximum wait time
		    .pollingEvery(Duration.ofSeconds(2))  // Interval to check for element visibility
		    .ignoring(NoSuchElementException.class);  // Ignore specific exceptions

		WebElement cam = wait.until(new Function<AndroidDriver, WebElement>() {
		    @SuppressWarnings("unused")
			public WebElement apply1(AndroidDriver driver) {
		        return sdriver.findElement(By.xpath("//android.widget.TextView[@text=\"Capture Image\"])[2]"));  
		    }

			@Override
			public WebElement apply(AndroidDriver t) {
				// TODO Auto-generated method stub
				return null;
			}
		});

		cam.click();
		

//		WebElement cam=   (WebElement) ((JavascriptExecutor)sdriver).executeScript("mobile:clickGesture", ImmutableMap.of("X",359,"Y",1139));
//		dutil.explicitWait(10, cam);
//		cam.click();
//		sdriver.findElement(AppiumBy.androidUIAutomator(
//			    "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Submit\"))"
//			));

		newEnquiryScreen.getSubmitBtn().click();
	}
}
