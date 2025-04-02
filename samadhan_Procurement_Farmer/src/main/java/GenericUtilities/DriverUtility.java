package GenericUtilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
/**
 * @author DivyaPrakashAmar
 * This is to perform action on mobile operating system 
 * @param String package_name,String path,int time,WebElement webElement
 * 
 */
public class DriverUtility {
	public AndroidDriver driver;
	
	public DriverUtility(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method is use to install application
	 * @param String package_name,String path
	 */
	public void installapp(String package_name,String path) {
		driver.installApp(path);
		driver.isAppInstalled(package_name);
	}
	
	/**
	 * This method is use to uninstall application
	 * @param String package_name
	 */
	public void uninstallapp(String package_name) {
		driver.removeApp(package_name);
	}
	
	/**	
	 * This method is use to Hide Keyboard
	 */
	public void hideKeyboard() {
		driver.hideKeyboard();
	}
	
	/**
	 * This method is use to Open Notification
	 */
	public void opennotification() {
		driver.openNotifications();
	}
	
	/**
	 * This method is use to check App Status  wheather it is running or stopped
	 * @param String pakage_name
	 */
	public void appStatus(String pakage_name) {
		driver.queryAppState(pakage_name);
	}
	
	/**
	 * This method is use to lock the device
	 */
	public void deviceLock() {
		driver.isDeviceLocked();
	}
	
	/**	
	 * This method is use to Activate App
	 * @param String package_name
	 */
	public void activateApp(String package_name) {
		driver.activateApp(package_name);
	}
	/**
	 * This method is use to run app in background
	 * @param int time
	 */
	public void appInackground(int time) {
		driver.runAppInBackground(Duration.ofSeconds(time));
	}
	
	/**
	 * This method is use to run switch the context
	 */
	public void contexthandle() {
		Set<String> ch=driver.getContextHandles();
		int count=ch.size();
		System.out.println(count);
		for(String allcontext:ch) {
			System.out.println(allcontext);
		}
	}
	
	/**
	 *This method is use to switch context to webview
	 *@param String WEBVIEW_packageName
	 */
	public void switchContext(String WEBVIEW_packageName) {
		driver.context(WEBVIEW_packageName);
	}
	
	/**
	 *This method is use to switch context to NATIVEVIEW
	 *@param String NATIVEVIEW_packageName
	 */
	public void SwitchToNativeView(String NATIVEVIEW_packageName) {
		driver.context(NATIVEVIEW_packageName);
	}
	
	/**
	 *This method is use to apply implicit Wait
	 *@param int Time
	 */
	 public void implicitWait(int i) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	 /**
	  *This method is use to change orientation to landscape mode
	  */
	 @SuppressWarnings("static-access")
	public void orientationLandScape() {
		 org.openqa.selenium.ScreenOrientation screen= driver.getOrientation();
		 driver.rotate(screen.LANDSCAPE);
	 }
	 
	 /**
	  *This method is use to change orientation to Portrait mode
	  */
	@SuppressWarnings("static-access")
	public void orientationPortrait() {
		 org.openqa.selenium.ScreenOrientation screen= driver.getOrientation();
		 driver.rotate(screen.PORTRAIT);
	}
	
	/**
	  *This method is use to turnOff data 
	  */
	public void turnOfData() {
		@SuppressWarnings("unused")
		ConnectionState dataOff = driver.setConnection(new ConnectionStateBuilder().withDataDisabled().build());
	}
	
	/**
	  *This method is use to turn On data 
	  */
	public void turnOnData() {
		@SuppressWarnings("unused")
		ConnectionState turnOn = driver.setConnection(new ConnectionStateBuilder().withDataEnabled().build());
	}
	
	/**
	  *This method is use to turn Off Wifi
	  */
	public void turnOfWifi() {
		@SuppressWarnings("unused")
		ConnectionState turnOfWifi = driver.setConnection(new ConnectionStateBuilder().withWiFiDisabled().build());
	}
	
	/**
	  *This method is use to turn On Wifi 
	  */
	public void turnOnWifi() {
	@SuppressWarnings("unused")
	ConnectionState turnOnWifi = driver.setConnection(new ConnectionStateBuilder().withWiFiEnabled().build());
	}
	
	/**
	  *This method is use to turn Off airplane mode
	  */
	public void turnOffAirplane() {
		driver.setConnection(new ConnectionStateBuilder().withAirplaneModeDisabled().build());
	}
	
	/**
	  *This method is use to turn On airplane mode
	  */
	public void turnOnAirplane() {
		driver.setConnection(new ConnectionStateBuilder().withAirplaneModeEnabled().build());
	}
	
	/**
	  *This method is use to apply explicit wait
	  *@param int Time, WebElement webElement
	  */
	public void explicitWait(int i , WebElement element) {
		WebDriverWait wait;
		wait=new WebDriverWait(driver, Duration.ofSeconds(i));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	/**
	  *This method is use to apply threade Wait
	  *@param int Time
	  */
	
	public void threadWait(int time) {
		try {
			Thread.sleep(Duration.ofSeconds(time));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	  *This method is use to close app
	  */

	public void closeApp() {
		try {
			driver.close();
		}catch (Exception e) {
			System.out.println("Not able to close the app");
		}
	}
	
	/**
	  *This method is use to terminate app
	  *@param String appPackage
	  */
	public void terminateApp(String appPackage) {
		try {
			driver.terminateApp(appPackage);
		}catch (Exception e) {
			System.out.println("Not able to terminate app");
		}
	}
}
