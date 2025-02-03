package Farmer_V106_Functional;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;
/*
 * @author Testing Engineer
 * This is to verify the Land Details Functionality
 */
public class LandDetailsTest extends BaseClass_Farmer{

	@Test
	public void verifyFarmerIsAbleToSeelandDetail() {
		driverUtility.implicitWait(10);
		homeScreen.gethamburgerTab().click();
	    hambergerTabScreen.getmyLandTab().click();

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
		driverUtility.implicitWait(10);
		homeScreen.gethamburgerTab().click();
		hambergerTabScreen.getmyLandTab().click();
		myLandDetailScreen.getFirstLandId().click();
		myLandDetailScreen.getPlantationId().click();
		myLandDetailScreen.getRecordHarvesting().click();
		recordHarvestScreen.getdateTextFeild().click();
		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"17\"]"));
		gestureUtility.click(date);
		recordHarvestScreen.getsaveBtn().click();
		recordHarvestScreen.getFFBcountTextfeild().sendKeys("250");
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
		driverUtility.implicitWait(10);
		homeScreen.gethamburgerTab().click();
		hambergerTabScreen.getmyLandTab().click();
		myLandDetailScreen.getFirstLandId().click();
		myLandDetailScreen.getPlantationId().click();
		myLandDetailScreen.getRecordHarvesting().click();
		recordHarvestScreen.getdateTextFeild().click();
		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"17\"]"));
		gestureUtility.click(date);
		recordHarvestScreen.getsaveBtn().click();
		recordHarvestScreen.getFFBcountTextfeild().sendKeys("269");
		recordHarvestScreen.getcaptureimageTab().click();
		WebElement submitBtn=recordHarvestScreen.getsubmitBtn();
		driverUtility.explicitWait(5, submitBtn);
		submitBtn.click();
		recordHarvestScreen.getokayBtn().click();
		myLandDetailScreen.gethamberTab().click();
		hambergerTabScreen.getffbHarvestTab().click();
		
	}
	
/*
 *This is to check user should not be able to record Harvest without selecting date 
 * 
 */	
	
	@Test
	public void verifyUserNotBeAbleToRecordHarvestWithoutEnteringDate() {
		driverUtility.implicitWait(10);
		homeScreen.gethamburgerTab().click();
		hambergerTabScreen.getmyLandTab().click();
		myLandDetailScreen.getFirstLandId().click();
		myLandDetailScreen.getPlantationId().click();
		myLandDetailScreen.getRecordHarvesting().click();
		recordHarvestScreen.getFFBcountTextfeild().sendKeys("269");
		WebElement submitBtn=recordHarvestScreen.getsubmitBtn();
		driverUtility.explicitWait(5, submitBtn);
		submitBtn.click();
		WebElement ErrorMsg=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select harvesting date.\"]"));
		if(ErrorMsg.isDisplayed()) {
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
		homeScreen.gethamburgerTab().click();
		hambergerTabScreen.getmyLandTab().click();
		myLandDetailScreen.getFirstLandId().click();
		myLandDetailScreen.getPlantationId().click();
		myLandDetailScreen.getRecordHarvesting().click();
		recordHarvestScreen.getdateTextFeild().click();
		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"17\"]"));
		gestureUtility.click(date);
		recordHarvestScreen.getsaveBtn().click();
		WebElement submitBtn=recordHarvestScreen.getsubmitBtn();
		driverUtility.explicitWait(5, submitBtn);
		submitBtn.click();
		WebElement ErrorMsg=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Enter FFB count.\"]"));
		if(ErrorMsg.isDisplayed()) {
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
		driverUtility.implicitWait(10);
		homeScreen.gethamburgerTab().click();
		hambergerTabScreen.getmyLandTab().click();
		myLandDetailScreen.getFirstLandId().click();
		myLandDetailScreen.getPlantationId().click();
		myLandDetailScreen.getRecordHarvesting().click();
		recordHarvestScreen.getdateTextFeild().click();
		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"15\"]"));
		date.click();
		recordHarvestScreen.getsaveBtn().click();
		recordHarvestScreen.getFFBcountTextfeild().sendKeys("898");
		recordHarvestScreen.getsubmitBtn().click();
		WebElement ErrorMsg=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Please upload file.\"]"));
		if(ErrorMsg.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Message did not displayed: Case Fails");
		}
	}
}
