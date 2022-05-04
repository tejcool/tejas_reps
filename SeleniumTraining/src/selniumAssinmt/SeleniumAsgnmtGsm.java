package selniumAssinmt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAsgnmtGsm {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gsmarena.com/");
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			
		driver.findElement(By.cssSelector(".light>ul>li>a")).click();
		List<WebElement> phnNames=driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
		System.out.println("getting the no. of samsung mobiles= "+phnNames.size());
		
		for(int i=0;i<phnNames.size();i++) {
			System.out.println("Names of the samsung phones= "+phnNames.get(i).getText());
		}
		driver.close();

	}
}