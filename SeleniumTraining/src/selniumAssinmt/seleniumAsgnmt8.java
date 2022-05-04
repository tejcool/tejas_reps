package selniumAssinmt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumAsgnmt8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	 //   driver.manage().window().setSize(new Dimension(500,400));
		//String titleOfHome = driver.getTitle();
		System.out.println("title of home page= " +driver.getTitle());
		driver.findElement(By.partialLinkText("https://www.techlistic.com/p/java.html")).click();
		System.out.println("gettinf titile after clicking java button = "+driver.getTitle());
		
	}

}
