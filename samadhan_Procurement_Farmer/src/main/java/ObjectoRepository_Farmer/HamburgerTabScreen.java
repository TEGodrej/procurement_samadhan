package ObjectoRepository_Farmer;

import static org.testng.Assert.assertTrue;

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
	
	@FindBy(xpath = "//android.widget.TextView[@text='1123041331']")
	private WebElement farmerCode;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='0, Bank Details']")
	private WebElement bankDetails;
	
	@FindBy(xpath = "//android.widget.TextView[@text='52369874123']")
	private WebElement accountNumber;

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
	
	public void clickOnCcSlotTab() {
		try {
			gestureUtility.click(ccSlotTab);
		}catch (Exception e) {
			System.out.println("Not able to click on cc Slot Tab");
		}
	}
	
	public void clickOnFfbHarvestTab() {
		try {
			ffbHarvestTab.click();
		}catch (Exception e) {
			System.out.println("Not able to click on ffb Harvest Tab");
		}
	}
	
	public void clickOnMyLandTab() {
		try {
			myLandTab.click();
		}catch (Exception e) {
			System.out.println("Not able to click on myLand Tab");
		}
	}
	public void clickOnProfile() {
		try {
			profile.click();
		}catch (Exception e) {
			System.out.println("Not able to click on profile");
		}
	}
	
	public void verifyFarmerCode() {
		try {
			assertTrue(farmerCode.isDisplayed());
		}catch (Exception e) {
			System.out.println("farmerCode is not displayed");
		}
	}
	public void clickOnBankDetails() {
		try {
			bankDetails.click();
		}catch (Exception e) {
			System.out.println("Not able to click on bank Details");
		}
	}
	
	public void verifyAccountNumber() {
		try {
			assertTrue(accountNumber.isDisplayed());
		}catch (Exception e) {
			System.out.println("account Number is not displayed");
		}
	
	}
	
	
}
