package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumProgrm1 {
  // just to open the browser
	public static void main(String[] args) {
		
		String path1="X:\\java related\\addition\\SeleniumTraining\\executables\\chromedriver.exe";
		String path2=".\\executables\\chromedriver.exe";
		String path3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",path3);
		
		ChromeDriver cdriver=new ChromeDriver();
		
	}

}
