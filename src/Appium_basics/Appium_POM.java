package Appium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Appium_POM extends Appium_Base{
	WebDriver driver;
	public Appium_POM(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public static final	By mobile_number = By.xpath("//android.widget.EditText[@index = '5']");
	public static final By get_otp = By.xpath("//android.widget.ImageView[@index = '0']");
	
	public static final By otp_has_beensent=By.xpath("//android.view.ViewGroup[@index = '0']");
	public static final By onetimeotp = By.xpath("//android.widget.EditText[@index = '1']");
	public static final By verifybutton = By.xpath("//android.widget.ImageView[@index = '0']");
	public static final By first_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	
	public static final By last_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	public static final By Email = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");
	public static final By Done = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView");
	
	public static final By now = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
	
	//public static final By personal = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]");
	
	
	//public static final By business=By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	public static final By comapny_name=By.xpath("//android.widget.EditText[@index = '0']");
	public static final By disgnation =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.EditText");
	
	
	public static void  mobileNumberClick(WebDriver driver) {                                                                                                                                                                                                                     
		visibilityOfElement(driver, mobile_number, 60);
		driver.findElement(mobile_number).click();
		
	}
	public void  mobileNumberSend(WebDriver driver,String sen) {
		visibilityOfElement(driver, mobile_number, 60);
		driver.findElement(mobile_number).sendKeys(sen);
		
	}
	public void  getOtp(WebDriver driver) {
		visibilityOfElement(driver, get_otp, 60);
		driver.findElement(get_otp).click();
		
	}
	

	public void  popupOtp(WebDriver driver) {
		visibilityOfElement(driver, otp_has_beensent, 60);
		driver.findElement(otp_has_beensent).click();
		
	}
	
	public void  oneTimePass(WebDriver driver) {
		visibilityOfElement(driver, onetimeotp, 60);
		driver.findElement(onetimeotp).click();
		
	}
	public void  oneTimePassAgain(WebDriver driver,String on) {
		visibilityOfElement(driver, onetimeotp, 60);
		driver.findElement(onetimeotp).sendKeys(on);
		
	}
	public void  verifyButton1(WebDriver driver) {
		visibilityOfElement(driver, verifybutton, 60);
		WebElement web=	driver.findElement(verifybutton);
		web.click();
		/*Actions act=new Actions(driver);
		act.doubleClick(web);
	*/
	
		
	}
	public  void  firstName(WebDriver driver,String first) {
		visibilityOfElement(driver, first_name, 60);
		driver.findElement(first_name).sendKeys(first);
		
	}
	public void  lastName(WebDriver driver,String last) {
		visibilityOfElement(driver, last_name, 60);
		driver.findElement(last_name).sendKeys(last);
		
	}
	public void  emaiL(WebDriver driver,String email1) {
		visibilityOfElement(driver, Email, 60);
		driver.findElement(Email).sendKeys(email1);
		
	}
	public void  Done(WebDriver driver) {
		visibilityOfElement(driver, Done, 60);
		driver.findElement(Done).click();
		
	}
	public void  successPopup(WebDriver driver) {
		visibilityOfElement(driver, now, 60);
		driver.findElement(now).click();
		
	}
	// for personal and business in main screen
	/*public void  perSonall111(WebDriver driver) {
		visibilityOfElement(driver, personal, 60);
		driver.findElement(personal).click();
		
	}
	public void  busiNess1111(WebDriver driver) {
		visibilityOfElement(driver, bussiness, 60);
		driver.findElement(bussiness).click();
		
	}*/
	
	public void  com(WebDriver driver) {
		visibilityOfElement(driver, comapny_name, 60);
		driver.findElement(comapny_name).click();
		
	}
	public void  comName(WebDriver driver,String name) {
		visibilityOfElement(driver, comapny_name, 60);
		driver.findElement(comapny_name).sendKeys(name);
		
	}
	public void  comDisgnation(WebDriver driver,String name1) {
		visibilityOfElement(driver, disgnation, 60);
		driver.findElement(disgnation).sendKeys(name1);
		
	}
}















