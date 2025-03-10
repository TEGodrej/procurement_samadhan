package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.android.AndroidDriver;

public class MyProfileScreen extends BaseClass_Farmer{
	AndroidDriver driver;
	
	public MyProfileScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Personal Info\"]")
	private WebElement personalInfo;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Bank Details\"]")
	private WebElement bankDetail;
	
	@FindBy(xpath = "//android.widget.TextView[@text='RFID Card Details']")
	private WebElement RfidCardDetails;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Family Group Mapping\"]")
	private WebElement familyGroupMap;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement profilePictureIcon;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"26516919\"]")
	private WebElement rfidCardNumber;
	
	
	

	
	
	public void clickOnRFIDDetail() {
		try {
			gestureUtility.swipeLeftUsingElement(bankDetail);
			driverUtility.threadWait(4);
			RfidCardDetails.click();
		}catch (Exception e) {
			System.out.println("Not able to click on RFID detail");
		}
	}
	public void verifyRfidCardNumber() {
		try {
			rfidCardNumber.click();
		}catch (Exception e) {
			System.out.println("rfid CardNumber is not displayed");
		}
	}
	public void clickOnProfilePictureIcon() {
		try {
			profilePictureIcon.click();
		}catch (Exception e) {
			System.out.println("Not able to click on profile Picture Icon");
		}
	}
}
