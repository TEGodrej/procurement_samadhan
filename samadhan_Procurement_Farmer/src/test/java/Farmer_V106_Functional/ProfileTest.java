package Farmer_V106_Functional;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;

/**
 *@author DivyaPrakashAmar
 */
@Listeners(GenericUtilities.ExtentReportsListner.class)
public class ProfileTest extends BaseClass_Farmer {
	/**
	 *This is to check whether generate farmer code is matching or not.
	 */
	@Test(priority = 1)
	public void viewFarmerProfile() {
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnProfile();
		driverUtility.threadWait(3);
		hamburgerTabScreen.verifyFarmerCode();
	}
	
	/**
	 *This method is use to verify users bank details
	 */
	@Test(priority = 2)
	public void verifyBankDetailOfUser() {
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnProfile();
		driverUtility.threadWait(3);
		hamburgerTabScreen.clickOnBankDetails();
		hamburgerTabScreen.verifyBankName();
	}
	
	/**
	 * This method is to verify that user should be able to see his RFID card details
	 */
	@Test(priority = 3)
	public void verifyRFIDcardDetailIsPresent() {
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnProfile();
		driverUtility.threadWait(5);
		myProfileScreen.clickOnRFIDDetail();
		myProfileScreen.verifyRfidCardNumber();
	}
	
}
