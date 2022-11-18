package projet1;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;


public class NewTest {

	AndroidDriver driver;
  @Test
  public void SampleTest() throws InterruptedException {
	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("anita.oghenakhogie@max.ng");
	  
	  System.out.println("enter email");
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys("password");
	 
	  System.out.println("Enter Password");
	
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"LOGIN TO YOUR ACCOUNT\"]")).click();
	  System.out.println("click on button");
	  
  }
  @BeforeTest
  public void setup() throws MalformedURLException, InterruptedException {
	  
	  DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"AndroidEmu");
		caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		caps.setCapability("appPackage","ng.max.onboarding.dev");
		caps.setCapability("appActivity","ng.max.onboarding.MainActivity");
		
		URL url=new URL ("http://127.0.0.1:4723/wd/hub");
		
		new AndroidDriver(url,caps);
		System.out.println("App will be started");
		Thread.sleep(5000);
  }

 

}
