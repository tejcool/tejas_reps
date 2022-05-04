package selniumAsngWebManager;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class mouseHandling {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://jqueryui.com/droppable/");
		
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		Actions act =new Actions(driver);
		
		WebElement uppmost= driver.findElement(By.cssSelector("div[id='draggable']"));
		
		WebElement downmost= driver.findElement(By.cssSelector("div[id='droppable']"));
		Thread.sleep(1000);

		act.dragAndDrop(uppmost, downmost).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		
	
	}

}
