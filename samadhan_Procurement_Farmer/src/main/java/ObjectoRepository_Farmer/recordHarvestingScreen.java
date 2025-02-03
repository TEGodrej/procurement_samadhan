package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class recordHarvestingScreen {
	AndroidDriver driver;
	public recordHarvestingScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement backArrow;
	
	@FindBy(xpath = "//android.widget.RadioButton/android.view.ViewGroup")
	private WebElement selfHarvestRadioButton;
	
	@FindBy(xpath = "//android.widget.EditText[@text='YYYY-MM-DD']")
	private WebElement dateTextFeild;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
	private WebElement ffbCountTextFeild;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Capture Image']")
	private WebElement captureImageTab;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
	private WebElement submitButton;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Okay\"]")
	private WebElement okayButton;
	
//	@FindBys({@FindBy(xpath = "//android.widget.TextView[@text='Submit']"),@FindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")})
//	private WebElement submitBtn;
	
	public WebElement getbackArrow() {
		return backArrow;
	}
	
	public WebElement getselfHarvestRadioButton() {
		return selfHarvestRadioButton;
	}
	
	public WebElement getdateTextFeild() {
		return dateTextFeild;
	}
	
	public WebElement getFFBcountTextfeild() {
		return ffbCountTextFeild;
	}
	
	public WebElement getcaptureimageTab() {
		return captureImageTab;
	}
	
	public WebElement getsaveBtn() {
		return saveButton;
	}
	public WebElement getsubmitBtn() {
		return submitButton;
	}
	
	public WebElement getokayBtn() {
		return okayButton;
	}
}
