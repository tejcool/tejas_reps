package selniumAssinmt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumAsgnmt {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		// we r giving path to open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");// with this we will get google page
		
		
		System.out.println("would like to print title of page  "+driver.getTitle() ); //method for getting title
		System.out.println("want the current url of the page  "+driver.getCurrentUrl()); //method to know url
		System.out.println("want the sorce code  "+driver.getPageSource()); //method to get source
		
		String sourcecode= driver.getPageSource();
		System.out.println("want lenght of the sorcecode "+sourcecode.length());
		driver.close();
		
	}

}
