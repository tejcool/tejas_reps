package selniumAssinmt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelenuimAsgnmtFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		String actualTitle=driver.getTitle();
		System.out.println("get title of home page= "+actualTitle);
		if(actualTitle.equals(driver.getTitle())) {
			System.out.println("Yes, both are same");
		}
		
		List<WebElement> options=driver.findElements(By.cssSelector("._37M3Pb>div>a"));
		System.out.println("find the size of the options= "+options.size());
		
		for(int i=0;i<options.size();i++) {
			System.out.println("geting all options in console= "+options.get(i).getText());
		}
		driver.close();
	}

}
