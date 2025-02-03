package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class profilePictureScreen {
	
	AndroidDriver driver;
	public profilePictureScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\" and @text=\"Gallery\"]")
	private WebElement galleryTab;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\" and @text=\"Camera\"]")
	private WebElement cameraTab;
	
	@FindBy(xpath = "//com.horcrux.svg.PathView")
	private WebElement cancelButton;

	public WebElement getGalleryTab() {
		return galleryTab;
	}

	public WebElement getCameraTab() {
		return cameraTab;
	}

	public WebElement getCancelBtn() {
		return cancelButton;
	}
	
	
}
