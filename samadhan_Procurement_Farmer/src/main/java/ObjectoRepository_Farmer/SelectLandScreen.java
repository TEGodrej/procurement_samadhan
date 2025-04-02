package ObjectoRepository_Farmer;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.android.AndroidDriver;

/**
 *@author DivyaPrakashAmar
 */
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
	
	@FindBy(xpath = "//android.widget.TextView[@text='LandIDa03H4000002Hhae']")
	private WebElement landId;
	
	@FindBy(xpath = "//android.widget.EditText")
	private WebElement kgTextField;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='button-text']")
	private WebElement nextButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Please Select land.']")
	private WebElement LandErrorMessage;
	
	
	/**
	 *This method is use to click on LandId
	 */
	public void clickOnLandId() {
		try {
//			gestureUtility.click(landId);
			landId.click();
			System.out.println("Clicked on landID");
		}catch(Exception e) {
			System.out.println("Not able to click on land id");
		}
	}
	
	/**
	 *This method is use to sendKey To KgTextField
	 *@param keys, takes string as a parameter
	 */
	public void sendKeyToKgTextField(String keys) {
		try {
			kgTextField.sendKeys(keys);
		}catch (Exception e) {
			System.out.println("Not able to send keys in kg Text Field");
		}
	}
	
	/**
	 *This method is use to click On NextButton
	 */
	public void clickOnNextButton() {
		try {
//			gestureUtility.click(nextButton);
			nextButton.click();
			System.out.println("Clicked on next button");
		}catch(Exception e) {
			System.out.println("Not able to click on next button");
		}
	}
	
	/**
	 *This method is use to verify LandErrorMessage
	 */
	public void verifyLandErrorMessage() {
		try {
			if(LandErrorMessage.isDisplayed()){
				assertTrue(true);
			}else if (!LandErrorMessage.isDisplayed()) {
				assertTrue(false);
			}
//			assertTrue(LandErrorMessage.isDisplayed());
		}catch(Exception e) {
			System.out.println(LandErrorMessage +" did not displayed");
		}
	}

}
