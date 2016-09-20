import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class desiredcapab {

	@Test
	public void test() throws MalformedURLException, InterruptedException {
		File appDir = new File("src");
		
	File app = new File(appDir, "base.apk");
	
	DesiredCapabilities cap= new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
	
	
	
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "400");
	cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    //Clicks on Default button.
	driver.findElementById("com.att.android.mobile.attmessages:id/btn_yes").click();
	//Clicks on Accept Button
	driver.findElementById("com.att.android.mobile.attmessages:id/register").click();
	
	
	
	
	
	
	driver.findElementById("").click();
	driver.scrollTo("");
	driver.sendKeyEvent(AndroidKeyCode.BACK);
	driver.sendKeyEvent(AndroidKeyCode.HOME);
	Thread.sleep(500L);
	driver.sendKeyEvent(AndroidKeyCode.MENU);
	
	
	
	
	//driver.findElementById("com.att.android.mobile.attmessages:id/msisdnText").sendKeys("4252865784");
	//driver.findElementById("com.att.android.mobile.attmessages:id/retypeMsisdn").sendKeys("4252865784");

	//driver.findElementByClassName("android.widget.Button").click();
	

	/** driver.scrollTo("Trending Now");
    TouchAction t = new TouchAction(driver);
    WebElement abc = driver.findElementById("");
    t.tap(abc).perform();
    List<WebElement> xyz = driver.findElementsByClassName("");
    for(int i = 0; i < xyz.size(); i++)
    {
    	if(xyz.get(i).getText().contains("Tumy"))
    	{
    		t.longPress(xyz.get(i)).perform();
    		Thread.sleep(5000l);
    		driver.findElementByAndroidUIAutomator("new UIselector().text")
    		*/
    	
	
	}
    }
    	
    
    
	
	
	
	
	
	
	
	
		}
	
	
	
	
	}
	


