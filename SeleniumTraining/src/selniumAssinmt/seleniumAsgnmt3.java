package selniumAssinmt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumAsgnmt3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		System.out.println("Want to get title of the page - "+driver.getTitle());
		
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("Yes we have got the right page");
		}else {
			System.out.println("No we have not got the right page");
		}
        driver.close();
	}

}
