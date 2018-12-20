package Appium_basics;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;



public class Ebiz_Testing extends Appium_Base{
	//static AndroidDriver driver;
	static ExtentReports reports;
	static ExtentTest loger;
	Appium_POM ebi=new Appium_POM(driver);
	

	@BeforeClass
	public void before() throws Exception {
		reports =new ExtentReports("C:\\Users\\sandeep.mandhala\\eclipse-workspace\\Appium_project\\Ebix_results.html",true);
		loger=reports.startTest("verify test");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "QKUSQ8ON7DTS6TFI");

		capabilities.setCapability("platformVersion", "7.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.devrabbit.ivq");
		capabilities.setCapability("appActivity", "com.devrabbit.ivq.SplashScreenActivity");
		capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		
		//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
	}

	@Test
	public void maintest() throws Exception {
		try {
			Thread.sleep(8000);
	
			/*driver.findElement(By.xpath("//android.widget.EditText[@index = '5']")).click();
			driver.findElement(By.xpath("//android.widget.EditText[@index = '5']")).sendKeys("9991234567");*/
			Appium_POM.mobileNumberClick(driver);
			ebi.mobileNumberSend(driver, "0009999919");
			loger.log(LogStatus.INFO, "Entered Mobile Number");
			Thread.sleep(5000);
			
			
            driver.findElement(By.xpath("//android.widget.ImageView[@index = '0']")).click();
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView")).click();
			loger.log(LogStatus.INFO, "Enter Get OTP");
			//ebi.getOtp(driver);
			//	ebi.getOtp(driver);
			
			Thread.sleep(5000);
         driver.findElement(By.xpath("//android.view.ViewGroup[@index = '0']")).click();
         driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
         loger.log(LogStatus.INFO, "Clicked OTP has been sent");
         // ebi.popupOtp(driver);
     // ebi.popupOtp(driver);
    
	
       Thread.sleep(5000);
     ebi.oneTimePass(driver);
     ebi.oneTimePassAgain(driver, "123456");
     
     
     ebi.verifyButton1(driver);
     ebi.verifyButton1(driver);
  
     
     ebi.firstName(driver, "sandeep");
     ebi.lastName(driver, "reddy");
     ebi.emaiL(driver, "sanfgh@gmail.com");
     ebi.Done(driver);
     ebi.Done(driver);
     loger.log(LogStatus.INFO, "Clicked Done button");
     Thread.sleep(5000);
     
     ebi.successPopup(driver);
     ebi.successPopup(driver);
     loger.log(LogStatus.INFO, "Entered Now Button");
     Thread.sleep(5000);
     
     //driver.findElement(By.xpath("//android.widget.EditText[@index = '0']")).click();
    // driver.findElement(By.xpath("//android.widget.EditText[@index = '0']")).sendKeys("Devrabbit");*/
    // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText")).click();

   //  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText")).sendKeys("Devrabbit");
     List<WebElement> textFieldsList=  driver.findElements(By.className("android.widget.EditText"));
 	textFieldsList.get(0).sendKeys("Devrabbit");
     
     loger.log(LogStatus.INFO, "Entered Company Name");

     
 //    ebi.comDisgnation(driver, "Test enginner");
    // loger.log(LogStatus.INFO, "Entered Disgnation");
     
       Thread.sleep(5000);
		System.out.println("Hi");
		} catch (Exception e) {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\sandeep.mandhala\\eclipse-workspace\\Appium_project\\screenshot.png"));
			loger.log(LogStatus.ERROR, "Found Error");
			System.out.println(e.getLocalizedMessage());
			
		 
		}

	}
	@AfterTest
	public static void tearDown() {
		reports.flush();
		reports.endTest(loger);	
		driver.quit();
	}
}












