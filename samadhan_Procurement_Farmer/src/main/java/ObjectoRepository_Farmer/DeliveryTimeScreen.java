package ObjectoRepository_Farmer;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class DeliveryTimeScreen extends BaseClass_Farmer{
	AndroidDriver driver;
	public DeliveryTimeScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='12:30 PM - 1:30 PM ']")
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
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='MAR']/android.view.View")
	private WebElement month;

	public void clickOnTimeSlot() {//android.view.ViewGroup[@content-desc="5:00 PM - 6:00 PM , Available - 4500 kg"]
		String slot="5:00 PM - 6:00 PM , Available - 4500 kg";
		WebElement timeslot = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='"+slot+"']"));
		timeslot.click();
	}

//	public WebElement getconfirmButton() {
//		return confirmButton;
//	}
//
//	public WebElement getcancelButton() {
//		return cancelButton;
//	}
//
//	public WebElement getbackArrow() {
//		return backArrow;
//	}
//	
//	public WebElement getokButton() {
//		return okButton;
//	}
	
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
	
//	public void clickOnTimeSlot() {
//		try {
//			gestureUtility.click(timeSlot);
//			timeSlot.click();
//		}catch(Exception e) {
//			System.out.println("Not able to click on time slot");
//		}
//	}
	
	public void clickOnConfirmButton() {
		try {
//			gestureUtility.click(confirmButton);
			confirmButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on confirm Button");
		}
	}
	
	public void clickOnOkButton() {
		try {
//			gestureUtility.click(okButton);
			okButton.click();
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
	
	public void clickOnMonth() {
		try {
			month.click();
			System.out.println("clicked on" + month.getText());
		}catch (Exception e) {
//			System.out.println("not able to click on month");
		}
	}
}
