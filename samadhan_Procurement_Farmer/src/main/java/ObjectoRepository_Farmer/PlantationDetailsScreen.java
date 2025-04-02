package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 *@author DivyaPrakashAmar
 */
public class PlantationDetailsScreen {
	AndroidDriver driver;
	public PlantationDetailsScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement backArrowButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"12345862\"]")
	private WebElement plantationId;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Record Harvesting']")
	private WebElement recordHarvestButton;
	
	
	/**
	 *This method is use to perform click action on PlantationID
	 */
	public void clickOnPlantationId() {
		try {
			plantationId.click();
		}catch (Exception e) {
			System.out.println("Not able to click on plantationId");
		}
	}
	
	/**
	 *This method is use to perform click action on RecordHarvest Button
	 */
	public void clickOnRecordHarvestButton() {
		try {
			recordHarvestButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on ");
		}
	}

	
}
