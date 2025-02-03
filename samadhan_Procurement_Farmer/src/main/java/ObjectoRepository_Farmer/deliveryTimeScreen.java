package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class deliveryTimeScreen {
	AndroidDriver driver;
	public deliveryTimeScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"7:30 AM - 8:30 AM \"]")
	private WebElement timeSlot;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
	private WebElement confirmButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement backArrow;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Ok\"]")
	private WebElement okButton;

	public WebElement getTimeSlot() {
		return timeSlot;
	}

	public WebElement getconfirmButton() {
		return confirmButton;
	}

	public WebElement getcancelButton() {
		return cancelButton;
	}

	public WebElement getbackArrow() {
		return backArrow;
	}
	
	public WebElement getokButton() {
		return okButton;
	}
	
	
}
