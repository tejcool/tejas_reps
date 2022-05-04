package selniumAssinmt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelenuimAsgnmtEspnCric {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String actualTitle=driver.getTitle();
		System.out.println("get title of home page= "+actualTitle);
		
		List<WebElement> menuoption=driver.findElements(By.cssSelector(".ds-flex.ds-items-center.ds-justify-between.ds-flex-1>div>div>a"));
		System.out.println("want to know the count of menu= "+menuoption.size());
		
		for(int i=0;i<menuoption.size();i++) {
			System.out.println("getting all menu on console= "+menuoption.get(i).getText());
		}
		driver.close();
	}
}
