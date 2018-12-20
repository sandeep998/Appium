package Appium_basics;



import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Appium_1st_Test {
	
	org.openqa.selenium.Dimension size;
	WebDriver driver;
@BeforeClass
public void tes() throws Exception {
	DesiredCapabilities capabilities = new DesiredCapabilities();

	capabilities.setCapability("deviceName","QKUSQ8ON7DTS6TFI");

	capabilities.setCapability("platformVersion", "7.1");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("appPackage", "sun.way2sms.hyd.com");
	Thread.sleep(5000);
	capabilities.setCapability("appActivity", "sun.way2sms.hyd.com.way2news.activities.SplashActivity");

	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
}
@Test
public void verticall() throws InterruptedException {

Thread.sleep(5000);
for(int i = 0; i<=3;i++) {
	
//Dimension size = this.driver.manage().window ().getSize(); 
	
	
 size=this.driver.manage().window().getSize();
System.out.println(size);

int startY = (int) (size.height * 0.80);          
         int endY = (int) (size.height * 0.20);
int startX = size.width /2;
TouchAction action = new TouchAction((PerformsTouchActions) driver);               
action.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release().perform ();

  }
String str = driver.findElement(By.id("sun.way2sms.hyd.com:id/textView_language_title_name")).getText();
System.out.println(str);
/*if(str.equals(str)) {
System.out.println(str);
}else {
System.out.println("error ");
}
Thread.sleep(5000);
driver.findElement(By.id("sun.way2sms.hyd.com:id/button_lang_proceed")).click();
System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().accept();
}*/

}

}
