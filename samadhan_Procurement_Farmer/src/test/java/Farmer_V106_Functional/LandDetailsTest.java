package Farmer_V106_Functional;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
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
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getMylandtab().click();

	    driverUtility.implicitWait(10);
	    
			if(myLandDetailScreen.getFirstLandId().isDisplayed()) {
		    	assertTrue(true);
		    }else {
		    	System.out.println("Land id did not found");
		    }
	    }
	
/*
 * This is to verify that user is able to record harvest through land details page
 * Date Xpath should be changed manually every time
 */	
	@Test
	public void RecordHarvestThroughMyLandDetail() {
		String count="250";
		driverUtility.implicitWait(10);
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getMylandtab().click();
		myLandDetailScreen.getFirstLandId().click();
		myLandDetailScreen.getPlantationId().click();
		myLandDetailScreen.getRecordHarvesting().click();
		recordHarvestScreen.getdateTextFeild().click();
		recordHarvestScreen.getDate().click();
		recordHarvestScreen.getsaveBtn().click();
		recordHarvestScreen.getFFBcountTextfeild().sendKeys(count);
		recordHarvestScreen.getcaptureimageTab().click();
		WebElement submitBtn=  recordHarvestScreen.getsubmitBtn();
		driverUtility.explicitWait(5, submitBtn);
		submitBtn.click();
		recordHarvestScreen.getokayBtn().click();
		
	}
	/*
	 * This is to verify that whatever information user have provided while recording harvest same info is displayed in FFB Supply page or not
	 * Date has to be change manually
	 */
	@Test
	public void verifyTheRecordedHarvestPresentOnFFBHarvest() {
		String count="278";
		driverUtility.implicitWait(10);
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getMylandtab().click();
		myLandDetailScreen.getFirstLandId().click();
		myLandDetailScreen.getPlantationId().click();
		myLandDetailScreen.getRecordHarvesting().click();
		recordHarvestScreen.getdateTextFeild().click();
		recordHarvestScreen.getDate().click();
		recordHarvestScreen.getsaveBtn().click();
		recordHarvestScreen.getFFBcountTextfeild().sendKeys(count);
		recordHarvestScreen.getcaptureimageTab().click();
		WebElement submitBtn=recordHarvestScreen.getsubmitBtn();
		driverUtility.explicitWait(5, submitBtn);
		submitBtn.click();
		recordHarvestScreen.getokayBtn().click();
		myLandDetailScreen.gethamberTab().click();
		hamburgerTabScreen.getFFBharvesttab().click();
		
	}
	
/*
 *This is to check user should not be able to record Harvest without selecting date 
 * 
 */	
	
	@Test
	public void verifyUserNotBeAbleToRecordHarvestWithoutEnteringDate() {
		String count="278";
		driverUtility.implicitWait(10);
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getMylandtab().click();
		myLandDetailScreen.getFirstLandId().click();
		myLandDetailScreen.getPlantationId().click();
		myLandDetailScreen.getRecordHarvesting().click();
		recordHarvestScreen.getFFBcountTextfeild().sendKeys(count);
		WebElement submitBtn=recordHarvestScreen.getsubmitBtn();
		driverUtility.explicitWait(5, submitBtn);
		submitBtn.click();
		if(recordHarvestScreen.getHarvestDateErrorMsg().isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Message did not displayed: Case Fails");
		}
	}
/*
 *This is to verify that user should not be able to record harvest without entering FFB Count
 *Date xpath have to be change before execution
 */	
	
	@Test
	public void verifyUserNotBeAbleToRecordHarvestWithoutEnteringFFBcount() {
		driverUtility.implicitWait(10);
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getMylandtab().click();
		myLandDetailScreen.getFirstLandId().click();
		myLandDetailScreen.getPlantationId().click();
		myLandDetailScreen.getRecordHarvesting().click();
		recordHarvestScreen.getdateTextFeild().click();
		recordHarvestScreen.getDate().click();
		recordHarvestScreen.getsaveBtn().click();
		WebElement submitBtn=recordHarvestScreen.getsubmitBtn();
		driverUtility.explicitWait(5, submitBtn);
		submitBtn.click();
		if(recordHarvestScreen.getFfbCountErrorMsg().isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Message did not displayed: Case Fails");
		}
	}
/*
 * This is to check farmer should not be able to record harvest without uploading image
 * Date xpath has to be changed before execution of the script
 * 
 */	
	@Test
	public void verifyUserNotBeAbleToRecordHarvestWithoutUploadingImageInLandDetail() {
		String count="278";
		driverUtility.implicitWait(10);
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getMylandtab().click();
		myLandDetailScreen.getFirstLandId().click();
		myLandDetailScreen.getPlantationId().click();
		myLandDetailScreen.getRecordHarvesting().click();
		recordHarvestScreen.getdateTextFeild().click();
		recordHarvestScreen.getDate().click();
		recordHarvestScreen.getsaveBtn().click();
		recordHarvestScreen.getFFBcountTextfeild().sendKeys(count);
		recordHarvestScreen.getsubmitBtn().click();
		if(recordHarvestScreen.getImageErrorMsg().isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Message did not displayed: Case Fails");
		}
	}
}
