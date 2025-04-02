package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.android.AndroidDriver;

/**
 *@author DivyaPrakashAmar
 */
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
	/**
	 * This method is use to click on BookSloButton
	 * */
	public void clickOnBookAslotbutton() {
		try {
//	    gestureUtility.click(bookAslotbutton);
	    bookAslotbutton.click();
	    System.out.println("Clicked on CC Slot Tab");
	}catch (Exception e) {
		System.out.println("Not able to click on CC Slot Tab");
	}
	
	}
}
