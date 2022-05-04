package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingofValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		String title=driver.getTitle();
		System.out.println("want to get title  - "+title);
		//System.out.println("want to get title length -"+title.length());// method to get length of title

		WebElement knowFunctionLoginButton=driver.findElement(By.id("username"));
		System.out.println("know it is displayed or not= "+knowFunctionLoginButton.isDisplayed());
		System.out.println("know it is editable or not= "+knowFunctionLoginButton.isEnabled());
		knowFunctionLoginButton.sendKeys("admin");
		
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton")).click();
		
		WebElement knowcheckbox =driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("know check box is displayed or not= "+knowFunctionLoginButton.isDisplayed());
		System.out.println("know check box is editable or not= "+knowFunctionLoginButton.isEnabled());
		knowcheckbox.click();
		
		driver.navigate().back();
	    driver.close();
	}

}


	