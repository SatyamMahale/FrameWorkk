package projet1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test1 {

	public static void main(String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Satyam1");
		caps.setCapability(MobileCapabilityType.UDID,"4f592bf");
		caps.setCapability(MobileCapabilityType.APP,"C:\\Apk\\base.apk");
		URL url=new URL ("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,caps);
		System.out.println("App will be started");
		
		
	}
	
	
	
	
	
}
