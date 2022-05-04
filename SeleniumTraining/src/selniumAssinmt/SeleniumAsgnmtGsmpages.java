package selniumAssinmt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAsgnmtGsmpages {

	public static void main(String[] args) throws Throwable {
			
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gsmarena.com/");
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			
		driver.findElement(By.cssSelector(".light>ul>li>a")).click();
		List<WebElement> pageTitles=driver.findElements(By.cssSelector(".pullNeg>div>a "));
		System.out.println("getting the no. of pages in samsung= "+pageTitles.size());
		
		for(int i=0;i<=pageTitles.size();i++) {
			
			pageTitles.get(i);
			
			System.out.println("geting title= "+driver.getTitle());
			if(i<pageTitles.size()) {
			driver.findElement(By.cssSelector(".pages-next")).click();
			}
			
		}
		driver.close();

	}
}
