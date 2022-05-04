package selniumAssinmt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumAsgnmt5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		String getTitile=driver.getTitle();
		System.out.println("need the title = "+getTitile);
		System.out.println("getting the length of title = "+getTitile.length());
		
		System.out.println("want the url "+driver.getCurrentUrl());
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.equals("https://demosite.executeautomation.com/Login.html")) {
			System.out.println("Yes its the same Url");
		}else {
			System.out.println("No its not the Url");
		
		driver.findElement(By.cssSelector("input [name='UserName']")).sendKeys("execution");
		driver.findElement(By.cssSelector("input [name='Password']")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		
		driver.close();
		
		}

	}
}
