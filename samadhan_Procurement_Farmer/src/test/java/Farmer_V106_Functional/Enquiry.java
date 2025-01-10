package Farmer_V106_Functional;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import GenericUtilities.BaseClass_Farmer;

public class Enquiry extends BaseClass_Farmer{
//This is to verify that user is able to raise a new enquiry
	@Test
	public void raiseNewEnquiry() {
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getEnquiriestab().click();
		ep.getPluseBtn().click();
		nep.getLandIdTxtFld().click();
		nep.getFirstLandId().click();
		nep.getPlantationId().click();
		nep.getFirstplatId().click();
		nep.getRemarkTxtFld().sendKeys("Please visit");
//		@SuppressWarnings("unused")
//		boolean canScrollMore = (Boolean) ((JavascriptExecutor) sdriver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//		    "left", 319, "top", 319, "width", 1127, "height", 560,
//		    "direction", "up",
//		    "percent", 0.5
//		));
		WebElement secCam=nep.getSecondcameraoption();
		
		nep.getFirstcameraoption().click();
//		dutil.switchContext("com.gavl.oilpalm.samadhan");
		dutil.explicitWait(10, secCam);
		secCam.click();
		
		nep.getSubmitBtn().click();
	}
}
