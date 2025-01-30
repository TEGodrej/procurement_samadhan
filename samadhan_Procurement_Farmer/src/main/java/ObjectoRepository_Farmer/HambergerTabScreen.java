package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HambergerTabScreen {
	
	AndroidDriver driver;
	public HambergerTabScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"NANDAMURI GANESH\"]")
	private WebElement profile;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home\"]")
	private WebElement Hometab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"My Land Details\"]")
	private WebElement Mylandtab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"FFB Harvesting\"]")
	private WebElement FFBharvesttab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"CC Slot Booking\"]")
	private WebElement CCslottab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Sapling Slots\"]")
	private WebElement Saplingslottab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Oil Palm Library\"]")
	private WebElement oilPalmtab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Refer Another You\"]")
	private WebElement ReferAnothertab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Enquiries/Contact us\"]")
	private WebElement Enquiriestab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Reports\"]")
	private WebElement reportstab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Terms & Conditions\"]")
	private WebElement termsandConditiontab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Privacy Policy\"]")
	private WebElement privacypolicytab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"About us\"]")
	private WebElement AboutusTab;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]"
			+ "/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup"
			+ "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"
			+ "/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"
			+ "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"
			+ "/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup"
			+ "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"
			+ "/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]")
	private WebElement Darkmodebtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Logout\"]")
	private WebElement logoutbtn;

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getHometab() {
		return Hometab;
	}

	public WebElement getMylandtab() {
		return Mylandtab;
	}

	public WebElement getFFBharvesttab() {
		return FFBharvesttab;
	}

	public WebElement getCCslottab() {
		return CCslottab;
	}

	public WebElement getSaplingslottab() {
		return Saplingslottab;
	}

	public WebElement getOilPalmtab() {
		return oilPalmtab;
	}

	public WebElement getReferAnothertab() {
		return ReferAnothertab;
	}

	public WebElement getEnquiriestab() {
		return Enquiriestab;
	}

	public WebElement getReportstab() {
		return reportstab;
	}

	public WebElement getTermsandConditiontab() {
		return termsandConditiontab;
	}

	public WebElement getPrivacypolicytab() {
		return privacypolicytab;
	}

	public WebElement getAboutusTab() {
		return AboutusTab;
	}

	public WebElement getDarkmodebtn() {
		return Darkmodebtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	
}
