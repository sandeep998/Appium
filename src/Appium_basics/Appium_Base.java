package Appium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/// Base 
public class Appium_Base {
		public static WebDriver driver;
	
public static  WebElement visibilityOfElement(WebDriver driver,final By locator,int time) {
		
		WebDriverWait wait=new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}

public static WebElement presenceOfElement(WebDriver driver,final By locator,int time) {
	
	WebDriverWait wait=new WebDriverWait(driver, time);
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
}

public static WebElement elementToClick(WebDriver driver,final By locator,int time) {
	
	WebDriverWait wait=new WebDriverWait(driver, time);
	return wait.until(ExpectedConditions.elementToBeClickable(locator));
	
}



}
