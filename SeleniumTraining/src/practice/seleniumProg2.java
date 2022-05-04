package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumProg2 {

	public static void main(String[] args) {
		
		String path1="X:\\java related\\addition\\SeleniumTraining\\executables\\geckodriver.exe";
		String path2=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", path2);
		FirefoxDriver cdrive=new FirefoxDriver();
		cdrive.close();
		
	}

}
