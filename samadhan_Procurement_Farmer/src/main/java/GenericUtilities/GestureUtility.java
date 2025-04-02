package GenericUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

/**
 *@author DivyaPrakashAmar
 */
public class GestureUtility extends BaseClass_Farmer{
 AndroidDriver driver;
 
 	public GestureUtility(AndroidDriver driver) {
 		this.driver=driver;
 	}
 	
 	/**
 	 *This method is use to perform click gesture
 	 *@param element , takes webelement on which have to perform gesture
 	 */
		public void click(WebElement element) {
			 ((JavascriptExecutor)driver).executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()));
			try {
			RemoteWebElement remoteElement = (RemoteWebElement) driver.findElement(By.id("someId")); 
			String elementId = remoteElement.getId();
			((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", elementId
			));
		}catch (Exception e) {
			System.out.println("Not able to click on webelement");
		}
		}
		
		/**
	 	 *This method is use to perform longclick gesture
	 	 *@param element , takes webelement on which have to perform gesture
	 	 */
		public void longClick(WebElement element) {
			((JavascriptExecutor)driver).executeScript("mobile:longClickGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)element).getId()));
		}
		
		/**
	 	 *This method is use to perform doubleclick gesture
	 	 *@param element , takes webelement on which have to perform gesture
	 	 */
		public void doubleClick(WebElement element) {
			((JavascriptExecutor)driver).executeScript("mobile:doubleClickGesture", ImmutableMap.of(
					"elementId",((RemoteWebElement)element).getId()));
		}
		
		/**
	 	 *This method is use to perform drag and drop gesture by using co-ordinates
	 	 *@param element , takes webelement on which have to perform gesture
	 	 *@param x , takes X axis till where element have to be dropped
	 	 *@param y , take y axis till where element have to be dropped
	 	 */
		public void dragAndDrop(WebElement element,int x, int y) {
			((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"endX", 100,"endY", 100));
		}

		/**
	 	 *This method is use to perform fling gesture by using co-ordinates
	 	 *@param element , takes webelement on which have to perform gesture
	 	 *@param dir , in wich direction action has to be performed 
	 	 *@param canScrollMore , gives boolean condition after execution
	 	 */
		public void flingGesture(WebElement element, String dir, int Speed, boolean canScrollMore) {
			 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "direction", "dir",
			    "speed", Speed));
		}

		/**
	 	 *This method is use to perform pinch open gesture by using co-ordinates
	 	 *@param element , takes webelement on which have to perform gesture
	 	 *@param percentage , to know at what percentage it have to zoomIn
	 	 */
		public void pinchOpen(WebElement element, double percentage) {
			((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", percentage));
		}
		/**
	 	 *This method is use to perform pinch open gesture by using co-ordinates
	 	 *@param element , takes webelement on which have to perform gesture
	 	 *@param percentage , to know at what percentage it have to zoomOut
	 	 */
		public void pinchClose(WebElement element, double percentage) {
			((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", 0.75	));
		}
		/**
		 * This method is use to perform swipe action using co-ordinate
		 * @param element , on which action have to perform
		 * @param left , takes left co-ordinate
		 * @param top , takes top co-ordinate
		 * @param width , takes width's co-ordinate
		 * @param height , takes height's co-ordinate
		 * @param percentage , takes know that what percent of screen it has to swipe
		 * @param dir,take to know that in which direction it have scroll
		 * */
		public void swipe(WebElement element, int left,int top, int width,int height,double percentage,String dir) {
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", left, "top", top, "width", width, "height", height,
			    "direction", dir, "percent", percentage));
		}
		/**
		 * This method is use to perform scroll action using co-ordinate
		 * @param element , on which action have to perform
		 * @param left , takes left co-ordinate
		 * @param top , takes top co-ordinate
		 * @param width , takes width's co-ordinate
		 * @param height , takes height's co-ordinate
		 * @param percentage , takes know that what percent of screen it has to swipe
		 * @param dir,take to know that in which direction it have scroll
		 * @param canScrollMore, returns boolean condition after execution
		 * */
		public void scroll(WebElement element,boolean canScrollMore, int left, int top, int width,int height,double percentage,String dir) {
			 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", left, "top", top, "width", width, "height", height,
			    "direction", dir,"percent", percentage));
		}
		/**
		 * This method is use to perform scroll action to make element visible 
		 * @param text , takes text which have to be visible
		 * */
		public void scrollIntoView(String text) {
			sdriver.findElement(AppiumBy.androidUIAutomator(
				    "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(text))"));
		}
		/**
		 * This method is use to perform click action by using co-ordinate
		 * @param x , takes x axis of the element
		 * @param y , takes y axis of the element 
		 * */
		public void clickByAxes(int x, int y) {
			driver.executeScript("mobile: clickGesture", ImmutableMap.of("x",x,"y",y));
		}
		/**
		 * This method is use to perform double click action by using co-ordinate
		 * @param x , takes x axis of the element
		 * @param y , takes y axis of the element 
		 * */
		public void doubleClickByAxes(int x, int y) {
			driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x",x,"y",y));
		}
		/**
		 * This method is use to perform long click action by using co-ordinate
		 * @param x , takes x axis of the element
		 * @param y , takes y axis of the element 
		 * */
		public void longClickByAxes(int x,int y) {
			driver.executeScript("mobile: longClickGesture", ImmutableMap.of("x",x,"y",y));
		}
		
		/**
		 * This method is use to perform pinch open action by using co-ordinate
		 * @param startX , takes x axis of the element from where it start the action
		 * @param startY , takes y axis of the element from where it start the action
		 * @param endX , takes x axis of the element till where it stop the action
		 * @param endY , takes y axis of the element till where it stop the action
		 * @param percenage , takes to know how much percent it have to zoom
		 * */
		public void pinchOpenByAxes(int startX, int startY, int endX, int endY, double percentage) {
		    ((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
		        "startX", startX,
		        "startY", startY,
		        "endX", endX,
		        "endY", endY,
		        "percent", percentage
		    ));
		}
		/**
		 * This method is use to perform scroll action by using co-ordinate
		 * @param startX , takes x axis of the element from where it start the action
		 * @param startY , takes y axis of the element from where it start the action
		 * @param endX , takes x axis of the element till where it stop the action
		 * @param endY , takes y axis of the element till where it stop the action
		 * @param dir , take to know in which direction it have to perform action
		 * @param percentage , takes to know how much percent it have to perform action
		 * */
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
		/**
		 * This method is use to perform swipe action by using co-ordinate
		 * @param startX , takes x axis of the element from where it start the action
		 * @param startY , takes y axis of the element from where it start the action
		 * @param endX , takes x axis of the element till where it stop the action
		 * @param endY , takes y axis of the element till where it stop the action
		 * @param dir , take to know in which direction it have to perform action
		 * @param percentage , takes to know how much percent it have to perform action
		 * */
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
		/**
		 * This method is use to perform fling action by using co-ordinate
		 * @param startX , takes x axis of the element from where it start the action
		 * @param startY , takes y axis of the element from where it start the action
		 * @param dir , take to know in which direction it have to perform action
		 * @param speed ,take s to know how fast it has to perform the action
		 * */
		public void fling(int startX, int startY, String dir, int speed) {
		    ((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
		        "startX", startX, 
		        "startY", startY, 
		        "direction", dir,
		        "speed", speed
		    ));
		}
		
		/**
		 * This method is use to perform pinch open action by using co-ordinate
		 * @param startX , takes x axis of the element from where it start the action
		 * @param startY , takes y axis of the element from where it start the action
		 * @param endX , takes x axis of the element till where it stop the action
		 * @param endY , takes y axis of the element till where it stop the action
		 * @param percenage , takes to know how much percent it have to zoom
		 * */
		public void pinchCloseByAxes(int startX, int startY, int endX, int endY, double percentage) {
		    ((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
		        "startX", startX,
		        "startY", startY,
		        "endX", endX,
		        "endY", endY,
		        "percent", percentage
		    ));
		}
		
		/**
		 * This method is use to perform swipe Right gesture Using Co-ordinates
		 * @param left , takes left co-ordinate of the element
		 * @param width , takes width co-ordinate of the element
		 * @param top , takes top co-ordinate of the element
		 * @param height , takes height of the element
		 * */
		public void swipeRightUsingCoOrdinates(int left, int width, int top,int  height)
		{
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
					"left", left, "top", top, "width", width, "height", height,
					"direction", "left",
					"percent", 0.75
					));

		}
		
		/**
		 * This method is use to perform swipe to right gesture using element reference
		 * @param element , the element on which action has to be performed
		 * */
				public void swipeRighttUsingElement(WebElement element)
				{
					((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
							"elementId",((RemoteWebElement) element).getId(),
							"direction", "Right",
							"percent", 0.75
							));
				}
				/**
				 * This method is use to perform swipe to left gesture using element reference
				 * @param element , the element on which action has to be performed
				 * */
				public void swipeLeftUsingElement(WebElement ele)
				{
					((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
							"elementId",((RemoteWebElement) ele).getId(),
							"direction", "left",
							"percent", 0.75
							));
				}
				/**
				 * This method is use to perform scrollUp gesture using UiAutomator
				 * */
				public void scrollUp() {
			        String scrollAction = "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward()";
			        driver.findElement(AppiumBy.androidUIAutomator(scrollAction));
			    }
				/**
				 * This method is use to perform scrolldown gesture using UiAutomator
				 * */
				public void scrollDown() {
			        String scrollAction = "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()";
			        driver.findElement(AppiumBy.androidUIAutomator(scrollAction));
			    }
				

}


