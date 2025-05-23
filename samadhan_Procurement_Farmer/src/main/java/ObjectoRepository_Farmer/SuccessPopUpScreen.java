package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SuccessPopUpScreen {
	AndroidDriver driver;
	public SuccessPopUpScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\"]")
	private WebElement okButton;
	
	@FindBy(xpath = "//com.horcrux.svg.PathView")
	private WebElement crossButton;
	
	public WebElement getokButton() {
		return okButton;
	}
	
	public WebElement getcrossButton() {
		return crossButton;
	}
	
}
