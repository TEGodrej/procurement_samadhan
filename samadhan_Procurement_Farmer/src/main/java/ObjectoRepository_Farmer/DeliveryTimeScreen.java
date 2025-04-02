package ObjectoRepository_Farmer;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

/**
 *@author DivyaPrakashAmar
 */
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
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='APR']")
	private WebElement month;

	public void clickOnTimeSlot() {//android.view.ViewGroup[@content-desc="5:00 PM - 6:00 PM , Available - 4500 kg"]
		String slot="5:00 PM - 6:00 PM , Available - 4500 kg";
		WebElement timeslot = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='"+slot+"']"));
		timeslot.click();
	}
	
	/**
	 *This method is use to scroll the time screen
	 */
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
	
	/**
	 *This method is use to perfrom click action on ConfirmButton
	 */
	public void clickOnConfirmButton() {
		try {
//			gestureUtility.click(confirmButton);
			confirmButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on confirm Button");
		}
	}
	
	/**
	 *This method is use to perfrom click action on OkButton
	 */
	public void clickOnOkButton() {
		try {
//			gestureUtility.click(okButton);
			okButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click On ok button");
		}
	}
	
	/**
	 *This method is use to verifyMessage
	 */
	public void verifyMessage() {
		try {
			assertTrue(ActualMessage.isDisplayed());
		}catch (Exception e) {
			System.out.println("Actual message is not displayed");
		}
	}
	
	/**
	 *This method is use to verify TimeSlot ErrorMessage
	 */
	public void verifyTimeSlotErrorMessage() {
		try {
			assertTrue(timeSlotErrorMessage.isDisplayed());
		}catch (Exception e) {
			System.out.println(timeSlotErrorMessage+" is not displayed");
		}
	}
	
	/**
	 *This method is use to perfrom click action on Month
	 */
	public void clickOnMonth() {
		try {
//			String Month = month.getText();
			month.click();
			System.out.println("Clicked on Month");
		}catch (Exception e) {
			System.out.println("not able to click on month");
		}
	}
}
