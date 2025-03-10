package ObjectoRepository_Farmer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class MyLandDetailsScreen {
	AndroidDriver driver;
	public MyLandDetailsScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id=\"card-container\"])[1]")
	private WebElement firstLandId;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id=\"card-container\"])[2]")
	private WebElement secondLandId;
	
	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement backArrow;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"12345718\"]")
	private WebElement plantationId;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Record Harvesting']")
	private WebElement recordHarvesting;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement hambergerTab;

	public WebElement getFirstLandId() {
		return firstLandId;
	}

	public WebElement getSecondLandId() {
		return secondLandId;
	}

	public WebElement getBackArrow() {
		return backArrow;
	}

	public WebElement getPlantationId() {
		return plantationId;
	}

	public WebElement getRecordHarvesting() {
		return recordHarvesting;
	}
	
	public WebElement gethamberTab() {
		return hambergerTab;
	}
	
}
