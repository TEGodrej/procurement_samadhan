package Farmer_V106_Functional;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;

public class Profile extends BaseClass_Farmer {
// This is to check whether generate farmer code is matching or not.
	@Test
	public void ViewFarmerProfile() {
		String ExpectedFarmerCode="1123041331";
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getProfile().click();
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
	public void VerifyBankDetail() {
		String expectedAccountNo="52369874123";
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getProfile().click();
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
	
	
//	This is to verify that user should be able to see his RFID card details
	@Test
	public void VerifyRFIDcard() {
		dutil.implicitWait(5);
		hp.getHambergerTab().click();
		htp.getProfile().click();
		mpp.getRFIDdetail().click();
		WebElement cardNumber=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"456457676\"]"));
		if(cardNumber.isDisplayed()) {
			assertTrue(true);
		}else {
			System.out.println("Card does not displayed");
		}
	}
}
