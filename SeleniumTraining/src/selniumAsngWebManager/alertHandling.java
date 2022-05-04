package selniumAsngWebManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class alertHandling {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demoqa.com/alerts");
		
		driver.findElement(By.cssSelector("#alertButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("promtButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("go to** ");
		driver.switchTo().alert().accept();


	}

}
