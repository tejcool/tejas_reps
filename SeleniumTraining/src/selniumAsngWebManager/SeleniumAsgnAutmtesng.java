package selniumAsngWebManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class SeleniumAsgnAutmtesng {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		
		Actions act=new Actions(driver);
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("tejas",Keys.TAB);
		
		
	}

}
