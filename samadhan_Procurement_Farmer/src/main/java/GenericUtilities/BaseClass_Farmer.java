package GenericUtilities;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import ObjectoRepository_Farmer.DeliveryTimePage;
import ObjectoRepository_Farmer.EnquiriesPage;
import ObjectoRepository_Farmer.FFBsupplyPage;
import ObjectoRepository_Farmer.FarmerLandDetailsScreenPage;
import ObjectoRepository_Farmer.HambergerTabPage;
import ObjectoRepository_Farmer.HomePage;
import ObjectoRepository_Farmer.LoginPage;
import ObjectoRepository_Farmer.MyLandDetailsPage;
import ObjectoRepository_Farmer.MyProfilePage;
import ObjectoRepository_Farmer.RecordHarvestingPage;
import ObjectoRepository_Farmer.ccSlotBookingPage;
import ObjectoRepository_Farmer.newEnquiryPage;
import ObjectoRepository_Farmer.plantationDetailsScreenPage;
import ObjectoRepository_Farmer.profilePicturePage;
import ObjectoRepository_Farmer.selectCcPage;
import ObjectoRepository_Farmer.selectLandPage;
import ObjectoRepository_Farmer.successpopupPage;
import io.appium.java_client.android.AndroidDriver;

/*
 * @author Testing Engineer
 * This is the base class configured for launching application through appium server
 */
public class BaseClass_Farmer {
	public static AndroidDriver sdriver;
	AndroidDriver driver;

	public static HomePage hp;
	public static HambergerTabPage htp;
	public static MyLandDetailsPage mldp;
	public static RecordHarvestingPage rhp;
	public static DriverUtility dutil;
//	public FileUtility futil;
	public static GestureUtility gutil;
	public static LoginPage lp;
	public static FFBsupplyPage fsp;
	public static FarmerLandDetailsScreenPage fldsp;
	public static plantationDetailsScreenPage pdsp;
	public static ccSlotBookingPage sbp;
	public static selectLandPage slp;
	public static successpopupPage spp;
	public static selectCcPage scp;
	public static DeliveryTimePage dtp;
	public static MyProfilePage mpp;
	public static EnquiriesPage ep;
	public static newEnquiryPage nep;
	public static profilePicturePage ppp;
	

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
			 hp= new HomePage(driver);
			 htp=new HambergerTabPage(driver);
			 mldp=new MyLandDetailsPage(driver);
			 rhp=new RecordHarvestingPage(driver);
			 dutil=new DriverUtility(driver);
//			 futil=new FileUtility();
			 gutil=new GestureUtility(driver);
			 lp=new LoginPage(driver);
			 fsp=new FFBsupplyPage(driver);
			 fldsp=new FarmerLandDetailsScreenPage(driver);
			 pdsp=new plantationDetailsScreenPage(driver);
			 sbp= new ccSlotBookingPage(driver);
			 slp=new selectLandPage(driver);
			 spp=new successpopupPage(driver);
			 scp=new selectCcPage(driver);
			 dtp=new DeliveryTimePage(driver);
			 mpp=new MyProfilePage(driver);
			 ep= new EnquiriesPage(driver);
			 nep=new newEnquiryPage(driver);
			 ppp=new profilePicturePage(driver);
		}
		
		@AfterClass
		public void closeApp() throws IOException {
			driver.terminateApp("com.gavl.oilpalm.samadhan");
		}
		
	}


