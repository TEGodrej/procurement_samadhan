package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HomeScreen {
	AndroidDriver driver;
	public HomeScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/com.horcrux.svg.SvgView")
	private WebElement HambergerTab;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View")
	private WebElement weatherTab;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.View")
	private WebElement AmatureTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Amateur\"]")
	private WebElement AmatureText;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.View")
	private WebElement FFBprice;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Home']")
	private WebElement HomeButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Crop Status']")
	private WebElement CropStatusbtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Community']")
	private WebElement communitybtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Payments']")
	private WebElement paymentbtn;

	public WebElement getHambergerTab() {
		return HambergerTab;
	}

	public WebElement getWeatherTab() {
		return weatherTab;
	}

	public WebElement getAmatureTab() {
		return AmatureTab;
	}
	
	public WebElement getAmatureText() {
		return AmatureText;
	}

	public WebElement getFFBprice() {
		return FFBprice;
	}

	public WebElement getHomeButton() {
		return HomeButton;
	}

	public WebElement getCropStatusbtn() {
		return CropStatusbtn;
	}

	public WebElement getCommunitybtn() {
		return communitybtn;
	}

	public WebElement getPaymentbtn() {
		return paymentbtn;
	}
	
	
}
