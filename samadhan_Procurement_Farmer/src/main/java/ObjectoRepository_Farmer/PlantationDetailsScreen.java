package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PlantationDetailsScreen {
	AndroidDriver driver;
	public PlantationDetailsScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement backArrowButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"12345718\"]")
	private WebElement plantationId;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Record Harvesting']")
	private WebElement recordHarvestButton;
	
	public WebElement getbackarrowbtn() {
		return backArrowButton;
	}
	
	public WebElement getplantationId() {
		return plantationId;
	}
	
	public WebElement getrecordharvestbtn() {
		return recordHarvestButton;
	}
}
