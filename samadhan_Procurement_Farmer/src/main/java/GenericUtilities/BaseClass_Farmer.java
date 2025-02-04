package GenericUtilities;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import ObjectoRepository_Farmer.DeliveryTimeScreen;
import ObjectoRepository_Farmer.EnquiriesScreen;
import ObjectoRepository_Farmer.FFBsupplyScreen;
import ObjectoRepository_Farmer.FarmerLandDetailsScreen;
import ObjectoRepository_Farmer.HamburgerTabScreen;
import ObjectoRepository_Farmer.HomeScreen;
import ObjectoRepository_Farmer.LoginScreen;
import ObjectoRepository_Farmer.MyLandDetailsScreen;
import ObjectoRepository_Farmer.MyProfileScreen;
import ObjectoRepository_Farmer.RecordHarvestingScreen;
import ObjectoRepository_Farmer.CCslotBookingScreen;
import ObjectoRepository_Farmer.NewEnquiryScreen;
import ObjectoRepository_Farmer.PlantationDetailsScreen;
import ObjectoRepository_Farmer.ProfilePictureScreen;
import ObjectoRepository_Farmer.SelectCcScreen;
import ObjectoRepository_Farmer.SelectLandScreen;
import ObjectoRepository_Farmer.SuccessPopUpScreen;
import io.appium.java_client.android.AndroidDriver;

/*
 * @author Testing Engineer
 * This is the base class configured for launching application through appium server
 */
public class BaseClass_Farmer {
	public static AndroidDriver sdriver;
	AndroidDriver driver;

	public static HomeScreen homeScreen;
	public static HamburgerTabScreen hambergerTabScreen;
	public static MyLandDetailsScreen myLandDetailScreen;
	public static RecordHarvestingScreen recordHarvestScreen;
	public static DriverUtility driverUtility;
//	public FileUtility futil;
	public static GestureUtility gestureUtility;
	public static LoginScreen loginScreen;
	public static FFBsupplyScreen ffbSupplyScreen;
	public static FarmerLandDetailsScreen farmerLandDetailScreen;
	public static PlantationDetailsScreen plantationDetailScreen;
	public static CCslotBookingScreen slotBookingScreen;
	public static SelectLandScreen selectLandScreen;
	public static SuccessPopUpScreen successPopupScreen;
	public static SelectCcScreen selectCcScreen;
	public static DeliveryTimeScreen deliveryTimeScreen;
	public static MyProfileScreen myProfileScreen;
	public static EnquiriesScreen enquiryScreen;
	public static NewEnquiryScreen newEnquiryScreen;
	public static ProfilePictureScreen profilePictureScreen;

	

		@BeforeClass
		public void startApp() throws IOException {
		
//			String platformname=futil.getDataFromProperty("platformName");
//			String DeviceName=futil.getDataFromProperty("DeviceName");
//			String AutomationName=futil.getDataFromProperty("uiautomator2");
//			String udid=futil.getDataFromProperty("WKAQCYCQKROVDE4L");
//			String appactivty=futil.getDataFromProperty("appActivity");
//			String apppackage=futil.getDataFromProperty("appPackage");
			
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("platformName", "android");
			dc.setCapability("deviceName", "Redmi A2");
			dc.setCapability("automationName", "Uiautomator2");
			dc.setCapability("UDID", "WKAQCYCQKROVDE4L");
			dc.setCapability("noReset", true);
			
//			dc.setCapability("appActivity", "com.godrejsamadhanmobile.MainActivity");
//			dc.setCapability("appPackage", "com.gavl.oilpalm.samadhan");
			
			URL url= URI.create("http://localhost:4723").toURL();
			driver=new AndroidDriver(url, dc);
			sdriver=driver;
			
			driver.activateApp("com.gavl.oilpalm.samadhan");
//			dutil.implicitWait(10);
			homeScreen= new HomeScreen(driver);
			hambergerTabScreen=new HamburgerTabScreen(driver);
			myLandDetailScreen=new MyLandDetailsScreen(driver);
			recordHarvestScreen=new RecordHarvestingScreen(driver);
			driverUtility=new DriverUtility(driver);
//			 futil=new FileUtility();
			gestureUtility=new GestureUtility(driver);
			loginScreen=new LoginScreen(driver);
			ffbSupplyScreen=new FFBsupplyScreen(driver);
			farmerLandDetailScreen=new FarmerLandDetailsScreen(driver);
			plantationDetailScreen=new PlantationDetailsScreen(driver);
			slotBookingScreen= new CCslotBookingScreen(driver);
			selectLandScreen=new SelectLandScreen(driver);
			successPopupScreen=new SuccessPopUpScreen(driver);
			selectCcScreen=new SelectCcScreen(driver);
			deliveryTimeScreen=new DeliveryTimeScreen(driver);
			myProfileScreen=new MyProfileScreen(driver);
			enquiryScreen= new EnquiriesScreen(driver);
			newEnquiryScreen=new NewEnquiryScreen(driver);
			profilePictureScreen=new ProfilePictureScreen(driver);
		}
		
		@AfterClass
		public void closeApp() throws IOException {
			driver.terminateApp("com.gavl.oilpalm.samadhan");
		}
		
	}


