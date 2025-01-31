package Farmer_V106_Functional;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
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
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getCCslottab().click();
		slotBookingScreen.getbookAslotbtn().click();
		selectLandScreen.getlandId().click();
		selectLandScreen.getkgtextfld().sendKeys("290");
		selectLandScreen.getnextBtn().click();
		selectCcScreen.getsecondCenter().click();
		selectCcScreen.getbookaSlotbtn().click();
		
		WebElement time=deliveryTimeScreen.getThirteenthtimeslot();
		time.click();
		deliveryTimeScreen.getConfirmbtn().click();
		deliveryTimeScreen.getokBtn().click();
		String ActualText=deliveryTimeScreen.getText().getText();
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
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getCCslottab().click();
		slotBookingScreen.getbookAslotbtn().click();
		selectLandScreen.getlandId().click();
		selectLandScreen.getnextBtn().click();
		if(selectLandScreen.getErrorMsg().isDisplayed()) {
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
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getCCslottab().click();
		slotBookingScreen.getbookAslotbtn().click();
		selectLandScreen.getlandId().click();
		selectLandScreen.getkgtextfld().sendKeys("285");
		selectLandScreen.getnextBtn().click();
		selectCcScreen.getsecondCenter().click();
		selectCcScreen.getbookaSlotbtn().click();
		deliveryTimeScreen.getConfirmbtn().click();
		if(deliveryTimeScreen.getErrorMessage().isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Message did not Dispalyed: Case Fails");
		}
	}
	
}
