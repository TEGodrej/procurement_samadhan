package Farmer_V106_Functional;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
import GenericUtilities.ListenerUtility;
/*
 * @author Testing Engineer
 */
@Listeners(ListenerUtility.class)
public class CollectionCenterBookingTest extends BaseClass_Farmer{
/*
 *This is to verify that user should be able to book slot 
 */
	@Test
	public void verifyUserIsAbleToBookCc() {
		driverUtility.implicitWait(10);
//		String weight="290";
		String weight=excelutility.readDataFromExcel("TestData", 0, 0);
//		String time="12:30 PM - 1:30PM";
		driverUtility.implicitWait(20);
		homeScreen.clickOnhamburgerTab();
		driverUtility.threadWait(2);
		hamburgerTabScreen.clickOnCcSlotTab();
		slotBookingScreen.clickOnBookAslotbutton();
		selectLandScreen.clickOnLandId();
		selectLandScreen.sendKeyToKgTextField(weight);
		selectLandScreen.clickOnNextButton();
		selectCcScreen.clickOnSecondCenter();
		selectCcScreen.clickOnBookASlotbutton();
		driverUtility.threadWait(2);
		deliveryTimeScreen.clickOnMonth();
		deliveryTimeScreen.clickOnTimeSlot();
		deliveryTimeScreen.clickOnConfirmButton();
		deliveryTimeScreen.clickOnOkButton();
		deliveryTimeScreen.verifyMessage();
	}
	
	/*
	 *This is to verify that the user is able to do CC Slot Booking without entering weight on select land page 
	 *Assertions are made on error Message display
	 */
	@Test
	public void verifyUserIsAbleToBookCcWithoutWeight() {
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnCcSlotTab();
		slotBookingScreen.clickOnBookAslotbutton();
		selectLandScreen.clickOnLandId();
		selectLandScreen.clickOnNextButton();
		selectLandScreen.verifyLandErrorMessage();
	}
	
	/*
	 *This is to verify that user should not be able to book a slot without selecting date 
	 */
	@Test
	public void VerifyUserAbleToBookSlotWithoutSelectingDate() {
//		String weight="234";
		String weight=excelutility.readDataFromExcel("TestData", 0, 0);
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnCcSlotTab();
		slotBookingScreen.clickOnBookAslotbutton();
		selectLandScreen.clickOnLandId();
		selectLandScreen.sendKeyToKgTextField(weight);
		selectLandScreen.clickOnNextButton();
		selectCcScreen.clickOnSecondCenter();
		selectCcScreen.clickOnBookASlotbutton();
		deliveryTimeScreen.clickOnConfirmButton();
		deliveryTimeScreen.verifyTimeSlotErrorMessage();
	}
	
}
