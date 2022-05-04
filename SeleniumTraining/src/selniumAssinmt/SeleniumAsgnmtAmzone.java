package selniumAssinmt;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAsgnmtAmzone {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		List<WebElement> options=driver.findElements(By.cssSelector("div[id='nav-xshop']>a"));
	
		System.out.println("count the no. of option = "+options.size());
		
		
		for(int i = 0; i<options.size();i++) {
		 
			System.out.println("getting all options = "+options.get(i).getText());
		}
			driver.close();
		}
			
			
		}
	



