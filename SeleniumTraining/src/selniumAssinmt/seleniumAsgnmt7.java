package selniumAssinmt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumAsgnmt7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	 //   driver.manage().window().setSize(new Dimension(500,400));
		String titleOfHome=driver.getTitle();
	    System.out.println("want to know the title= "+driver.getTitle());

	    driver.findElement(By.linkText("Amazon Pay")).click();
	    System.out.println("want to know the title after Amazon Pay= "+driver.getTitle());
	    driver.navigate().back();
	    String titleafterpay=driver.getTitle();
	    if(titleafterpay.equals(titleOfHome)) {
	    	System.out.println("Yes the title is same as the previous one");
	    }else {
	    	System.out.println("No the title is not same as the previous one");
	    }
	    driver.close();
	    
	}

}
