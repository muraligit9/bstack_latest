package Pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.Messagespom;
import utils.driverutils;

public class Messages extends driverutils {
	public static int msgct = 0;
	public static int msgctafter = 0;
	

	public void messagebtn() throws InterruptedException {
		Messagespom msg = new Messagespom(driver);
		Thread.sleep(4000);
		msg.getMsgBtn().click();
	}

	public void messagecount() throws InterruptedException {
		Messagespom msg = new Messagespom(driver);
		Thread.sleep(4000);
		if (msg.getMsgunrdpop().isDisplayed()) {
			String messagecount = msg.getMsgunrdpop().getText();
			msgct = Integer.parseInt(messagecount);
			//System.out.println(msgct);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} else {
			System.out.println("No unread messages Remaining");
			//Assert.fail("No unread messages Remaining");
		}

	}
	
	public void messagecountVal() {
		Messagespom msg = new Messagespom(driver);
		
		
		try {
			String messagecount = msg.getMsgunrdpop().getText();
			msgctafter = Integer.parseInt(messagecount);
			System.out.println(msgct);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			
		} catch (Exception e) {
			System.out.println("No unread messages Remaining");
		}
		if((msgctafter<msgct))
		{
			System.out.println("Message count before read: "+msgct);
			System.out.println("Message count after read: "+msgctafter);
			System.out.println("New message count is updated ");
		}else{
			System.out.println("Message count before read: "+msgct);
			System.out.println("Message count after read: "+msgctafter);
			System.out.println("Message count is not displayed as expected ");
		}

	}
	

	public void messagefilter() throws InterruptedException {
		Messagespom msg = new Messagespom(driver);
		msg.getFilter().click();
		Thread.sleep(5000);
		msg.getRevbtn().click();
		Thread.sleep(2000);
		msg.getFromcal().sendKeys("14/11/2019");
		//msg.getFromico().click();
		Thread.sleep(2000);
		msg.getTocal().sendKeys("14/11/2019");
		//msg.getToico().click();
		Thread.sleep(5000);
		msg.getApplybtn().click();
		String date=msg.getFstMsgbdydt().getText();
		System.out.println(date);
		if(date.contains("14/11/2019"))
		{
			System.out.println("Message displayed  for the filtered date "+date);
		}else
		{
			System.out.println("Message not displayed for the filtered date"+date);
			Assert.fail("Message not displayed for the filtered date"+date);
		}
		

	}
	
	public void readmessage()
	{
		Messagespom msg = new Messagespom(driver);
		String msgbdyheader=msg.getFstMsgbdy().getText();
		String msgbdy=msg.getFstMsgbdyac().getText();
		
		//System.out.println(msgbdy);
        //System.out.println(msgbdyheader);
        
        if(msgbdyheader.contains(msgbdy))
        {
        	System.out.println("Selected message displayed properly");
        }else{
        	Assert.fail("Selected message not displayed as expected");
        }
	}
	
	public void countreset() throws InterruptedException
	{
		Messagespom msg = new Messagespom(driver);
		Thread.sleep(5000);
		msg.getMulSel().click();
		Thread.sleep(3000);
		msg.getSelAll().click();
		Thread.sleep(3000);
		msg.getAction().click();
		Thread.sleep(3000);
		msg.getMarkunread().click();
		Thread.sleep(3000);
		
	}

}
