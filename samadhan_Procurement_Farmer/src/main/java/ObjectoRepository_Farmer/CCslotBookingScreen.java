package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.android.AndroidDriver;

public class CCslotBookingScreen extends BaseClass_Farmer{

	AndroidDriver driver;
	public CCslotBookingScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
			
	@FindBy(xpath = "//android.widget.TextView[@resource-id='button-text']")
	private WebElement bookAslotbutton;
	
	public WebElement getbookAslotbutton() {
		return bookAslotbutton;
	}
	
	public void clickOnBookAslotbutton() {
	    gestureUtility.click(bookAslotbutton);
	}
	
	
}
