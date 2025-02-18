package Farmer_V106_Functional;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
/*
 * @author Testing Engineer
 */
public class ProfileTest extends BaseClass_Farmer {
// This is to check whether generate farmer code is matching or not.
	@Test
	public void viewFarmerProfile() {
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnProfile();
		driverUtility.threadWait(3);
		hamburgerTabScreen.verifyFarmerCode();
	}
	
//	This is to verify users bank details
	@Test
	public void verifyBankDetailOfUser() {
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnProfile();
		driverUtility.threadWait(3);
		hamburgerTabScreen.clickOnBankDetails();
		hamburgerTabScreen.verifyAccountNumber();
	}
	
	/*
	 * This is to verify that user should be able to see his RFID card details
	 */
	@Test
	public void verifyRFIDcardDetailIsPresent() {
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnProfile();
		driverUtility.threadWait(3);
		myProfileScreen.clickOnRFIDDetail();
		myProfileScreen.verifyRfidCardNumber();
	}
	
	/*
	 *This is to verify that user should be able to change profile picture
	 */
	@Test
	public void verifyUserIsAbleToChangeProfileImageThroughCamera() {
		driverUtility.implicitWait(10);
		homeScreen.clickOnhamburgerTab();
		hamburgerTabScreen.clickOnProfile();
		driverUtility.threadWait(3);
		myProfileScreen.clickOnProfilePictureIcon();
		profilePictureScreen.clickOnCameraTab();
	}
}
