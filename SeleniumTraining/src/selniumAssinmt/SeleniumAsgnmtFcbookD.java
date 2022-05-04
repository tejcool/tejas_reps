package selniumAssinmt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAsgnmtFcbookD {

	public static void main(String[] args) throws Throwable {
			
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			
		driver.findElement(By.cssSelector("a[id^='u_0_2']")).click();
		List<WebElement> daylist=driver.findElements(By.cssSelector("._5k_4>span>select"));
		System.out.println("No, of spaces to be filed= "+daylist.size());
		
		for(int i=0;i<=daylist.size();i++) {
			WebElement validoptions=daylist.get(i);
			Select validoption=new Select (validoptions);
		List<WebElement> options2= validoption.getOptions();
		System.out.println("************************************");
			System.out.println(validoption.isMultiple());
			//List<WebElement> downoptions= validoption.getOptions();
			System.out.println("wanted to print options= "+options2.size());
			
		for(int l=0;l<options2.size();l++) {
				WebElement option= options2.get(l);
				System.out.println("print all options= "+option.getText());
				//System.out.println(option.isDisplayed());
				//System.out.println(option.isEnabled());
			}
			
			
		}
			
			

		}
}
