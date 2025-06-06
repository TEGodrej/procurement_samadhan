package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 *@author DivyaPrakashAmar
 */
public class NewEnquiryScreen {
	AndroidDriver driver;
	public NewEnquiryScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//android.widget.TextView[@text=\"Land ID\"])[2]")
	private WebElement landIdTxtFld;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"12345718\"]")
	private WebElement firstLandId;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"12345785\"]")
	private WebElement secondLandId;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Plantation ID\"]")
	private WebElement plantationId;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"12345718\"])[2]")
	private WebElement firstPlantationId;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Field Visit\"]")
	private WebElement feildVisitTxtField;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Product Issue\"]")
	private WebElement productIssue;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Infra Structure Issue\"]")
	private WebElement infrastructureIssue;
	
	@FindBy(xpath = "//android.widget.EditText")
	private WebElement remarkTextField;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Capture Image, Open Camera & Take Photo\"])[1]")
	private WebElement firstCameraOption;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Capture Image, Open Camera & Take Photo\"])[2]")
	private WebElement secondCameraOption;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
	private WebElement submitButton;


	
	
	
}
