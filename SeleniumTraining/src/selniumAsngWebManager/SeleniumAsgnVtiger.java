package selniumAsngWebManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.SeleniumUtility;

public class SeleniumAsgnVtiger {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1= new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "http://vtiger-demo.it-solutions4you.com/");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		WebElement loginB = driver.findElement(By.cssSelector(".button.buttonBlue"));
		wait.until(ExpectedConditions.elementToBeClickable(loginB)).click();
		
		driver.findElement(By.xpath("//*[@id='appnavigator']/div")).click();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();
		
		
		
		
		
		
		
		

	}

}
