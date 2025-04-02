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
public class HamburgerTabScreen extends BaseClass_Farmer{
	
	AndroidDriver driver;
	public HamburgerTabScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Divya Prakash Amar\"]")
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
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"9252051234\"]")
	private WebElement farmerCode;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='0, Bank Details']")
	private WebElement bankDetails;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"TEST ICICI BANK\"]")
	private WebElement bankName;

	/**
	 *This method is use to perform click action on CCSlot Tab
	 */
	public void clickOnCcSlotTab() {
		try {
//			gestureUtility.click(ccSlotTab);
			ccSlotTab.click();
			System.out.println("Clicked on CC Slot Tab");
		}catch (Exception e) {
			System.out.println("Not able to click on cc Slot Tab");
		}
	}
	
	/**
	 *This method is use to perform click action on FFBHarvest Tab
	 */
	public void clickOnFfbHarvestTab() {
		try {
			ffbHarvestTab.click();
		}catch (Exception e) {
			System.out.println("Not able to click on ffb Harvest Tab");
		}
	}
	
	/**
	 *This method is use to perform click action on MyLand Tab
	 */
	public void clickOnMyLandTab() {
		try {
			myLandTab.click();
		}catch (Exception e) {
			System.out.println("Not able to click on myLand Tab");
		}
	}
	
	/**
	 *This method is use to perform click action on Profile
	 */
	public void clickOnProfile() {
		try {
			profile.click();
		}catch (Exception e) {
			System.out.println("Not able to click on profile");
		}
	}
	
	/**
	 *This method is use to verify FarmerCode
	 */
	public void verifyFarmerCode() {
		try {
			assertTrue(farmerCode.isDisplayed());
		}catch (Exception e) {
			System.out.println("farmerCode is not displayed");
		}
	}
	
	/**
	 *This method is use to perform click action on BankDetails
	 */
	public void clickOnBankDetails() {
		try {
			bankDetails.click();
		}catch (Exception e) {
			System.out.println("Not able to click on bank Details");
		}
	}
	
	/**
	 *This method is use to verify BankName
	 */
	public void verifyBankName() {
		try {
			assertTrue(bankName.isDisplayed());
		}catch (Exception e) {
			System.out.println("account Number is not displayed");
		}
	
	}
	
	
}
