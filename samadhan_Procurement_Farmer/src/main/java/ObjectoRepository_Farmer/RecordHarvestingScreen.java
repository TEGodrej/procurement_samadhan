package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class RecordHarvestingScreen {
	AndroidDriver driver;
	public RecordHarvestingScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement backArrow;
	
	@FindBy(xpath = "//android.widget.RadioButton/android.view.ViewGroup")
	private WebElement selfHarvestRadioBtn;
	
	@FindBy(xpath = "//android.widget.EditText[@text='YYYY-MM-DD']")
	private WebElement dateTextFeild;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
	private WebElement FFBcountTextfeild;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Capture Image']")
	private WebElement captureimagetab;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
	private WebElement submitBtn;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Okay\"]")
	private WebElement okayBtn;
	
//	@FindBys({@FindBy(xpath = "//android.widget.TextView[@text='Submit']"),@FindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")})
//	private WebElement submitBtn;
	
	public WebElement getbackarrow() {
		return backArrow;
	}
	
	public WebElement getselfharvestradiobtn() {
		return selfHarvestRadioBtn;
	}
	
	public WebElement getdateTextFeild() {
		return dateTextFeild;
	}
	
	public WebElement getFFBcountTextfeild() {
		return FFBcountTextfeild;
	}
	
	public WebElement getcaptureimageTab() {
		return captureimagetab;
	}
	
	public WebElement getsaveBtn() {
		return saveBtn;
	}
	public WebElement getsubmitBtn() {
		return submitBtn;
	}
	
	public WebElement getokayBtn() {
		return okayBtn;
	}
}
