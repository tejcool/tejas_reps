package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmMobiles {
			public static void main(String[] args) {
				
			String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
				//step1: set driver executable path by using System.setProperty(String key,String value)
			System.setProperty("webdriver.chrome.driver", driverPath);
				//step2: create an instance of Chrome Browser
			WebDriver driver = new ChromeDriver();
				//maximize the browser window
			driver.manage().window().maximize();
			 	//implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			driver.get("https://www.gsmarena.com/");
				//Identify all the link from main menu using findElements(By)
			List<WebElement> allOptions=driver.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li"));
			System.out.println("want to know size = "+allOptions.size());
			for(int i=0;i<allOptions.size();i++) {
				System.out.println("show all elements = "+allOptions.get(i).getText());
			
			driver.close();
			}
	}

}
