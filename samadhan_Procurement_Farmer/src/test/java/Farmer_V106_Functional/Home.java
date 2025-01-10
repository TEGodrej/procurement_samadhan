package Farmer_V106_Functional;
/*
 * @author Testing Engineer
 * */

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;

public class Home extends BaseClass_Farmer {

	@Test
	public void verifyUserRank() {
		dutil.implicitWait(10);
		if(hp.getAmatureText().isDisplayed()) {
		assertTrue(true, "The element is visible");
		}else {
			System.out.println("Element not visible");
		}
	}
	
	@Test
	public void FFBPricing() {
		dutil.implicitWait(10);
		if(hp.getFFBprice().isDisplayed()) {
		assertTrue(true, "The Element is visible");
		}
		else {
			System.out.println("Element is not visible");
		}
	}
}
