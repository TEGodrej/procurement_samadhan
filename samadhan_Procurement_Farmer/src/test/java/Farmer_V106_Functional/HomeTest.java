package Farmer_V106_Functional;
/*
 * @author Testing Engineer
 */

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
import GenericUtilities.ListenerUtility;

@Listeners(ListenerUtility.class)
public class HomeTest extends BaseClass_Farmer {

    @Test
    public void verifyUserRank() {
        driverUtility.implicitWait(10);
        assertTrue(homeScreen.getAmatureText().isDisplayed(), "The element is visible");
    }

    @Test
    public void FFBPricing() {
        driverUtility.implicitWait(10);
        assertTrue(homeScreen.getffbPrice().isDisplayed(), "The Element is visible");
    }
}
