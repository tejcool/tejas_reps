package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProg3 {

	public static void main(String[] args) {
		
		String chromedrive=System.getProperty("user.dir")+ ".\\executables\\chromedriver.exe";

		openBrowser(chromedrive,"chrome");
	}
	
	static void openBrowser(String driverpath, String browserpath) {
		
		if(browserpath.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", driverpath);
			WebDriver driver=new ChromeDriver();
		
	}
}
}