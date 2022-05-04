package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumByfirefox {

		public static void main(String[] args) {
			String path1="X:\\java related\\addition\\SeleniumTraining\\executables\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",path1);
			
			WebDriver driver=new FirefoxDriver();
			driver.get("https://demo.actitime.com");
			
			String title=driver.getTitle();
			System.out.println("want to get title  - "+title);
			System.out.println("want to get title length -"+title.length());// method to get length of title

			driver.getCurrentUrl();
			System.out.println("want to know the url - "+driver.getCurrentUrl());
			
			if(driver.getTitle().equals("actiTIME - Login")) {
				System.out.println("Yes, we have opened the correct link ");
			}
			else{
				System.out.println("No, we have not opened the right link");
			}
			String sourcecode=driver.getPageSource();
			System.out.println("want to get source  "+sourcecode);
			System.out.println("want to get source length "+sourcecode.length());
			
		    driver.close();
		}

	}


