package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.GestureUtility;
import io.appium.java_client.android.AndroidDriver;

public class selectCcPage {
	AndroidDriver driver;
	GestureUtility gutil= new GestureUtility(driver);
	public selectCcPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"GAVL Office Shamal\"]")
	private WebElement firstCenter;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"GAVL Divyaprakash Shamal\"]")
	private WebElement secondCenter;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Book a Slot']")
	private WebElement bookaSlotbtn;
	
	
	public WebElement getfirstCenter() {
		return firstCenter;
	}
	
	public WebElement getsecondCenter() {
		return secondCenter;
	}
	
	public WebElement getbookaSlotbtn() {
		return bookaSlotbtn;
	}
	
	public void clickOnElement(WebElement ele) {
		gutil.click(ele);
	}
	
}
