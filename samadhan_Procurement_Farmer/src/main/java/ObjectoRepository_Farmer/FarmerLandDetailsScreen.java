package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class FarmerLandDetailsScreen {
	
	AndroidDriver driver;
	public FarmerLandDetailsScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement backArrowBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"LAND ID: 12345718\"]")
	private WebElement firstlandinfo;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"LAND ID: 12345785\"]")
	private WebElement secondlandinfo;
	
	public WebElement getbackArrowBtn() {
		return backArrowBtn;
	}
	
	public WebElement getfirstlandinfo() {
		return firstlandinfo;
	}
	
	public WebElement getsecondlandinfo() {
		return secondlandinfo;
	}
	
}
