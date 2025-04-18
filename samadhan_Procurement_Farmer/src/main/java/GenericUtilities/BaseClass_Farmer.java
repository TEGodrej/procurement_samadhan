package GenericUtilities;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import ObjectoRepository_Farmer.CCslotBookingScreen;
import ObjectoRepository_Farmer.DeliveryTimeScreen;
import ObjectoRepository_Farmer.EnquiriesScreen;
import ObjectoRepository_Farmer.FFBsupplyScreen;
import ObjectoRepository_Farmer.FarmerLandDetailsScreen;
import ObjectoRepository_Farmer.HamburgerTabScreen;
import ObjectoRepository_Farmer.HomeScreen;
import ObjectoRepository_Farmer.LoginScreen;
import ObjectoRepository_Farmer.MyLandDetailsScreen;
import ObjectoRepository_Farmer.MyProfileScreen;
import ObjectoRepository_Farmer.NewEnquiryScreen;
import ObjectoRepository_Farmer.PlantationDetailsScreen;
import ObjectoRepository_Farmer.ProfilePictureScreen;
import ObjectoRepository_Farmer.RecordHarvestingScreen;
import ObjectoRepository_Farmer.SelectCcScreen;
import ObjectoRepository_Farmer.SelectLandScreen;
import ObjectoRepository_Farmer.SuccessPopUpScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/*
 * @author Testing Engineer
 * This is the base class configured for launching application through appium server
 */
public class BaseClass_Farmer {
	public static AndroidDriver sdriver;
	AndroidDriver driver;

	public static HomeScreen homeScreen;
	public static HamburgerTabScreen hamburgerTabScreen;
	public static MyLandDetailsScreen myLandDetailScreen;
	public static RecordHarvestingScreen recordHarvestScreen;
	public static DriverUtility driverUtility;
	public static FileUtility fileUtility;
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
	public static ExcelUtility  excelutility;
	public AppiumDriverLocalService service ;

	

		@BeforeClass
		public void startApp() throws IOException {
		
/*
 * this is to start the appium server
 */			
						
						
			File file = new File(FileUtility.getDataFromProperty("mainJSPath"));
		    service = new AppiumServiceBuilder().withAppiumJS(file).withIPAddress(FileUtility.getDataFromProperty("ipAddress")).usingPort(Integer.parseInt(FileUtility.getDataFromProperty("portNumber"))).build();
			service.start();
							
			/*         
			 * Fetching data from property file
			 * 
			 */			
						String platformName=FileUtility.getDataFromProperty("platformName");
						String DeviceName=FileUtility.getDataFromProperty("DeviceName");
						String automationName=FileUtility.getDataFromProperty("automationName");
						String udid=FileUtility.getDataFromProperty("UDID");
						String appActivty=FileUtility.getDataFromProperty("appActivity");
						String appPackage=FileUtility.getDataFromProperty("appPackage");
						String noReset=FileUtility.getDataFromProperty("noReset");
						
						DesiredCapabilities desiredCapability=new DesiredCapabilities();
						desiredCapability.setCapability("platformName", platformName);
						desiredCapability.setCapability("deviceName", DeviceName);
						desiredCapability.setCapability("automationName", automationName);
						desiredCapability.setCapability("UDID", udid);
						desiredCapability.setCapability("noReset", noReset);
						desiredCapability.setCapability("appActivity", appActivty);
						desiredCapability.setCapability("appPackage", appPackage);
			
//			DesiredCapabilities desiredCapability=new DesiredCapabilities();
//			desiredCapability.setCapability("platformName", "android");
//			desiredCapability.setCapability("deviceName", "Redmi A2");
//			desiredCapability.setCapability("automationName", "Uiautomator2");
//			desiredCapability.setCapability("UDID", "WKAQCYCQKROVDE4L");
//			desiredCapability.setCapability("noReset", true);
			
//			dc.setCapability("appActivity", "com.godrejsamadhanmobile.MainActivity");
//			dc.setCapability("appPackage", "com.gavl.oilpalm.samadhan");
			
			URL url= URI.create("http://localhost:4723").toURL();
			driver=new AndroidDriver(url, desiredCapability);
			sdriver=driver;
//			driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
			
//			driver.activateApp("com.gavl.oilpalm.samadhan");
			System.out.println("app is launched");
//			driverUtility.implicitWait(10);
			homeScreen= new HomeScreen(driver);
			hamburgerTabScreen=new HamburgerTabScreen(driver);
			myLandDetailScreen=new MyLandDetailsScreen(driver);
			recordHarvestScreen=new RecordHarvestingScreen(driver);
			driverUtility=new DriverUtility(driver);
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
			excelutility = new ExcelUtility();
			fileUtility = new FileUtility();
			driverUtility.implicitWait(10);
		}
		@AfterClass
		public void closeApp() throws IOException {
			driver.terminateApp("com.gavl.oilpalm.samadhan");
		}
//		
	}


