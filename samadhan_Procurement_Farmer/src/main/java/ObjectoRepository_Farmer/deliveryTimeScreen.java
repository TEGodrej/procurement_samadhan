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
	private WebElement firsttimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"8:30 AM - 9:30 AM \"]")
	private WebElement secondtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"9:30 AM - 10:30 AM \"]")
	private WebElement thirdtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"10:30 AM - 11:30 AM \"]")
	private WebElement forthtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"11:30 AM - 12:30 PM \"]")
	private WebElement fifthtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"12:30 PM - 1:30 PM \"]")
	private WebElement sixthtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"1:30 PM - 2:30 PM \"]")
	private WebElement seventhtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"2:30 PM - 3:30 PM \"]")
	private WebElement eighttimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"3:30 PM - 4:30 PM \"]")
	private WebElement ninthtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"4:30 PM - 5:30 PM \"]")
	private WebElement tenthtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"5:30 PM - 6:30 PM \"]")
	private WebElement elenevthtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"6:30 PM - 7:30 PM \"]")
	private WebElement twelethtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"7:30 PM - 8:30 PM \"]")
	private WebElement thirteenthtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"8:30 PM - 9:30 PM \"]")
	private WebElement fourteenthtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"9:30 PM - 10:30 PM \"]")
	private WebElement fifteenthtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"10:30 PM - 11:30 PM \"]")
	private WebElement sixteenthtimeslot;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
	private WebElement confirmbtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Cancel']")
	private WebElement cancelbtn;
	
	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement backarrow;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Ok\"]")
	private WebElement okBtn;

	public WebElement getFirsttimeslot() {
		return firsttimeslot;
	}

	public WebElement getSecondtimeslot() {
		return secondtimeslot;
	}

	public WebElement getThirdtimeslot() {
		return thirdtimeslot;
	}

	public WebElement getForthtimeslot() {
		return forthtimeslot;
	}

	public WebElement getFifthtimeslot() {
		return fifthtimeslot;
	}

	public WebElement getSixthtimeslot() {
		return sixthtimeslot;
	}

	public WebElement getSeventhtimeslot() {
		return seventhtimeslot;
	}

	public WebElement getEighttimeslot() {
		return eighttimeslot;
	}

	public WebElement getNinthtimeslot() {
		return ninthtimeslot;
	}

	public WebElement getTenthtimeslot() {
		return tenthtimeslot;
	}

	public WebElement getElenevthtimeslot() {
		return elenevthtimeslot;
	}

	public WebElement getTwelethtimeslot() {
		return twelethtimeslot;
	}

	public WebElement getThirteenthtimeslot() {
		return thirteenthtimeslot;
	}

	public WebElement getFourteenthtimeslot() {
		return fourteenthtimeslot;
	}

	public WebElement getFifteenthtimeslot() {
		return fifteenthtimeslot;
	}

	public WebElement getSixteenthtimeslot() {
		return sixteenthtimeslot;
	}

	public WebElement getConfirmbtn() {
		return confirmbtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public WebElement getBackarrow() {
		return backarrow;
	}
	
	public WebElement getokBtn() {
		return okBtn;
	}
	
	
}
