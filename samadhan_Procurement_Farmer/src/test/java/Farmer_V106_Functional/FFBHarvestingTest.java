package Farmer_V106_Functional;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;

/**
 *@author DivyaPrakashAmar
 */
@Listeners(GenericUtilities.ExtentReportsListner.class)
public class FFBHarvestingTest extends BaseClass_Farmer {
/**
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
		plantationDetailScreen.clickOnRecordHarvestButton();
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
	/**
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

		recordHarvestScreen.date();
		recordHarvestScreen.clickOnSaveButton();
		recordHarvestScreen.sendkeyToFfbCountTextFeild(expectedharvestId);
		recordHarvestScreen.clickOnCaptureImageTab();
		driverUtility.threadWait(8);
	    recordHarvestScreen.clickOnSubmitButton();
		recordHarvestScreen.clickOnOkayButton();
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnFfbHarvestTab();
		recordHarvestScreen.ClickOnHarvest();
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
		recordHarvestScreen.verifyWarningMessage();
	}
	
	/**
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
		recordHarvestScreen.date();
		recordHarvestScreen.clickOnSaveButton();
		recordHarvestScreen.sendkeyToFfbCountTextFeild(ffbCount);
		recordHarvestScreen.clickOnSubmitButton();
		recordHarvestScreen.verifyFileErrorMessage();
	}
}
