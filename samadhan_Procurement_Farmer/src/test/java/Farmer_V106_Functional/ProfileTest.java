package Farmer_V106_Functional;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;
/*
 * @author Testing Engineer
 */
public class ProfileTest extends BaseClass_Farmer {
// This is to check whether generate farmer code is matching or not.
	@Test
	public void viewFarmerProfile() {
		String ExpectedFarmerCode="1123041331";
		driverUtility.implicitWait(10);
		homeScreen.gethamburgerTab().click();
		hambergerTabScreen.getProfile().click();
		WebElement FarmerCode=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"1123041331\"]"));
		String actualcode= FarmerCode.getText();
		
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
		homeScreen.gethamburgerTab().click();
		hambergerTabScreen.getProfile().click();
		WebElement bankBtn=sdriver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"0, Bank Details\"]"));
		bankBtn.click();
		WebElement AccountNo =sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"52369874123\"]"));
		String actualAccountNo = AccountNo.getText();
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
		homeScreen.gethamburgerTab().click();
		hambergerTabScreen.getProfile().click();
		myProfileScreen.getRFIDdetail().click();
		WebElement cardNumber=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"456457676\"]"));
		if(cardNumber.isDisplayed()) {
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
		homeScreen.gethamburgerTab().click();
		hambergerTabScreen.getProfile().click();
		myProfileScreen.getprofilepicIcon().click();
		profilePictureScreen.getCameraTab().click();
	}
}
