package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class enquiriesScreen {
	
	AndroidDriver driver;
	public enquiriesScreen(AndroidDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Open Enquiries\"]")
	private WebElement openEnquiryButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Closed Enquiries\"]")
	private WebElement closeEnquiryButton;
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"fab-content\"]")
	private WebElement plusButton;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup/com.horcrux.svg.SvgView")
	private WebElement filterButton;

	public WebElement getOpenEnquiryButton() {
		return openEnquiryButton;
	}

	public WebElement getCloseEnquiryButton() {
		return closeEnquiryButton;
	}

	public WebElement getPluseButton() {
		return plusButton;
	}

	public WebElement getFilterButton() {
		return filterButton;
	}
	
	
}
