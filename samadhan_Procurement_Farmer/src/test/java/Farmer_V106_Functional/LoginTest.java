package Farmer_V106_Functional;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;

public class LoginTest extends BaseClass_Farmer{

	@Test
	public void verifyUserAbleToLogin() {
		String mobileNumber="9354029690";
		String firstdigit="1";
		String seconddigit="2";
		String thirddigit="3";
		String forthdigit="4";
		driverUtility.implicitWait(10);
		loginScreen.sendkeyToMobileTextField(mobileNumber);
		loginScreen.clickOnNextButton();
		loginScreen.sendkeyToFirstTextBox(firstdigit);
		loginScreen.sendkeyToSecondTextBox(seconddigit);
		loginScreen.sendkeyToThirdTextBox(thirddigit);
		loginScreen.sendkeyToForthTextBox(forthdigit);
		loginScreen.clickOnVerifyOtpButton();
		
	}
}
