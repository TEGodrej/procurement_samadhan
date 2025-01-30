package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.GestureUtility;
import io.appium.java_client.android.AndroidDriver;

public class ccSlotBookingScreen {

	AndroidDriver driver;
	GestureUtility gutil= new GestureUtility(driver);
	public ccSlotBookingScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
			
	@FindBy(xpath = "//android.widget.TextView[@resource-id='button-text']")
	private WebElement bookAslotbtn;
	
	public WebElement getbookAslotbtn() {
		return bookAslotbtn;
	}
	
	public void slotbook(WebElement bookAslotbtn) {
	    gutil.click(bookAslotbtn);
	}
}
