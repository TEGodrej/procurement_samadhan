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

	@FindBy(xpath = "//android.widget.TextView[@text='Personal Info']")
	private WebElement personalInfo;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Bank Details']")
	private WebElement bankDetail;
	
	@FindBy(xpath = "//android.widget.TextView[@text='RFID Card Details']")
	private WebElement RFIDdetail;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Family Group Mapping']")
	private WebElement familyGroupMap;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement profilepicIcon;
	
	@FindBy(xpath = "//android.widget.TextView[@text='1123041331']")
	private WebElement farmerCode;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='0, Bank Details']")
	private WebElement bankTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='52369874123']")
	private WebElement accountNumber;
	
	@FindBy(xpath = "//android.widget.TextView[@text='456457676']")
	private WebElement cardNumber;
	
	public WebElement getFarmerCode() {
		return farmerCode;
	}

	public WebElement getBankTab() {
		return bankTab;
	}

	public WebElement getAccountNumber() {
		return accountNumber;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getprofilepicIcon() {
		return profilepicIcon;
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
	
	
	
}
