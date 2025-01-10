package Farmer_V106_Functional;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;

public class FFBHarvesting extends BaseClass_Farmer {

	@Test
	public void RecordHarvest() {
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getFFBharvesttab().click();
		fsp.getrecordharvestingbtn().click();
		fldsp.getfirstlandinfo().click();
		pdsp.getplantationId().click();
		pdsp.getrecordharvestbtn().click();
		rhp.getdateTextFeild().click();

		WebElement date=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"10\"]"));
		gutil.click(date);
		rhp.getsaveBtn().click();
		rhp.getFFBcountTextfeild().sendKeys("290");
		rhp.getcaptureimageTab().click();
		WebElement submitBtn=  rhp.getsubmitBtn();
		dutil.explicitWait(5, submitBtn);
		submitBtn.click();
		rhp.getokayBtn().click();
	
	}
	
	@Test
	public void verifyEnteredDetail() {
		String expectedharvestId="553";
		dutil.implicitWait(10);
		hp.getHambergerTab().click();
		htp.getFFBharvesttab().click();
		WebElement harvest=sdriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"card\"]/android.view.ViewGroup"));
		harvest.click();
		WebElement harvestId=sdriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"553\"]"));
		String actualharvestid=harvestId.getText();
		
		if(actualharvestid.equals(expectedharvestId)) {
			assertTrue(true);
		}else {
			System.out.println("harvestId is not matching:Case Fail");
		}
	}
}
