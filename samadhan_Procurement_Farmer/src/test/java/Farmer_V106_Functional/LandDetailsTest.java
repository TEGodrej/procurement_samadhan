package Farmer_V106_Functional;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
/*
 * @author Testing Engineer
 * This is to verify the Land Details Functionality
 */
public class LandDetailsTest extends BaseClass_Farmer{

	@Test
	public void verifyFarmerIsAbleToSeelandDetail() {
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnMyLandTab();

	    driverUtility.implicitWait(10);
	    
		myLandDetailScreen.verifyFirstLandId();
	    }
	
/*
 * This is to verify that user is able to record harvest through land details page
 * Date Xpath should be changed manually every time
 */	
	@Test
	public void RecordHarvestThroughMyLandDetail() {
		String ffbCount="250";
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnMyLandTab();
		myLandDetailScreen.clickOnFirstLandId();
		myLandDetailScreen.clickOnPlantationId();
		myLandDetailScreen.clickOnRecordHarvesting();
		recordHarvestScreen.clickOnDateTextFeild();
		recordHarvestScreen.clickOnDate();
		recordHarvestScreen.clickOnSaveButton();
		recordHarvestScreen.sendkeyToFfbCountTextFeild(ffbCount);
		recordHarvestScreen.clickOnCaptureImageTab();
	
		recordHarvestScreen.clickOnSubmitButton();
		
		recordHarvestScreen.clickOnOkayButton();
		
	}
	/*
	 * This is to verify that whatever information user have provided while recording harvest same info is displayed in FFB Supply page or not
	 * Date has to be change manually
	 */
	@Test
	public void verifyTheRecordedHarvestPresentOnFFBHarvest() {
		String ffbCount="250";
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnMyLandTab();
		myLandDetailScreen.clickOnFirstLandId();
		myLandDetailScreen.clickOnPlantationId();
		myLandDetailScreen.clickOnRecordHarvesting();
		recordHarvestScreen.clickOnDateTextFeild();
		recordHarvestScreen.clickOnDate();
		recordHarvestScreen.clickOnSaveButton();
		recordHarvestScreen.sendkeyToFfbCountTextFeild(ffbCount);
		recordHarvestScreen.clickOnCaptureImageTab();
		recordHarvestScreen.clickOnSubmitButton();
		recordHarvestScreen.clickOnOkayButton();
		myLandDetailScreen.clickOnHamburgerTab();
		hamburgerTabScreen.clickOnFfbHarvestTab();
		
	}
	
/*
 *This is to check user should not be able to record Harvest without selecting date 
 * 
 */	
	
	@Test
	public void verifyUserNotBeAbleToRecordHarvestWithoutEnteringDate() {
		String ffbCount="250";
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnMyLandTab();
		myLandDetailScreen.clickOnFirstLandId();
		myLandDetailScreen.clickOnPlantationId();
		myLandDetailScreen.clickOnRecordHarvesting();
		recordHarvestScreen.sendkeyToFfbCountTextFeild(ffbCount);
		recordHarvestScreen.clickOnSubmitButton();
		recordHarvestScreen.verifyDateErrorMessage();
	}
/*
 *This is to verify that user should not be able to record harvest without entering FFB Count
 *Date xpath have to be change before execution
 */	
	
	@Test
	public void verifyUserNotBeAbleToRecordHarvestWithoutEnteringFFBcount() {
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnMyLandTab();
		myLandDetailScreen.clickOnFirstLandId();
		myLandDetailScreen.clickOnPlantationId();
		myLandDetailScreen.clickOnRecordHarvesting();
		recordHarvestScreen.clickOnDateTextFeild();
		recordHarvestScreen.clickOnDate();
		recordHarvestScreen.clickOnSaveButton();
		recordHarvestScreen.clickOnSubmitButton();
		recordHarvestScreen.verifyFfbErrorMessage();
	}
/*
 * This is to check farmer should not be able to record harvest without uploading image
 * Date xpath has to be changed before execution of the script
 * 
 */	
	@Test
	public void verifyUserNotBeAbleToRecordHarvestWithoutUploadingImageInLandDetail() {
		String ffbCount="250";
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnMyLandTab();
		myLandDetailScreen.clickOnFirstLandId();
		myLandDetailScreen.clickOnPlantationId();
		myLandDetailScreen.clickOnRecordHarvesting();
		recordHarvestScreen.clickOnDateTextFeild();
		recordHarvestScreen.clickOnDate();
		recordHarvestScreen.clickOnSaveButton();
		recordHarvestScreen.sendkeyToFfbCountTextFeild(ffbCount);
		recordHarvestScreen.clickOnCaptureImageTab();
	
		recordHarvestScreen.clickOnSubmitButton();
		recordHarvestScreen.verifyFileErrorMessage();
	}
}
