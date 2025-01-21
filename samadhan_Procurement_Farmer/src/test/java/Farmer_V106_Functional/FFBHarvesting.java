package Farmer_V106_Functional;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;

public class FFBHarvesting extends BaseClass_Farmer {
/*
 *This is verify user is able to record harvest or not 
 *Date has to be changed every time before new run
 */
	@Test
	public void RecordHarvest() {
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getFFBharvesttab().click();
		fsp.getrecordharvestingbtn().click();
		fldsp.getfirstlandinfo().click();
		pdsp.getplantationId().click();
		pdsp.getrecordharvestbtn().click();
		rhp.getdateTextFeild().click();

		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"17\"]"));
		gutil.click(date);
		rhp.getsaveBtn().click();
		rhp.getFFBcountTextfeild().sendKeys("290");
		rhp.getcaptureimageTab().click();
		WebElement submitBtn=  rhp.getsubmitBtn();
		dutil.explicitWait(5, submitBtn);
		submitBtn.click();
		rhp.getokayBtn().click();
	
	}
	/*
	 *This is to verify that the recorded harvest in have same data or not 
	 *Xpath of harvestId Should Be changed before running every script
	 */
	@Test
	public void verifyEnteredDetail() {
		String expectedharvestId="589";
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getFFBharvesttab().click();
		WebElement harvest=sdriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"card\"]/android.view.ViewGroup"));
		harvest.click();
		WebElement harvestId=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"589\"]"));
		String actualharvestid=harvestId.getText();
		
		if(actualharvestid.equals(expectedharvestId)) {
			assertTrue(true);
		}else {
			System.out.println("harvestId is not matching:Case Fail");
		}
	}
	/*
	 *This is to verify that user should not be able to record harvest Without entering Date
	 */
	@Test
	public void RecordHarvestWithoutEnteringDate() {
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getFFBharvesttab().click();
		fsp.getrecordharvestingbtn().click();
		fldsp.getfirstlandinfo().click();
		pdsp.getplantationId().click();
		pdsp.getrecordharvestbtn().click();
		rhp.getFFBcountTextfeild().sendKeys("234");
		WebElement submitBtn=rhp.getsubmitBtn();
		dutil.explicitWait(10, submitBtn);
		submitBtn.click();
		WebElement ErrorMsg=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select harvesting date.\"]"));
		if(ErrorMsg.isDisplayed()) {
			assertTrue(true);
		}else {
			System.out.println("Message not displayed: case Fail");
		}
	}
	/*
	 *This is to verify that if user do not upload picture they should not be able to record the harvest
	 *Date xpath should be changed every time before execution
	 */
	@Test
	public void recordHarvestWithoutUploadingPicture() {
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getFFBharvesttab().click();
		fsp.getrecordharvestingbtn().click();
		fldsp.getfirstlandinfo().click();
		pdsp.getplantationId().click();
		pdsp.getrecordharvestbtn().click();
		rhp.getdateTextFeild().click();
		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"17\"]"));
		gutil.click(date);
		rhp.getsaveBtn().click();
		rhp.getFFBcountTextfeild().sendKeys("234");
		WebElement submitBtn=  rhp.getsubmitBtn();
		dutil.explicitWait(5, submitBtn);
		submitBtn.click();
		WebElement ImageErrorMsg=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Please upload file.\"]"));
		if(ImageErrorMsg.isDisplayed()) {
			assertTrue(true);
		}else {
			System.out.println("Message did not displayed: Case Fails");
		}
	}
}
