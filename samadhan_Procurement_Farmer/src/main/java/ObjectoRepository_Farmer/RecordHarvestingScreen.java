package ObjectoRepository_Farmer;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

/**
 *@author DivyaPrakashAmar
 */
public class RecordHarvestingScreen extends BaseClass_Farmer{
	AndroidDriver driver;
	public RecordHarvestingScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement backArrow;
	
	@FindBy(xpath = "//android.widget.RadioButton/android.view.ViewGroup")
	private WebElement selfHarvestRadioButton;
	
	@FindBy(xpath = "//android.widget.EditText[@text='YYYY-MM-DD']")
	private WebElement dateTextFeild;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
	private WebElement ffbCountTextFeild;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Capture Image']")
	private WebElement captureImageTab;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
	private WebElement submitButton;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Okay\"]")
	private WebElement okayButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Select harvesting date.']")
	private WebElement dateErrorMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Enter FFB count.']")
	private WebElement ffbErrorMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Please upload file.']")
	private WebElement fileErrorMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Select harvesting date.']")
	private WebElement warningMessage;
	
	/**
	 *This method is use to click on date
	 */
	
	public void date() {
		String Date=excelutility.readDataFromExcel("TestData", 1, 1);
		WebElement date1 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='"+Date+"']"));
		date1.click();
	}
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='card']/android.view.ViewGroup'")
	private WebElement harvest;
	
	/**
	 *This method is use to verifyHarvestId
	 */
	String id="589";
	public void verifyHarvestId() {
		try {
			WebElement harvestId = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='"+id+"']"));
			assertTrue(harvestId.isDisplayed());
		}catch (Exception e) {
			System.out.println("harvestId is not displayed");
		}
	}
	
	/**
	 *This method is use to click On Date TextFeild
	 */
	public void clickOnDateTextFeild() {
		try {
			dateTextFeild.click();
		}catch (Exception e) {
			System.out.println("Not able to click on date Text Feild ");
		}
	}
	
	/**
	 *This method is use to click On SaveButton
	 */
	public void clickOnSaveButton() {
		try {
			saveButton.click();
		}catch (Exception e) {
			System.out.println("not able to click on save Button");
		}
	}
	
	/**
	 *This method is use to sendkey To FFBCount TextFeild
	 *@param key, takes key as parameter
	 */
	public void sendkeyToFfbCountTextFeild(String key) {
		try {
			ffbCountTextFeild.sendKeys(key);
		}catch (Exception e) {
			System.out.println("Not able to enter value in ffbCount TextFeild");
		}
	}
	
	/**
	 *This method is use to click On CaptureImage Tab
	 */
	public void clickOnCaptureImageTab() {
		try {
			captureImageTab.click();
		}catch (Exception e) {
			System.out.println("Not able to click on capture image tab");
		}
	}
	
	/**
	 *This method is use to click On SubmitButton
	 */
	public void clickOnSubmitButton() {
		try {
			submitButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on submit Button");
		}
	}
	
	/**
	 *This method is use to click On OkayButton
	 */
	public void clickOnOkayButton() {
		try {
			okayButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on okay Button");
		}
	}
	
	/**
	 *This method is use to verify Date ErrorMessage
	 */
	public void verifyDateErrorMessage() {
		try {
			assertTrue(dateErrorMessage.isDisplayed());
		}catch (Exception e) {
			System.out.println("date Error Message is not displayed");
		}
	}
	
	/**
	 *This method is use to verify FFB ErrorMessage
	 */
	public void verifyFfbErrorMessage() {
		try {
			assertTrue(ffbErrorMessage.isDisplayed());
		}catch (Exception e) {
			System.out.println("ffbErrorMessage is not displayed");
		}
	}
	
	/**
	 *This method is use to verify File ErrorMessage
	 */
	public void verifyFileErrorMessage() {
		try {
			assertTrue(fileErrorMessage.isDisplayed());
		}catch (Exception e) {
			System.out.println("file Error Message is not displayed");
		}
	}
	
	/**
	 *This method is use to verify Warning Message
	 */
	public void verifyWarningMessage() {
		try {
			assertTrue(warningMessage.isDisplayed());
		}catch (Exception e) {
			System.out.println("warning message is not displayed");
		}
	}
	
	/**
	 *This method is use to Click On Harvest
	 */
	public void ClickOnHarvest() {
		try {
			harvest.click();
		}catch (Exception e) {
			System.out.println("Not able to click on harvest Id");
		}
	}
}
