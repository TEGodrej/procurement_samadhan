package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.GestureUtility;
import io.appium.java_client.android.AndroidDriver;

public class SelectCcScreen {
	AndroidDriver driver;
	GestureUtility gutil= new GestureUtility(driver);
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
	
	
	
	
	public GestureUtility getGutil() {
		return gutil;
	}




	public WebElement getFirstCenter() {
		return firstCenter;
	}




	public WebElement getSecondCenter() {
		return secondCenter;
	}




	public WebElement getBookaSlotbutton() {
		return bookaSlotbutton;
	}




	public void clickOnElement(WebElement ele) {
		gutil.click(ele);
	}
	
}
