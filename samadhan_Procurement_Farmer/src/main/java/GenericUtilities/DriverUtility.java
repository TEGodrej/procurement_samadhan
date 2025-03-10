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

public class DriverUtility {
	public AndroidDriver driver;
	
	public DriverUtility(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void installapp(String package_name,String path) {
		driver.installApp(path);
		driver.isAppInstalled(package_name);
	}
	
	public void uninstallapp(String package_name) {
		driver.removeApp(package_name);
	}
	
	public void hideKeyboard() {
		driver.hideKeyboard();
	}
	
	public void opennotification() {
		driver.openNotifications();
	}
	
	public void appStatus(String pakage_name) {
		driver.queryAppState(pakage_name);
	}
	
	public void deviceLock() {
		driver.isDeviceLocked();
	}
	
	public void activateApp(String package_name) {
		driver.activateApp(package_name);
	}
	
	public void appInackground(int time) {
		driver.runAppInBackground(Duration.ofSeconds(time));
	}
	
	public void contexthandle() {
		Set<String> ch=driver.getContextHandles();
		int count=ch.size();
		System.out.println(count);
		for(String allcontext:ch) {
			System.out.println(allcontext);
		}
	}
	public void switchContext(String WEBVIEW_packageName) {
		driver.context(WEBVIEW_packageName);
	}
	public void SwitchToNativeView(String NATIVEVIEW_packageName) {
		driver.context(NATIVEVIEW_packageName);
	}
	 public void implicitWait(int i) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	 @SuppressWarnings("static-access")
	public void orientationLandScape() {
		 org.openqa.selenium.ScreenOrientation screen= driver.getOrientation();
		 driver.rotate(screen.LANDSCAPE);
	 }
	@SuppressWarnings("static-access")
	public void orientationPortrait() {
		 org.openqa.selenium.ScreenOrientation screen= driver.getOrientation();
		 driver.rotate(screen.PORTRAIT);
	}
	
	public void turnOfData() {
		@SuppressWarnings("unused")
		ConnectionState dataOff = driver.setConnection(new ConnectionStateBuilder().withDataDisabled().build());
	}
	
	public void turnOnData() {
		@SuppressWarnings("unused")
		ConnectionState turnOn = driver.setConnection(new ConnectionStateBuilder().withDataEnabled().build());
	}
	public void turnOfWifi() {
		@SuppressWarnings("unused")
		ConnectionState turnOfWifi = driver.setConnection(new ConnectionStateBuilder().withWiFiDisabled().build());
	}
	public void turnOnWifi() {
	@SuppressWarnings("unused")
	ConnectionState turnOnWifi = driver.setConnection(new ConnectionStateBuilder().withWiFiEnabled().build());
	}
	
	public void turnOffAirplane() {
		driver.setConnection(new ConnectionStateBuilder().withAirplaneModeDisabled().build());
	}
	public void turnOnAirplane() {
		driver.setConnection(new ConnectionStateBuilder().withAirplaneModeEnabled().build());
	}
	
	public void explicitWait(int i , WebElement element) {
		WebDriverWait wait;
		wait=new WebDriverWait(driver, Duration.ofSeconds(i));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public void threadWait(int time) {
		try {
			Thread.sleep(Duration.ofSeconds(time));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	public void resetApp() {
//		driver.rese
//	}
}
