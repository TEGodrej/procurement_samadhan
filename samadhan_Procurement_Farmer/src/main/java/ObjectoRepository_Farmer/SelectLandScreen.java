package ObjectoRepository_Farmer;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.android.AndroidDriver;

public class SelectLandScreen extends BaseClass_Farmer{
	AndroidDriver driver;
	public SelectLandScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc='CC Slot Booking, back']/android.widget.ImageView")
	private WebElement backArrowbutton;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Andhra Pradesh & Telangana']")
	private WebElement SelectStateDropDown;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='0, LandIDLMAAS01070004, HATHYADKA, Assam, Maharashtra']/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement maharashtra;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"0, LandID12345718, HATHYADKA, West Godavari(AP), Andhra Pradesh & Telangana\"]")
	private WebElement landId;
	
	@FindBy(xpath = "//android.widget.EditText")
	private WebElement kgTextField;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='button-text']")
	private WebElement nextButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Please Select land.']")
	private WebElement LandErrorMessage;
	
	public WebElement getbackArrowbutton() {
		return backArrowbutton;
	}
	
	public WebElement getselectStateDropdown() {
		return SelectStateDropDown;
	}
	
	public WebElement getmaharashtra() {
		return maharashtra;
	}
	
	public WebElement getlandId() {
		return landId;
	}
	
	public WebElement getkgtextfield() {
		return kgTextField;
	}
	
	public WebElement getnextButton() {
		return nextButton;
	}
	
	public void clickOnLandId() {
		try {
			gestureUtility.click(landId);
		}catch(Exception e) {
			System.out.println("Not able to click on land id");
		}
	}
	public void sendKeyToKgTextField(String keys) {
		try {
			kgTextField.sendKeys(keys);
		}catch (Exception e) {
			System.out.println("Not able to send keys in kg Text Field");
		}
	}
	public void clickOnNextButton() {
		try {
			gestureUtility.click(nextButton);
		}catch(Exception e) {
			System.out.println("Not able to click on next button");
		}
	}
	
	public void verifyLandErrorMessage() {
		try {
			assertTrue(LandErrorMessage.isDisplayed());
		}catch(Exception e) {
			System.out.println(LandErrorMessage +" did not displayed");
		}
	}

}
