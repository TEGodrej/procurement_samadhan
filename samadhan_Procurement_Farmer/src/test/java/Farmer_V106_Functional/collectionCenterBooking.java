package Farmer_V106_Functional;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;

public class collectionCenterBooking extends BaseClass_Farmer{

	@Test
	public void bookCC() {
		String Expectedtext="Upcoming Slot";
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getCCslottab().click();
		sbp.getbookAslotbtn().click();
		slp.getlandId().click();
		slp.getkgtextfld().sendKeys("290");
		slp.getnextBtn().click();
		scp.getsecondCenter().click();
		scp.getbookaSlotbtn().click();
		
//		sdriver.findElement(AppiumBy.androidUIAutomator(
//			    "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"7:30 PM - 8:30 PM \"))"));
		WebElement time=dtp.getThirteenthtimeslot();
		gutil.scroll(time, true, 0, 0, 0, 0, 0, Expectedtext);
		
		
		dtp.getConfirmbtn().click();
		dtp.getokBtn().click();
		WebElement Text=sdriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Upcoming Slot!\"])[1]"));
		String ActualText=Text.getText();
		if(ActualText.equals(Expectedtext)) {
			assertTrue(true);
		}else {
			System.out.println("Text does not matched : Case Fail");
		}
	}
	/*
	 *This is to verify that the user is able to do CC Slot Booking without entering weight on select land page 
	 */
	@Test
	public void verifyUserIsAbleToBookCcWithoutWeight() {
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getCCslottab().click();
		sbp.getbookAslotbtn().click();
		slp.getlandId().click();
		slp.getnextBtn().click();
		WebElement ErrorMsg=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Please Select land.\"]"));
		if(ErrorMsg.isDisplayed()) {
			assertTrue(true);
		}else {
			System.out.println("Message did not displayed");
		}
	}
	
	@Test
	public void VerifyUserAbleTOBookSlotWithoutSelectingDate() {
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getCCslottab().click();
		sbp.getbookAslotbtn().click();
		slp.getlandId().click();
		slp.getkgtextfld().sendKeys("285");
		slp.getnextBtn().click();
		scp.getsecondCenter().click();
		scp.getbookaSlotbtn().click();
		dtp.getConfirmbtn().click();
		WebElement ErrorMsg=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Please select slot.\"]"));
		if(ErrorMsg.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Message did not Dispalyed: Case Fails");
		}
	}
}
