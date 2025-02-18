package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class MyProfileScreen {
	AndroidDriver driver;
	
	public MyProfileScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Personal Info\"]")
	private WebElement personalInfo;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Bank Details\"]")
	private WebElement bankDetail;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"RFID Card Details\"]")
	private WebElement RFIDdetail;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Family Group Mapping\"]")
	private WebElement familyGroupMap;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement profilePictureIcon;
	
	@FindBy(xpath = "//android.widget.TextView[@text='456457676']")
	private WebElement rfidCardNumber;
	
	public WebElement getprofilepicIcon() {
		return profilePictureIcon;
	}

	public WebElement getPersonalInfo() {
		return personalInfo;
	}

	public WebElement getBankDetail() {
		return bankDetail;
	}

	public WebElement getRFIDdetail() {
		return RFIDdetail;
	}

	public WebElement getFamilyGroupMap() {
		return familyGroupMap;
	}
	
	public void clickOnRFIDDetail() {
		try {
			RFIDdetail.click();
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
