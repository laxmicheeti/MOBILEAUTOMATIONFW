import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class test {
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		UiAutomator2Options uio = new UiAutomator2Options();

		URL url = new URL("http://127.0.0.1:4723/"); //appium by default runs on 4723 port

		uio.setPlatformName("Android");  //which platform 

		uio.setDeviceName("Galaxy Tab A7");   //Mobile name, doesn't matter

		uio.setPlatformVersion("12");   //Android version from the phone

		uio.setAutomationName("UIAutomator2");//which driver to use to automate

		uio.setAppPackage("com.solodroid.solomerce");

		uio.setAppActivity("com.solodroid.solomerce.activities.MainActivity");
		uio.setUnlockType("pin"); //screen pin to unlock the device
		uio.setUnlockKey("0916");
		
			AndroidDriver driver = new AndroidDriver(url,uio);
			
		 driver.findElement(By.id("com.solodroid.solomerce:id/search")).click();
		driver.findElement(By.id("com.solodroid.solomerce:id/search_src_text")).sendKeys("LED TV");
		//driver.findElement(By.id("com.solodroid.solomerce:id/category_image")).click();
		//driver.findElement(By.id("com.solodroid.solomerce:id/btn_add_cart")).click();
			//driver.findElement(By.id("com.solodroid.solomerce:id/userInputDialog"));
		  driver.hideKeyboard(); 
		  //it rotates the screen portrait to landscape
		  if(driver.getOrientation().equals(ScreenOrientation.PORTRAIT)) {
			  driver.rotate(ScreenOrientation.LANDSCAPE);
		  }
		  driver.rotate(ScreenOrientation.PORTRAIT);
		  driver.navigate().back();//application back
		 // driver.lockDevice();//it locks the device
		  Thread.sleep(5000);
		//  driver.unlockDevice();//it unlocks the device
		 		
	}

}
