package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.android.AndroidDriver;

public class HamburgerTabScreen extends BaseClass_Farmer{
	
	AndroidDriver driver;
	public HamburgerTabScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='NANDAMURI GANESH']")
	private WebElement profile;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Home']")
	private WebElement Hometab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='My Land Details']")
	private WebElement myLandTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='FFB Harvesting']")
	private WebElement ffbHarvestTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='CC Slot Booking']")
	private WebElement ccSlotTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Sapling Slots']")
	private WebElement saplingSlotTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Oil Palm Library']")
	private WebElement oilPalmTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Refer Another You']")
	private WebElement referAnotherTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Enquiries/Contact us']")
	private WebElement enquiriesTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Reports']")
	private WebElement reportsTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Terms & Conditions']")
	private WebElement termsAndConditionTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Privacy Policy']")
	private WebElement privacyPolicyTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='About us']")
	private WebElement aboutUsTab;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]"
			+ "/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup"
			+ "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"
			+ "/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"
			+ "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"
			+ "/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup"
			+ "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"
			+ "/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]")
	private WebElement darkModeButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Logout']")
	private WebElement logoutButton;

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getHometab() {
		return Hometab;
	}

	public WebElement getmyLandTab() {
		return myLandTab;
	}

	public WebElement getffbHarvestTab() {
		return ffbHarvestTab;
	}

	public WebElement getccSlotTab() {
		return ccSlotTab;
	}

	public WebElement getsaplingSlotTab() {
		return saplingSlotTab;
	}

	public WebElement getoilPalmTab() {
		return oilPalmTab;
	}

	public WebElement getreferAnotherTab() {
		return referAnotherTab;
	}

	public WebElement getenquiriesTab() {
		return enquiriesTab;
	}

	public WebElement getreportsTab() {
		return reportsTab;
	}

	public WebElement gettermsAndConditionTab() {
		return termsAndConditionTab;
	}

	public WebElement getprivacyPolicyTab() {
		return privacyPolicyTab;
	}

	public WebElement getaboutUsTab() {
		return aboutUsTab;
	}

	public WebElement getdarkModeButton() {
		return darkModeButton;
	}

	public WebElement getlogoutButton() {
		return logoutButton;
	}
	
	public void clickOnElement(WebElement element) {
		gestureUtility.click(element);
	}
	
}
