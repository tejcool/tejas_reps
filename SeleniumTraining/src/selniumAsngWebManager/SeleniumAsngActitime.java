package selniumAsngWebManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.SeleniumUtility;

public class SeleniumAsngActitime {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector(".textFieldsTable>tbody>tr>td>input")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		driver.findElement(By.id("container_tasks")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.cssSelector(".item.createNewTasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#closeCreateTasksPopupButton"));
		driver.findElement(By.cssSelector("#createTasksPopup_content>div>div>div>div>div>table>tbody>tr>td>div>div>div>div.dropdownButton")).click();
		List<WebElement> options1=driver.findElements(By.cssSelector(".innerContent>div>div>table>tbody>tr>td>div>div>div.scrollableDropdownView>div>div>div>div"));
		System.out.println("first box elemnts size= "+options1.size());
		for(int i=0;i<options1.size();i++) {
			WebElement select1=options1.get(i);
			String textoption1=select1.getText();
			if(textoption1.equalsIgnoreCase("big bang company")) {
				select1.click();
		break;	}

		}
		
	//	WebDriverWait wait1=new WebDriverWait(driver,20);
		
		driver.findElement(By.cssSelector(".selectCustomerAndProject>table>tbody>tr.selectProjectRow.projectSelectorRow>td>div>div>div>div.dropdownButton")).click();
		List<WebElement> options2=driver.findElements(By.cssSelector(".selectProjectRow.projectSelectorRow>td>div>div>div.scrollableDropdownView>div>div>div>div"));
		System.out.println("size of the option= "+options2.size());
		for(int i=0;i<options2.size();i++) {
			WebElement select=options2.get(i);
			String textoption2=select.getText();
			if(textoption2.equalsIgnoreCase("Spaceship testing")) {
				select.click();
		break;	}
		}
		driver.findElement(By.cssSelector(".nameCell.first>input")).sendKeys("Testing");
		driver.findElement(By.cssSelector(".x-btn-center")).click();
		//driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.cssSelector(".x-date-active:nth-child(2):nth-of-type(2)")).click();
		driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr>td.billingTypeCell>div[title='engineering']>div")).click();
		
		List<WebElement> engineering =driver.findElements(By.cssSelector(".taskTableContainer>table>tbody>tr>.billingTypeCell>div>div>div>div>div>.typeOfWorkRow"));
		System.out.println("options in engineering= "+engineering.size());
		for(int i=0;i<engineering.size();i++) {
			WebElement options3=engineering.get(i);
			String engineer=options3.getText();
			if(engineer.equalsIgnoreCase("testing")) {
				options3.click();
			break;}
		}
		driver.findElement(By.cssSelector(".basicLightboxFooter>.buttonsBox>div>div")).click();
		driver.findElement(By.cssSelector(".createdTasksRowsTable>tbody>tr>td>div>div")).click();
		List<WebElement> identify =driver.findElements(By.cssSelector(".createdTasksRowsTable>tbody>tr>td"));
		for(int i=0;i<identify.size();i++) {
			WebElement select=identify.get(i);
			String textoption2=select.getText();
			if(textoption2.equalsIgnoreCase("testing")) {
				System.out.println("Yess, it has testing option in it ");
				
			break;}
		}
		WebDriverWait wait =new WebDriverWait(driver, 20);
		WebElement delete=driver.findElement(By.cssSelector(".delete.button"));
		wait.until(ExpectedConditions.elementToBeClickable(delete));
		delete.click();
		driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[2]/div[2]/div[1]/div[1]/div/div[5]/div[1]/div/span")).click();
		
		List<WebElement> identify2 =driver.findElements(By.cssSelector(".createdTasksRowsTable>tbody>tr>td"));
		for(int i=0;i<identify2.size();i++) {
			WebElement select=identify2.get(i);
			String textoption2=select.getText();
			if(textoption2.equalsIgnoreCase("testing")) {
				System.out.println("Yess, testing option  is present ");
				
			}else {
				System.out.println("yess testing is been deleted");
			break;}
		}
		
	}

}
