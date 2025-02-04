package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.android.AndroidDriver;

public class FarmerLandDetailsScreen extends BaseClass_Farmer{
	
	AndroidDriver driver;
	public FarmerLandDetailsScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement backArrowButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"LAND ID: 12345718\"]")
	private WebElement firstLandInfo;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"LAND ID: 12345785\"]")
	private WebElement secondLandInfo;
	
	public WebElement getbackArrowButton() {
		return backArrowButton;
	}
	
	public WebElement getfirstLandInfo() {
		return firstLandInfo;
	}
	
	public WebElement getssecondLandInfo() {
		return secondLandInfo;
	}
	
	public void clickOnElement(WebElement element) {
		gestureUtility.click(element);
	}
	
}
