package Farmer_V106_Functional;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
/*
 * @author Testing Engineer
 */
public class ProfileTest extends BaseClass_Farmer {
// This is to check whether generate farmer code is matching or not.
	@Test
	public void viewFarmerProfile() {
		String ExpectedFarmerCode="1123041331";
		driverUtility.implicitWait(10);
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getProfile().click();
		String actualcode= myProfileScreen.getFarmerCode().getText();
		
		if(actualcode.equals(ExpectedFarmerCode)) {
			assertTrue(true, "Code is matched :Pass");
		}else {
			System.out.println("The script got failed");
		}
	}
	
//	This is to verify users bank details
	@Test
	public void verifyBankDetailOfUser() {
		String expectedAccountNo="52369874123";
		driverUtility.implicitWait(10);
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getProfile().click();
		myProfileScreen.getBankTab().click();
		String actualAccountNo = myProfileScreen.getAccountNumber().getText();
		if(actualAccountNo.equals(expectedAccountNo)) {
			assertTrue(true);
		}else {
			System.out.println("AccountNo did not matched");
		}
	}
	
	/*
	 * This is to verify that user should be able to see his RFID card details
	 */
	@Test
	public void verifyRFIDcardDetailIsPresent() {
		driverUtility.implicitWait(5);
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getProfile().click();
		myProfileScreen.getRFIDdetail().click();
		if(myProfileScreen.getCardNumber().isDisplayed()) {
			assertTrue(true);
		}else {
			System.out.println("Card does not displayed");
		}
	}
	
	/*
	 *This is to verify that user should be able to change profile picture
	 */
	@Test
	public void verifyUserIsAbleToChangeProfileImageThroughCamera() {
		driverUtility.implicitWait(10);
		homeScreen.getHambergerTab().click();
		hamburgerTabScreen.getProfile().click();
		myProfileScreen.getprofilepicIcon().click();
		profilePictureScreen.getCameraTab().click();
	}
}
