package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class loginScreen {

	AndroidDriver driver;
	public loginScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter Mobile Number\"]")
	private WebElement mobTxtFld;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\"]")
	private WebElement nextBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\"]")
	private WebElement loginBtn;
	
	public WebElement getMobTxtFld() {
		return mobTxtFld;
	}
	
	public WebElement getnextBtn() {
		return nextBtn;
	}

	
}
