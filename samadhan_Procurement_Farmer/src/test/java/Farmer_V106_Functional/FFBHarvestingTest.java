package Farmer_V106_Functional;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
/*
 * @author Testing Engineer
 */
@Listeners(GenericUtilities.ExtentReportsListner.class)
public class FFBHarvestingTest extends BaseClass_Farmer {
/*
 *This is verify user is able to record harvest or not 
 *Date has to be changed every time before new run
 */
	@Test
	public void RecordHarvest() {
		String ffbCount=excelutility.readDataFromExcel("TestData", 3, 1);
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnFfbHarvestTab();
		ffbSupplyScreen.clickOnRecordHarvestingButton();
		farmerLandDetailScreen.clickOnFirstLandInfo();
		plantationDetailScreen.clickOnPlantationId();
		plantationDetailScreen.getrecordharvestbtn().click();
		recordHarvestScreen.clickOnDateTextFeild();

//		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"28\"]"));
//		date.click();
		recordHarvestScreen.date();
		recordHarvestScreen.clickOnSaveButton();
//		recordHarvestScreen.getsaveBtn().click();
		recordHarvestScreen.sendkeyToFfbCountTextFeild(ffbCount);
		recordHarvestScreen.clickOnCaptureImageTab();
		driverUtility.threadWait(8);
//		WebElement submitBtn=  recordHarvestScreen.getsubmitBtn();
//		driverUtility.explicitWait(5, submitBtn);
//		submitBtn.click();
		recordHarvestScreen.clickOnSubmitButton();
		recordHarvestScreen.clickOnOkayButton();
	
	}
	/*
	 *This is to verify that the recorded harvest in have same data or not 
	 *Xpath of harvestId Should Be changed before running every script
	 */
	@Test
	public void verifyEnteredDetail() {
//		String expectedharvestId="589";
		String expectedharvestId=excelutility.readDataFromExcel("TestData", 0, 0);
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnFfbHarvestTab();
		ffbSupplyScreen.clickOnRecordHarvestingButton();
		farmerLandDetailScreen.clickOnFirstLandInfo();
		plantationDetailScreen.clickOnPlantationId();
		plantationDetailScreen.clickOnRecordHarvestButton();
		recordHarvestScreen.clickOnDateTextFeild();

//		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"28\"]"));
//		date.click();
		recordHarvestScreen.date();
		recordHarvestScreen.clickOnSaveButton();
		recordHarvestScreen.sendkeyToFfbCountTextFeild(expectedharvestId);
		recordHarvestScreen.clickOnCaptureImageTab();
		driverUtility.threadWait(8);
	    recordHarvestScreen.clickOnSubmitButton();
//		driverUtility.explicitWait(5, submitBtn);
//		submitBtn.click();
		recordHarvestScreen.clickOnOkayButton();
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnFfbHarvestTab();
//		WebElement harvest=sdriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"card\"]/android.view.ViewGroup"));
//		harvest.click();
		recordHarvestScreen.ClickOnHarvest();
//		WebElement harvestId=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"589\"]"));
//		String actualharvestid=harvestId.getText();
//		
//		if(actualharvestid.equals(expectedharvestId)) {
//			assertTrue(true);
//		}else {
//			System.out.println("harvestId is not matching:Case Fail");
//		}
		recordHarvestScreen.verifyHarvestId();
	}
	/*
	 *This is to verify that user should not be able to record harvest Without entering Date
	 */
	@Test
	public void RecordHarvestWithoutEnteringDate() {
//		String count="290";
		String count=excelutility.readDataFromExcel("TestData", 5, 1);
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnFfbHarvestTab();
		ffbSupplyScreen.clickOnRecordHarvestingButton();
		farmerLandDetailScreen.clickOnFirstLandInfo();
		plantationDetailScreen.clickOnPlantationId();
		plantationDetailScreen.clickOnRecordHarvestButton();
		recordHarvestScreen.sendkeyToFfbCountTextFeild(count);
		recordHarvestScreen.clickOnSubmitButton();
//		driverUtility.explicitWait(10, submitBtn);
//		submitBtn.click();
//		WebElement ErrorMsg=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select harvesting date.\"]"));
//		if(ErrorMsg.isDisplayed()) {
//			assertTrue(true);
//		}else {
//			System.out.println("Message not displayed: case Fail");
//		}
		recordHarvestScreen.verifyWarningMessage();
	}
	/*
	 *This is to verify that if user do not upload picture they should not be able to record the harvest
	 *Date xpath should be changed every time before execution
	 */
	@Test
	public void recordHarvestWithoutUploadingPicture() {
		String ffbCount=excelutility.readDataFromExcel("TestData", 3, 1);
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnFfbHarvestTab();
		ffbSupplyScreen.clickOnRecordHarvestingButton();
		farmerLandDetailScreen.clickOnFirstLandInfo();
		plantationDetailScreen.clickOnPlantationId();
		plantationDetailScreen.clickOnRecordHarvestButton();
		recordHarvestScreen.clickOnDateTextFeild();
//		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='28']"));
//		gestureUtility.click(date);
		recordHarvestScreen.date();
		recordHarvestScreen.clickOnSaveButton();
		recordHarvestScreen.sendkeyToFfbCountTextFeild(ffbCount);
//		WebElement submitBtn=  recordHarvestScreen.getsubmitBtn();
//		driverUtility.explicitWait(5, submitBtn);
//		submitBtn.click();
		recordHarvestScreen.clickOnSubmitButton();
//		WebElement ImageErrorMsg=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Please upload file.\"]"));
//		if(ImageErrorMsg.isDisplayed()) {
//			assertTrue(true);
//		}else {
//			System.out.println("Message did not displayed: Case Fails");
//		}
		recordHarvestScreen.verifyFileErrorMessage();
	}
}
