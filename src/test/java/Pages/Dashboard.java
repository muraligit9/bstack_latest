package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.dashbordpom;

public class Dashboard   {
	
	public void dash(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 50);
		dashbordpom dash=new dashbordpom(driver);
		WebElement menuclick;
				
		
		menuclick= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Menu')]")));
		menuclick.click();
		Thread.sleep(4000);
		
		
	}
  
}
