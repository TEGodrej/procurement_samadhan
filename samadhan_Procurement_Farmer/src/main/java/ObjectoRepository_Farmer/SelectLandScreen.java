package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SelectLandScreen {
	AndroidDriver driver;
	public SelectLandScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc='CC Slot Booking, back']/android.widget.ImageView")
	private WebElement backArrowbutton;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Andhra Pradesh & Telangana']")
	private WebElement SelectStateDropDown;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='0, LandIDLMAAS01070004, HATHYADKA, Assam, Maharashtra']/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement maharashtra;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"0, LandID12345718, HATHYADKA, West Godavari(AP), Andhra Pradesh & Telangana\"]")
	private WebElement landId;
	
	@FindBy(xpath = "//android.widget.EditText")
	private WebElement kgtextfield;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='button-text']")
	private WebElement nextButton;
	
	public WebElement getbackArrowbutton() {
		return backArrowbutton;
	}
	
	public WebElement getselectStateDropdown() {
		return SelectStateDropDown;
	}
	
	public WebElement getmaharashtra() {
		return maharashtra;
	}
	
	public WebElement getlandId() {
		return landId;
	}
	
	public WebElement getkgtextfield() {
		return kgtextfield;
	}
	
	public WebElement getnextButton() {
		return nextButton;
	}
	

}
