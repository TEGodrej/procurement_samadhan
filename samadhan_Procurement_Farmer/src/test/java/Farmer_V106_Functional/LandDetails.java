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
public class LandDetails extends BaseClass_Farmer{

	@Test
	public void landDetail() {
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
	    htp.getMylandtab().click();

	    dutil.implicitWait(10);
	    
			if(mldp.getFirstLandId().isDisplayed()) {
		    	assertTrue(true);
		    }else {
		    	System.out.println("Land id did not found");
		    }
	    }
	
//	This is to verify that user is able to record harvest through land details page
	@Test
	public void RecordHarvest() {
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getMylandtab().click();
		mldp.getFirstLandId().click();
		mldp.getPlantationId().click();
		mldp.getRecordHarvesting().click();
		rhp.getdateTextFeild().click();
		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"8\"]"));
		gutil.click(date);
		rhp.getsaveBtn().click();
		rhp.getFFBcountTextfeild().sendKeys("250");
		rhp.getcaptureimageTab().click();
		WebElement submitBtn=  rhp.getsubmitBtn();
		dutil.explicitWait(5, submitBtn);
		submitBtn.click();
		rhp.getokayBtn().click();
		
	}
	
	@Test
	public void verifyTheRecordedHarvestPresentOnFFBHarvest() {
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getMylandtab().click();
		mldp.getFirstLandId().click();
		mldp.getPlantationId().click();
		mldp.getRecordHarvesting().click();
		rhp.getdateTextFeild().click();
		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"8\"]"));
		gutil.click(date);
		rhp.getsaveBtn().click();
		rhp.getFFBcountTextfeild().sendKeys("269");
		rhp.getcaptureimageTab().click();
		WebElement submitBtn=rhp.getsubmitBtn();
		dutil.explicitWait(5, submitBtn);
		submitBtn.click();
		rhp.getokayBtn().click();
		mldp.gethamberTab().click();
		htp.getFFBharvesttab().click();
		
	}
	
}
