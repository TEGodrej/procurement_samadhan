package Farmer_V106_Functional;
/*
 * @author Testing Engineer
 * */

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
import GenericUtilities.ListenerUtility;

@Listeners(ListenerUtility.class)
public class Home extends BaseClass_Farmer {

    @Test
    public void verifyUserRank() {
        dutil.implicitWait(10);
        assertTrue(hp.getAmatureText().isDisplayed(), "The element is visible");
    }

    @Test
    public void FFBPricing() {
        dutil.implicitWait(10);
        assertTrue(hp.getFFBprice().isDisplayed(), "The Element is visible");
    }
}
