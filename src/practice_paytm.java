import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class practice_paytm {
	
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		File appDir = new File("src");
		
	//File app = new File(appDir, "base3.apk");
	
		
		
		
	DesiredCapabilities cap= new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	
cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "400");
	//cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
	System.out.println("I am here dude");
	driver.get("http://m.cricbuzz.com");
	System.out.println(driver.findElementByCssSelector(".//*[@id='top']/div[1]/div[6]/a[1]/div/div/div/span[2]").getText());
	
	
     
}
}
