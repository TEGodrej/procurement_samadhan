package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class EnquiriesPage {
	
	AndroidDriver driver;
	public EnquiriesPage(AndroidDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Open Enquiries\"]")
	private WebElement openEnquiryBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Closed Enquiries\"]")
	private WebElement closeEnquiryBtn;
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"fab-content\"]")
	private WebElement pluseBtn;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup/com.horcrux.svg.SvgView")
	private WebElement filterBtn;

	public WebElement getOpenEnquiryBtn() {
		return openEnquiryBtn;
	}

	public WebElement getCloseEnquiryBtn() {
		return closeEnquiryBtn;
	}

	public WebElement getPluseBtn() {
		return pluseBtn;
	}

	public WebElement getFilterBtn() {
		return filterBtn;
	}
	
	
}
