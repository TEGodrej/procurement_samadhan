package ObjectoRepository_Farmer;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass_Farmer;
import io.appium.java_client.android.AndroidDriver;

/**
 *@author DivyaPrakashAmar
 */
public class HomeScreen extends BaseClass_Farmer{
	AndroidDriver driver;
	public HomeScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/com.horcrux.svg.SvgView")
	private WebElement hamburgerTab;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View")
	private WebElement weatherTab;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.View")
	private WebElement amateurTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Amateur\"]")
	private WebElement amatureText;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.View")
	private WebElement ffbPrice;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Home']")
	private WebElement homeButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Crop Status']")
	private WebElement cropStatusButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Community']")
	private WebElement communityButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Payments']")
	private WebElement paymentButton;

	/**
	 *This method is use to perform click action on hamburgerTab
	 */
	public void clickOnhamburgerTab() {
		try {
//		gestureUtility.click(hamburgerTab);
			hamburgerTab.click();
			System.out.println("Clicked on hamburger Tab");
		}catch (Exception e) {
			System.out.println(hamburgerTab.isDisplayed() +"==> hamburgerTab is not clicked");
		}
	}
	
	/**
	 *This method is use to perform scroll action using text reference
	 */
	public void scrollToElement(String text) {
		gestureUtility.scrollIntoView(text);
	}
	
	/**
	 *This method is use to verify AmatureText
	 */
	public void verifyAmatureText() {
		try {
			assertTrue(amatureText.isDisplayed());
		}catch (Exception e) {
			System.out.println("Amature Text is not displayed");
		}
	}
	
	/**
	 *This method is use to verify FfbPrice
	 */
	public void verifyFfbPrice() {
		try {
			assertTrue(ffbPrice.isDisplayed());
		}catch (Exception e) {
			System.out.println("ffb Price is not displayed");
		}
	}
	
}
