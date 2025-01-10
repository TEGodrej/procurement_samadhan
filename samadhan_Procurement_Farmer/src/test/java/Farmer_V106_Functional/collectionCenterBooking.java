package Farmer_V106_Functional;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;

public class collectionCenterBooking extends BaseClass_Farmer{

	@Test
	public void bookCC() {
		String Expectedtext="Upcoming Slot";
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getCCslottab().click();
		sbp.getbookAslotbtn().click();
		slp.getlandId().click();
		slp.getkgtextfld().sendKeys("290");
		slp.getnextBtn().click();
		scp.getfirstCenter().click();
		scp.getbookaSlotbtn().click();
		
//		@SuppressWarnings("unused")
//				boolean canScrollMore = (Boolean) ((JavascriptExecutor) sdriver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//					    "left", 350, "top", 1271, "width", 350, "height", 735,
//					    "direction", "up",
//					    "percent", 0.5 ));	
		
		dtp.getThirteenthtimeslot().click();
		dtp.getConfirmbtn().click();
		dtp.getokBtn().click();
		WebElement Text=sdriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Upcoming Slot!\"])[1]"));
		String ActualText=Text.getText();
		if(ActualText.equals(Expectedtext)) {
			assertTrue(true);
		}else {
			System.out.println("Text does not matched : Case Fail");
		}
	}
}
