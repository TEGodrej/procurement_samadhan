package GenericUtilities;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import ObjectoRepository_Farmer.deliveryTimeScreen;
import ObjectoRepository_Farmer.EnquiriesScreen;
import ObjectoRepository_Farmer.FFBsupplyScreen;
import ObjectoRepository_Farmer.FarmerLandDetailsScreen;
import ObjectoRepository_Farmer.HambergerTabScreen;
import ObjectoRepository_Farmer.HomeScreen;
import ObjectoRepository_Farmer.LoginScreen;
import ObjectoRepository_Farmer.MyLandDetailsScreen;
import ObjectoRepository_Farmer.MyProfileScreen;
import ObjectoRepository_Farmer.RecordHarvestingScreen;
import ObjectoRepository_Farmer.ccSlotBookingScreen;
import ObjectoRepository_Farmer.newEnquiryScreen;
import ObjectoRepository_Farmer.plantationDetailsScreen;
import ObjectoRepository_Farmer.profilePictureScreen;
import ObjectoRepository_Farmer.selectCcScreen;
import ObjectoRepository_Farmer.selectLandScreen;
import ObjectoRepository_Farmer.successpopupScreen;
import io.appium.java_client.android.AndroidDriver;

/*
 * @author Testing Engineer
 * This is the base class configured for launching application through appium server
 */
public class BaseClass_Farmer {
	public static AndroidDriver sdriver;
	AndroidDriver driver;

	public static HomeScreen homeScreen;
	public static HambergerTabScreen hambergerTabScreen;
	public static MyLandDetailsScreen myLandDetailScreen;
	public static RecordHarvestingScreen recordHarvestScreen;
	public static DriverUtility driverUtility;
//	public FileUtility futil;
	public static GestureUtility gestureUtility;
	public static LoginScreen loginScreen;
	public static FFBsupplyScreen ffbSupplyScreen;
	public static FarmerLandDetailsScreen farmerLandDetailScreen;
	public static plantationDetailsScreen plantationDetailScreen;
	public static ccSlotBookingScreen slotBookingScreen;
	public static selectLandScreen selectLandScreen;
	public static successpopupScreen successPopupScreen;
	public static selectCcScreen selectCcScreen;
	public static deliveryTimeScreen deliveryTimeScreen;
	public static MyProfileScreen myProfileScreen;
	public static EnquiriesScreen enquiryScreen;
	public static newEnquiryScreen newEnquiryScreen;
	public static profilePictureScreen profilePictureScreen;
	

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
			hambergerTabScreen=new HambergerTabScreen(driver);
			myLandDetailScreen=new MyLandDetailsScreen(driver);
			recordHarvestScreen=new RecordHarvestingScreen(driver);
			driverUtility=new DriverUtility(driver);
//			 futil=new FileUtility();
			gestureUtility=new GestureUtility(driver);
			loginScreen=new LoginScreen(driver);
			ffbSupplyScreen=new FFBsupplyScreen(driver);
			farmerLandDetailScreen=new FarmerLandDetailsScreen(driver);
			plantationDetailScreen=new plantationDetailsScreen(driver);
			slotBookingScreen= new ccSlotBookingScreen(driver);
			selectLandScreen=new selectLandScreen(driver);
			successPopupScreen=new successpopupScreen(driver);
			selectCcScreen=new selectCcScreen(driver);
			deliveryTimeScreen=new deliveryTimeScreen(driver);
			myProfileScreen=new MyProfileScreen(driver);
			enquiryScreen= new EnquiriesScreen(driver);
			newEnquiryScreen=new newEnquiryScreen(driver);
			profilePictureScreen=new profilePictureScreen(driver);
		}
		
		@AfterClass
		public void closeApp() throws IOException {
			driver.terminateApp("com.gavl.oilpalm.samadhan");
		}
		
	}


