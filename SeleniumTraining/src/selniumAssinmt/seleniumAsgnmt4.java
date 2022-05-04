package selniumAssinmt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumAsgnmt4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println("getting title=   "+driver.getTitle());
		
		String actual= driver.getTitle();
		
		if(actual.contentEquals("actiTIME - Login")) {
			System.out.println("Yes the title is same  ");
		}else {
			System.out.println("No it is not same");
		}
		
//		WebElement findusername =driver.findElement(By.id("username"));
//		findusername.sendKeys("admin");
//		              //or
		driver.findElement(By.id("username")).sendKeys("admin");
		
		
//		WebElement findpassword =driver.findElement(By.name("pwd"));
//		findpassword.sendKeys("manager");
		             //or
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
//		WebElement loginbutton =driver.findElement(By.id("loginButton"));
//		loginbutton.click();
					//or
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElements(By.id("logoutLink"));
		
		System.out.println("getting title after login=  "+driver.getTitle());
		String titleafterlogn =driver.getTitle();
		
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		wait.until(ExpectedCondition.elementsToBeClickable(logoutLink));
		
		if(titleafterlogn.equals("actiTIME - Enter Time-Track")) {
			System.out.println("Yes its the title after login");
			driver.findElement(By.id("logoutLink")).click();
			
		}else {
			System.out.println("No it is not the title");
		}
		if(driver.findElement(By.id("username")) != null) {
			System.out.println("ready to close");
		}
		driver.close();
			

	}

}
