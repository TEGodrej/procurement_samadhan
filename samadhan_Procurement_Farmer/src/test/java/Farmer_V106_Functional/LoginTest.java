package Farmer_V106_Functional;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericUtilities.BaseClass_Farmer;

/**
 *@author DivyaPrakashAmar
 */
@Listeners(GenericUtilities.ExtentReportsListner.class)
public class LoginTest extends BaseClass_Farmer{

	/**
	 *This method is use to verify wheather user is able to Login
	 */
	@Test
	public void verifyUserAbleToLogin() {
//		String mobileNumber="9354029690";
//		String firstdigit="1";
//		String seconddigit="2";
//		String thirddigit="3";
//		String forthdigit="4";
		String mobileNumber=excelutility.readDataFromExcel("TestData", 2, 1);
		String firstdigit=excelutility.readDataFromExcel("TestData", 6, 1);
		String seconddigit=excelutility.readDataFromExcel("TestData", 7, 1);
		String thirddigit=excelutility.readDataFromExcel("TestData", 8, 1);
		String forthdigit=excelutility.readDataFromExcel("TestData", 9, 1);
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
