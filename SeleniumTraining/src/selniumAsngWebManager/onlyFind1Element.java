package selniumAsngWebManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class onlyFind1Element {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		
		WebElement first =driver.findElement(By.xpath("//input[@id='username']"));
		first.sendKeys("admin",Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		
		
		

	}

}
