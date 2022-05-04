package selniumAsngWebManager;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;
import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class hardCodeInspection {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
	    WebDriver driver=s1.setUp("chrome", "https://www.saucedemo.com/");
	    
	    List<WebElement> logincred=driver.findElements(By.className("login_credentials"));
	    List<WebElement> passwordcred=driver.findElements(By.className("login_password"));
	   for(int i=0;i<logincred.size();i++) {
	    System.out.println("print the options  "+logincred.get(i).getText());
	    String savingCred= logincred.get(i).getText();
	    String savingPawd=passwordcred.get(i).getText();
	    String[] list=savingCred.split("\n");
	    String[] list2=savingPawd.split("\n");
	    System.out.println(list[1]);
	    
	   WebElement username= driver.findElement(By.cssSelector(".input_error.form_input"));
	   username.click();
	   username.sendKeys(list[1]);
	   
	   driver.findElement(By.id("password")).sendKeys(list2[1]);
	   driver.findElement(By.id("login-button")).click();
	  
	 
	   }
	   
	   }
		
	}


