package selniumAsngWebManager; 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class withMouseKeybrd {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
	    WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
	    
	    Actions act=new Actions(driver);
	    
	    WebElement copyElmt=driver.findElement(By.cssSelector("#demoCredentials>tbody>tr>:nth-child(2)>b"));
	    act.moveToElement(copyElmt).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	    
	    WebElement copyname =   driver.findElement(By.cssSelector("input[class='textField']"));	
	    act.moveToElement(copyname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();;
        
	    WebElement copyElmt2=driver.findElement(By.xpath("//*[@id='demoCredentials']/tbody/tr[2]/td/b"));
	    act.moveToElement(copyElmt2).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	
	    WebElement copyname2 = driver.findElement(By.cssSelector(".textField.pwdfield"));
	   act.moveToElement(copyname2).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	    //act.click(copyname2).sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
	    driver.findElement(By.id("loginButton")).click();
	}

}
