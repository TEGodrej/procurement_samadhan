package Farmer_V106_Functional;
/*
 * @author Testing Engineer
 */

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
import GenericUtilities.ListenerUtility;

@Listeners(ListenerUtility.class)
public class HomeTest extends BaseClass_Farmer {

    @Test
    public void verifyUserRank() {
        driverUtility.implicitWait(10);
        homeScreen.verifyAmatureText();
    }

    @Test
    public void FFBPricing() {
        driverUtility.implicitWait(10);
        homeScreen.verifyFfbPrice();
    }
}
