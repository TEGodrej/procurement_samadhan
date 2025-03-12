package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginScreen {

	AndroidDriver driver;
	public LoginScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter Mobile Number\"]")
	private WebElement mobileTextField;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\"]")
	private WebElement nextButton;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\"]")
	private WebElement loginButton;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Enter OTP, We have sent an OTP to your registered mobile number XXXXX9690., Please enter the OTP below., Time Up!, 4-digit OTP has been sent to your mobile number.\"]/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement firstTextBox;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Enter OTP, We have sent an OTP to your registered mobile number XXXXX9690., Please enter the OTP below., Time Up!, 4-digit OTP has been sent to your mobile number.\"]/android.view.ViewGroup/android.widget.EditText[2]")
	private WebElement secondTextBox;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Enter OTP, We have sent an OTP to your registered mobile number XXXXX9690., Please enter the OTP below., Time Up!, 4-digit OTP has been sent to your mobile number.\"]/android.view.ViewGroup/android.widget.EditText[3]")
	private WebElement thirdTextBox;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Enter OTP, We have sent an OTP to your registered mobile number XXXXX9690., Please enter the OTP below., Time Up!, 4-digit OTP has been sent to your mobile number.\"]/android.view.ViewGroup/android.widget.EditText[4]")
	private WebElement forthTextBox;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\"]")
	private WebElement verifyOtpButton;
	
	public void sendkeyToMobileTextField(String key) {
		try {
			mobileTextField.sendKeys(key);
		}catch (Exception e) {
			System.out.println("Not able to sendkey to mobileTextField");
		}
	}
	
	public void clickOnNextButton() {
		try {
			nextButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on nextButton");
		}
	}
	
	public void sendkeyToFirstTextBox(String key) {
		try {
			firstTextBox.sendKeys(key);
		}catch (Exception e) {
			System.out.println("Not able to sendkey in firstTextBox");
		}
	}
	
	public void sendkeyToSecondTextBox(String key) {
		try {
			secondTextBox.sendKeys(key);
		}catch (Exception e) {
			System.out.println("Not able to sendkey in secondTextBox");
		}
	}
	
	public void sendkeyToThirdTextBox(String key) {
		try {
			thirdTextBox.sendKeys(key);
		}catch (Exception e) {
			System.out.println("Not able to sendkey in thirdTextBox");
		}
	}
	
	public void sendkeyToForthTextBox(String key) {
		try {
			forthTextBox.sendKeys(key);
		}catch (Exception e) {
			System.out.println("Not able to sendkey in forthTextBox");
		}
	}
	
	public void clickOnVerifyOtpButton() {
		try {
			verifyOtpButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click On verify OTP Button");
		}
	}

	
}
