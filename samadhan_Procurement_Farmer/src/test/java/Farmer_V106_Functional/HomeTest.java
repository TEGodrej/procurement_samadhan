package Farmer_V106_Functional;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;

/**
 *@author DivyaPrakashAmar
 */
@Listeners(GenericUtilities.ExtentReportsListner.class)
public class HomeTest extends BaseClass_Farmer {

	/**
	 *This method is use to verify UserRank
	 */
    @Test
    public void verifyUserRank() {
        driverUtility.implicitWait(10);
        homeScreen.verifyAmatureText();
    }

    /**
	 *This method is use to verify FFB Pricing which is automatically displaying on home page
	 */
    @Test
    public void FFBPricing() {
        driverUtility.implicitWait(10);
        homeScreen.verifyFfbPrice();
    }
}
