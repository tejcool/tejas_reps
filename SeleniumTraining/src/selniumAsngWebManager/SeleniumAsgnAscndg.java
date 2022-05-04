package selniumAsngWebManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class SeleniumAsgnAscndg {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://jqueryui.com/sortable/");
		
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		Actions act=new Actions(driver);
		
		WebElement uppmost=driver.findElement(By.xpath("//li[text()='Item 1']"));
		for(int i=0;i<7;i++) {
			
			
			Thread.sleep(2000);
			WebElement constant=driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"));
			act.dragAndDrop(constant, uppmost).build().perform();
					
			
		}
	}

}
