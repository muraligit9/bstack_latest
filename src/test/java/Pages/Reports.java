package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import pageFactory.Messagespom;
import pageFactory.Reportspom;
import pageFactory.dashbordpom;
import utils.driverutils;

public class Reports extends driverutils {

	public void dash(WebDriver driver) throws InterruptedException {
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, 50); dashbordpom
		 * dash=new dashbordpom(driver); WebElement menuclick;
		 * 
		 * 
		 * menuclick=
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//div[contains(text(),'Menu')]"))); menuclick.click();
		 */
		Thread.sleep(4000);

	}

	public void notification() {
		Reportspom rept = new Reportspom(driver);
		rept.getnotiBtn().click();
	}

	public void reportdownload() throws InterruptedException {
		Reportspom rept = new Reportspom(driver);
		rept.getWorCapbtn().click();
		Thread.sleep(3000);

		rept.getDown().click();

		Thread.sleep(5000);

		rept.getAccNodpw().click();
		Thread.sleep(2000);

		rept.getAccountckbx().click();
		Thread.sleep(2000);

		rept.getEmpare().click();
		Thread.sleep(2000);

		rept.getRolldtbtn().click();

		rept.getDurationtxt().click();
		rept.getDurationtxt().clear();
		rept.getDurationtxt().sendKeys("Current Date - 12 months");
		rept.getDurationtxt().sendKeys(Keys.ARROW_DOWN);
		rept.getDurationtxt().sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		rept.getExportbtn().click();
		Thread.sleep(5000);

		rept.getExportFbtn().click();
		Thread.sleep(5000);
		if (rept.getAccNodpw().isDisplayed()) {
			System.out.println(
					"Operating Account Statement Report for the duration \"Current Date - 12 months\" is downloaded successfully ");
		} else {
			Assert.fail(
					"Operating Account Statement Report for the duration \"Current Date - 12 months\" is not downloaded");
		}

	}

	/*
	 * public void oadReportaddcolumn() throws InterruptedException { Reportspom
	 * rept = new Reportspom(driver); rept.getWorCapbtn().click();
	 * Thread.sleep(3000); rept.getOperAccDtlstgbtn().click();
	 * 
	 * for(WebElement el:rept.getRepcollst()) { JavascriptExecutor js =
	 * (JavascriptExecutor) driver;
	 * 
	 * if(el.getText().contains("Company")&&!(el.getAttribute("title").contains(
	 * "Field already added"))) {System.out.println(el.getText());
	 * js.executeScript("window.scrollBy(0,1000)"); Actions builder = new
	 * Actions(driver); //builder.dragAndDropBy(el, 395, 280).build().perform();
	 * Thread.sleep(3000); builder.moveToElement(el).build(); //
	 * Thread.sleep(2000); js.executeScript("window.scrollBy(0,1000)"); //
	 * builder.clickAndHold(el); Thread.sleep(2000); builder.dragAndDrop(el,
	 * rept.getDropcolmArea()).build().perform(); //
	 * System.out.println(rept.getDropcolmArea().getLocation()); //
	 * builder.moveByOffset(100,1000); // builder.release().build().perform();
	 * Actions actions = new Actions(driver);
	 * 
	 * actions.moveToElement(el).build();
	 * 
	 * js.executeScript("window.scrollBy(0,1000)");
	 * actions.clickAndHold(el).moveByOffset(0,
	 * 100).moveToElement(rept.getDropcolmArea(), 0,
	 * 100).release().build().perform();
	 * 
	 * 
	 * 
	 * }else{ System.out.println("not dropp"); } } }
	 */
	
	public void dragdrop(WebElement LocatorFrom, WebElement LocatorTo) {
	    String xto=Integer.toString(LocatorTo.getLocation().x);
	    String yto=Integer.toString(LocatorTo.getLocation().y);
	    ((JavascriptExecutor)driver).executeScript("function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\"HTMLEvents\"?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\"on\"+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; " +
	    "simulate(arguments[0],\"mousedown\",0,0); simulate(arguments[0],\"mousemove\",arguments[1],arguments[2]); simulate(arguments[0],\"mouseup\",arguments[1],arguments[2]); ",
	    LocatorFrom,xto,yto);
	}
	
	private static String usingBufferedReader(String filePath) throws FileNotFoundException 
	{
	    StringBuilder contentBuilder = new StringBuilder();
	     BufferedReader br = new BufferedReader(new FileReader(filePath)); 
	    try{
	 
	        String sCurrentLine;
	        while ((sCurrentLine = br.readLine()) != null) 
	        {
	            contentBuilder.append(sCurrentLine).append("\n");
	        }
	    } 
	    catch (IOException e) 
	    {
	        e.printStackTrace();
	    }
	    return contentBuilder.toString();
	}
	
	public void oadReportaddcolumn() throws InterruptedException, AWTException, IOException {

		Reportspom rept = new Reportspom(driver);

		rept.getWorCapbtn().click();

		Thread.sleep(3000);

		rept.getOperAccDtlstgbtn().click();

		System.out.println("Drag and Drop started :");

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Actions actions = new Actions(driver);
		Actions builder = new Actions(driver);

		WebElement srcElement = driver.findElement(By.xpath(".//div[@title='Company']"));
		// js.executeScript("window.scrollBy(0,2000)");
		js.executeScript("arguments[0].scrollIntoView(true);", srcElement);

		WebElement targetElement = driver

				.findElement(By.xpath(".//h3[(text()='As At Date')]/../../../.."));
		
		String jsfile = usingBufferedReader("C:\\Users\\muralim\\Downloads\\drag_and_drop_helper.js");
		js.executeScript(jsfile+"$('#ember1993 > div > div.DragDropTable__container___3zkDW602 > div.sc-bdVaJa.hZbodf > div > div.sc-htpNat.dlYZyy > div > div.DragDropTable__dragDropContainer___GjZ3O602 > div > div > div > div > div:nth-child(9)').simulateDragDrop({ dropTarget: '#ember1993 > div > div.DragDropTable__container___3zkDW602 > div.sc-bdVaJa.hZbodf > div > div.sc-htpNat.hsMSZV > div > div > div > div:nth-child(1) > div'});");

//		js.executeScript(jsfile + "$('#["+srcElement+"]').simulateDragDrop({dropTarget: '#["+targetElement+"]'})");		
		
		
		
		

		
		
		//		WebElement drg = driver.findElement(By.cssSelector("Draggable__dragging___sA97S602"));
		 
//		Point pt = targetElement.getLocation();
//
//		    int NumberX=pt.getX();
//		    int NumberY=pt.getY();
//		
//		   	    builder.clickAndHold(srcElement)		    
//			    .moveByOffset(0, 10)
//			    .moveToElement(targetElement,0,-10)
//			    .release()
//			    .build()
//				.perform();
//		   	    builder.build();

//		actions.dragAndDrop(srcElement, targetElement).build().perform();
//		js.executeScript("$('#draggableDiv').simulate(\"drag\", {dragTarget: otherDiv});", srcElement, targetElement);
		
//		 actions.clickAndHold(srcElement).moveToElement(targetElement, -100, -10).build().perform();
//		 TimeUnit.SECONDS.sleep(20); 
//		 actions.release(targetElement).build().perform();

		// actions.build().perform();

		System.out.println("Drag and Drop completed");

	}

	public void oaSReportaddcolumn() throws InterruptedException {
		Reportspom rept = new Reportspom(driver);
		rept.getWorCapbtn().click();
		Thread.sleep(3000);
		rept.getOperAccstmtstgbtn().click();

		for (WebElement el : rept.getRepcollst()) {
			JavascriptExecutor js = (JavascriptExecutor) driver;

			if (el.getText().contains("Company") && !(el.getAttribute("title").contains("Field already added"))) {
				System.out.println(el.getText());
				js.executeScript("window.scrollBy(0,1000)");
				Actions builder = new Actions(driver);
				// builder.dragAndDropBy(el, 395, 280).build().perform();
				Thread.sleep(3000);
				builder.moveToElement(el).build();
				// Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,1000)");
				// builder.clickAndHold(el);
				Thread.sleep(2000);
				builder.dragAndDrop(el, rept.getDropcolmArea()).build().perform();
				// System.out.println(rept.getDropcolmArea().getLocation());
				// builder.moveByOffset(100,1000);
				// builder.release().build().perform();
				/*
				 * Actions actions = new Actions(driver);
				 * 
				 * actions.moveToElement(el).build();
				 * 
				 * js.executeScript("window.scrollBy(0,1000)");
				 * actions.clickAndHold(el).moveByOffset(0,
				 * 100).moveToElement(rept.getDropcolmArea(), 0,
				 * 100).release().build().perform();
				 */

			} else {
				System.out.println("not dropp");
			}
		}
	}

}
