package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class FFBsupplyScreen {
	
	AndroidDriver driver;
	public FFBsupplyScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='button-text']")
	private WebElement recordHarvestingbtn;
	
	public WebElement getrecordharvestingbtn() {
		return recordHarvestingbtn;
	}
}
