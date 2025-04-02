package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.android.AndroidDriver;

/**
 *@author DivyaPrakashAmar
 */
public class SelectCcScreen extends BaseClass_Farmer{
	AndroidDriver driver;
	public SelectCcScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"GAVL Office Shamal\"]")
	private WebElement firstCenter;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"TADIKALAPUDI\"]")
	private WebElement secondCenter;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Book a Slot']")
	private WebElement bookaSlotbutton;
	
	/**
	 *This method is use to Click On SecondCenter
	 */
	public void clickOnSecondCenter() {
		try {
//		gestureUtility.click(secondCenter);
		secondCenter.click();
		}catch(Exception e) {
			System.out.println("Not able to click on second Center");
		}
	}
	
	/**
	 *This method is use to Click On BookASlot button
	 */
	public void clickOnBookASlotbutton() {
		try {
//			gestureUtility.click(bookaSlotbutton);
			bookaSlotbutton.click();
			System.out.println("Clicked on Book A Slot Button");
		}catch(Exception e) {
			System.out.println("Not able to Click on book a slot button");
		}
	}
	
}
