package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 *@author DivyaPrakashAmar
 */
public class ProfilePictureScreen {
	
	AndroidDriver driver;
	public ProfilePictureScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\" and @text=\"Gallery\"]")
	private WebElement galleryTab;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\" and @text=\"Camera\"]")
	private WebElement cameraTab;
	
	@FindBy(xpath = "//com.horcrux.svg.PathView")
	private WebElement cancelButton;

	/**
	 *This method is use to click on camera Tab
	 */
	public void clickOnCameraTab() {
		try {
			cameraTab.click();
		}catch (Exception e) {
			System.out.println("Not able to click on camera");
		}
	}
	
}
