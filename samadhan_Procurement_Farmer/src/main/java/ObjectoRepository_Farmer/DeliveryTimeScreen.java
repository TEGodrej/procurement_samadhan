package ObjectoRepository_Farmer;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.android.AndroidDriver;

public class DeliveryTimeScreen extends BaseClass_Farmer{
	AndroidDriver driver;
	public DeliveryTimeScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"7:30 AM - 8:30 AM \"]")
	private WebElement timeSlot;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
	private WebElement confirmButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement backArrow;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Ok\"]")
	private WebElement okButton;
	
	@FindBy(xpath = "(//android.widget.TextView[@text='Upcoming Slot!'])[1]")
	private WebElement ActualMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Please select slot.']")
	private WebElement timeSlotErrorMessage;

	public WebElement getTimeSlot() {
		return timeSlot;
	}

	public WebElement getconfirmButton() {
		return confirmButton;
	}

	public WebElement getcancelButton() {
		return cancelButton;
	}

	public WebElement getbackArrow() {
		return backArrow;
	}
	
	public WebElement getokButton() {
		return okButton;
	}
	
	public void selectTime(WebElement element) {
		gestureUtility.click(element);
	}
	
	public void clickOnElement(WebElement element) {
		gestureUtility.click(element);
	}
	
	public void scrollToTimeSlot(String time) {
		try {
			gestureUtility.scrollIntoView(time);
		}catch(Exception e) {
			System.out.println("Not able to scroll to time slot");
		}
	}
	
	public void clickOnTimeSlot() {
		try {
			gestureUtility.click(timeSlot);
		}catch(Exception e) {
			System.out.println("Not able to click on time slot");
		}
	}
	
	public void clickOnConfirmButton() {
		try {
			gestureUtility.click(confirmButton);
		}catch (Exception e) {
			System.out.println("Not able to click on confirm Button");
		}
	}
	
	public void clickOnOkButton() {
		try {
			gestureUtility.click(okButton);
		}catch (Exception e) {
			System.out.println("Not able to click On ok button");
		}
	}
	
	public void verifyMessage() {
		try {
			assertTrue(ActualMessage.isDisplayed());
		}catch (Exception e) {
			System.out.println("Actual message is not displayed");
		}
	}
	public void verifyTimeSlotErrorMessage() {
		try {
			assertTrue(timeSlotErrorMessage.isDisplayed());
		}catch (Exception e) {
			System.out.println(timeSlotErrorMessage+" is not displayed");
		}
	}
}
