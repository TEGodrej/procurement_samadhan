package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.android.AndroidDriver;

public class SelectCcScreen extends BaseClass_Farmer{
	AndroidDriver driver;
	public SelectCcScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"GAVL Office Shamal\"]")
	private WebElement firstCenter;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"GAVL Divyaprakash Shamal\"]")
	private WebElement secondCenter;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Book a Slot']")
	private WebElement bookaSlotbutton;
	

	public WebElement getFirstCenter() {
		return firstCenter;
	}

	public WebElement getSecondCenter() {
		return secondCenter;
	}

	public WebElement getBookaSlotbutton() {
		return bookaSlotbutton;
	}

	public void clickOnSecondCenter() {
		try {
		gestureUtility.click(secondCenter);
		}catch(Exception e) {
			System.out.println("Not able to click on second Center");
		}
	}
	
	public void clickOnBookASlotbutton() {
		try {
			gestureUtility.click(bookaSlotbutton);
		}catch(Exception e) {
			System.out.println("Not able to Click on book a slot button");
		}
	}
	
}
