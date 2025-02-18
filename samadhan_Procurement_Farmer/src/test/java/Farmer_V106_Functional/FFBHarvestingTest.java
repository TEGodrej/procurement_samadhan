package Farmer_V106_Functional;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;
/*
 * @author Testing Engineer
 */
public class FFBHarvestingTest extends BaseClass_Farmer {
/*
 *This is verify user is able to record harvest or not 
 *Date has to be changed every time before new run
 */
	@Test
	public void RecordHarvest() {
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnFfbHarvestTab();
		ffbSupplyScreen.clickOnRecordHarvestingButton();
		farmerLandDetailScreen.clickOnFirstLandInfo();
		plantationDetailScreen.clickOnPlantationId();
		plantationDetailScreen.getrecordharvestbtn().click();
		recordHarvestScreen.getdateTextFeild().click();

		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"17\"]"));
		gestureUtility.click(date);
		recordHarvestScreen.getsaveBtn().click();
		recordHarvestScreen.getFFBcountTextfeild().sendKeys("290");
		recordHarvestScreen.getcaptureimageTab().click();
		WebElement submitBtn=  recordHarvestScreen.getsubmitBtn();
		driverUtility.explicitWait(5, submitBtn);
		submitBtn.click();
		recordHarvestScreen.getokayBtn().click();
	
	}
	/*
	 *This is to verify that the recorded harvest in have same data or not 
	 *Xpath of harvestId Should Be changed before running every script
	 */
	@Test
	public void verifyEnteredDetail() {
		String expectedharvestId="589";
		driverUtility.implicitWait(10);
		homeScreen.gethamburgerTab().click();
		hamburgerTabScreen.getffbHarvestTab().click();
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
		driverUtility.implicitWait(10);
		homeScreen.gethamburgerTab().click();
		hamburgerTabScreen.getffbHarvestTab().click();
		ffbSupplyScreen.getrecordharvestingButton().click();
		farmerLandDetailScreen.getfirstLandInfo().click();
		plantationDetailScreen.getplantationId().click();
		plantationDetailScreen.getrecordharvestbtn().click();
		recordHarvestScreen.getFFBcountTextfeild().sendKeys("234");
		WebElement submitBtn=recordHarvestScreen.getsubmitBtn();
		driverUtility.explicitWait(10, submitBtn);
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
		driverUtility.implicitWait(10);
		homeScreen.gethamburgerTab().click();
		hamburgerTabScreen.getffbHarvestTab().click();
		ffbSupplyScreen.getrecordharvestingButton().click();
		farmerLandDetailScreen.getfirstLandInfo().click();
		plantationDetailScreen.getplantationId().click();
		plantationDetailScreen.getrecordharvestbtn().click();
		recordHarvestScreen.getdateTextFeild().click();
		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"17\"]"));
		gestureUtility.click(date);
		recordHarvestScreen.getsaveBtn().click();
		recordHarvestScreen.getFFBcountTextfeild().sendKeys("234");
		WebElement submitBtn=  recordHarvestScreen.getsubmitBtn();
		driverUtility.explicitWait(5, submitBtn);
		submitBtn.click();
		WebElement ImageErrorMsg=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Please upload file.\"]"));
		if(ImageErrorMsg.isDisplayed()) {
			assertTrue(true);
		}else {
			System.out.println("Message did not displayed: Case Fails");
		}
	}
}
