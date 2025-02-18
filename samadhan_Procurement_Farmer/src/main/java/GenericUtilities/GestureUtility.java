package GenericUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GestureUtility extends BaseClass_Farmer{
 AndroidDriver driver;
 
 	public GestureUtility(AndroidDriver driver) {
 		this.driver=driver;
 	}
		public void click(WebElement element) {
			 ((JavascriptExecutor)driver).executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()));
		}
		
		public void longClick(WebElement element) {
			((JavascriptExecutor)driver).executeScript("mobile:longClickGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)element).getId()));
		}
		public void doubleClick(WebElement element) {
			((JavascriptExecutor)driver).executeScript("mobile:doubleClickGesture", ImmutableMap.of(
					"elementId",((RemoteWebElement)element).getId()));
		}
		
		public void dragAndDrop(WebElement element,int x, int y) {
			((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"endX", 100,"endY", 100));
		}
		
		public void flingGesture(WebElement element, String dir, int Speed, boolean canScrollMore) {
			 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "direction", "dir",
			    "speed", Speed));
		}
		
		public void pinchOpen(WebElement element, double percentage) {
			((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", percentage));
		}
		
		public void pinchClose(WebElement element, double percentage) {
			((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", 0.75	));
		}
		public void swipe(WebElement element, int left,int top, int width,int height,double percentage,String dir) {
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", left, "top", top, "width", width, "height", height,
			    "direction", dir, "percent", percentage));
		}
		
		public void scroll(WebElement element,boolean canScrollMore, int left, int top, int width,int height,double percentage,String dir) {
			 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", left, "top", top, "width", width, "height", height,
			    "direction", dir,"percent", percentage));
		}
		
		public void scrollIntoView(String text) {
			sdriver.findElement(AppiumBy.androidUIAutomator(
				    "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(text))"));
		}
		
		public void clickByAxes(int x, int y) {
			driver.executeScript("mobile: clickGesture", ImmutableMap.of("x",x,"y",y));
		}
		
		public void doubleClickByAxes(int x, int y) {
			driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x",x,"y",y));
		}
		
		public void longClickByAxes(int x,int y) {
			driver.executeScript("mobile: longClickGesture", ImmutableMap.of("x",x,"y",y));
		}
		
		public void pinchOpenByAxes(int startX, int startY, int endX, int endY, double percentage) {
		    ((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
		        "startX", startX,
		        "startY", startY,
		        "endX", endX,
		        "endY", endY,
		        "percent", percentage
		    ));
		}
		
		public void scrollByAxes(int startX, int startY, int endX, int endY, String dir, double percentage) {
		    @SuppressWarnings("unused")
		    boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		        "startX", startX, 
		        "startY", startY, 
		        "endX", endX, 
		        "endY", endY,
		        "direction", dir, 
		        "percent", percentage
		    ));
		}
		
		public void swipe(int startX, int startY, int endX, int endY, String dir, double percentage) {
		    ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		        "startX", startX, 
		        "startY", startY, 
		        "endX", endX, 
		        "endY", endY,
		        "direction", dir,
		        "percent", percentage
		    ));
		}
		
		public void fling(int startX, int startY, String dir, int speed) {
		    ((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
		        "startX", startX, 
		        "startY", startY, 
		        "direction", dir,
		        "speed", speed
		    ));
		}
		
		public void pinchCloseByAxes(int startX, int startY, int endX, int endY, double percentage) {
		    ((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
		        "startX", startX,
		        "startY", startY,
		        "endX", endX,
		        "endY", endY,
		        "percent", percentage
		    ));
		}


}


