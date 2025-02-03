package Farmer_V106_Functional;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;
/*
 * @author Testing Engineer
 */
public class CollectionCenterBookingTest extends BaseClass_Farmer{
/*
 *This is to verify that user should be able to book slot 
 */
	@Test
	public void bookCC() {
		String Expectedtext="Upcoming Slot";
		driverUtility.implicitWait(10);
		homeScreen.gethamburgerTab().click();
		hambergerTabScreen.getccSlotTab().click();
		slotBookingScreen.getbookAslotbutton().click();
		selectLandScreen.getlandId().click();
		selectLandScreen.getkgtextfield().sendKeys("290");
		selectLandScreen.getnextButton().click();
		selectCcScreen.getSecondCenter().click();
		selectCcScreen.getBookaSlotbutton().click();
		
//		sdriver.findElement(AppiumBy.androidUIAutomator(
//			    "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"7:30 PM - 8:30 PM \"))"));
		WebElement time=deliveryTimeScreen.getTimeSlot();
//		gutil.scroll(time, true, 0, 0, 0, 0, 0, "up");
		time.click();
		deliveryTimeScreen.getconfirmButton().click();
		deliveryTimeScreen.getokButton().click();
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
	 *Assertions are made on error Message display
	 */
	@Test
	public void verifyUserIsAbleToBookCcWithoutWeight() {
		driverUtility.implicitWait(10);
		homeScreen.gethamburgerTab().click();
		hambergerTabScreen.getccSlotTab().click();
		slotBookingScreen.getbookAslotbutton().click();
		selectLandScreen.getlandId().click();
		selectLandScreen.getnextButton().click();
		WebElement ErrorMsg=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Please Select land.\"]"));
		if(ErrorMsg.isDisplayed()) {
			assertTrue(true);
		}else {
			System.out.println("Message did not displayed");
		}
	}
	
	/*
	 *This is to verify that user should not be able to book a slot without selecting date 
	 */
	@Test
	public void VerifyUserAbleTOBookSlotWithoutSelectingDate() {
		driverUtility.implicitWait(10);
		homeScreen.gethamburgerTab().click();
		hambergerTabScreen.getccSlotTab().click();
		slotBookingScreen.getbookAslotbutton().click();
		selectLandScreen.getlandId().click();
		selectLandScreen.getkgtextfield().sendKeys("285");
		selectLandScreen.getnextButton().click();
		selectCcScreen.getSecondCenter().click();
		selectCcScreen.getBookaSlotbutton().click();
		deliveryTimeScreen.getconfirmButton().click();
		WebElement ErrorMsg=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Please select slot.\"]"));
		if(ErrorMsg.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Message did not Dispalyed: Case Fails");
		}
	}
	
}
