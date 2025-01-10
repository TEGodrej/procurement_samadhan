package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class successpopupPage {
	AndroidDriver driver;
	public successpopupPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\"]")
	private WebElement okbtn;
	
	@FindBy(xpath = "//com.horcrux.svg.PathView")
	private WebElement crossbtn;
	
	public WebElement getokbtn() {
		return okbtn;
	}
	
	public WebElement getcrossbtn() {
		return crossbtn;
	}
	
}
