package webDriverManagerPgms;

import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtility;

public class practiceUtility {

	public static void main(String[] args) {

		SeleniumUtility utility=new SeleniumUtility();
	WebDriver driver=	utility.setUp("chrome", "https://www.amazon.in/");
	
	}

}
