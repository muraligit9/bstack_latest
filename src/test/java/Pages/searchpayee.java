package Pages;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import utils.driverutils;


public class searchpayee extends driverutils{  
		
		@FindBy(how = How.XPATH, using = "//label[@for='userid_email-name']/parent::div/input")
		private WebElement UserID;

		@FindBy(how = How.XPATH, using = "//label[@for='group_id-name']/parent::div/input")
		private WebElement GroupID;

		@FindBy(how = How.XPATH, using = "//label[text()='Remember me']")
		private WebElement RemCk;

		@FindBy(how = How.XPATH, using = "//p[text()='CONTINUE']")
		private WebElement ContBtn;

		@FindBy(how = How.XPATH, using = "//label[@for='unified_password-name']/parent::div/input")
		private WebElement Password;

		@FindBy(how = How.XPATH, using = "//p[text()='LOGIN']")
		private WebElement Loginbtn;
	   
	  @FindBy(how = How.XPATH, using = "//span[text()='NEW UAT USER']")  
	  private WebElement VerifyuserID;
	  
	  @FindBy(how = How.XPATH, using = "//div[text()='Menu']")  
	  private WebElement Menuoptn;	 

	  @FindBy(how = How.XPATH, using = "//html/body/div[2]/div/div/div/aside/div/div/ul/li[2]/a/div/label/span/img")  
	  private WebElement Cashoptn;	 

	  @FindBy(how = How.XPATH, using = "//label[text()='Create']")  
	  private WebElement Createoptn;	 

	 @FindBy(how = How.XPATH, using = "//label[text()='Fund Transfer']")  
	  private WebElement Fundtransfersoptn;
	 
	 @FindBy(how = How.XPATH, using = "//input[@placeholder= 'Choose a debit account']")  
	 private WebElement searchfield;
	 
	 @FindBy(how = How.XPATH, using = "//div[text()='G CO LTD-0101295650-SGD-Name1 bo name-SCBLSGSGXXX-SG']")  
	 private WebElement Searchedtextresult;
	  	 
	 @FindBy(how = How.XPATH, using = "//span[text() = 'SELF']")  
	  private WebElement Paymentmethod;	
	 
	 @FindBy(how = How.XPATH, using = "//input[@placeholder = 'Choose a payee']")
	 private WebElement payeechose;	
	 
	 @FindBy(how = How.XPATH, using = "//div[text() = 'PG CO L-NO 2 AC-SCBLSGSGXXX--SG-SGD']")
	 private WebElement payee;	
	 
	  @FindBy(how = How.XPATH, using = "//input[@placeholder='Pay Recipient']")  
	  private WebElement Payamount;	 

	  @FindBy(how = How.XPATH, using = "//html/body/div[2]/div/div/div/section/main/section/div[2]/div[2]/div[4]/div/div/div/div/div/div[2]/div/div/div[2]/div")  
	  private WebElement Outsideclick;
	  

	  @FindBy(how = How.XPATH, using = "//html/body/div[2]/div/div/div/section/main/section/div[2]/div[2]/div[8]/div/div/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div/div/span")  
	  private WebElement Invoicedownarrow;	 
	  
	  @FindBy(how = How.XPATH, using = "//input[@placeholder = 'Select Invoice Type']")  
	  private WebElement invoicetp;

	  @FindBy(how = How.XPATH, using = "//div[text()='2 Column Invoice']")  
	  private WebElement Invoicetype;	 

	  @FindBy(how = How.XPATH, using = "//p[text()='CONTINUE']")  
	  private WebElement Continuebtn;	 
	  
	  @FindBy(how = How.XPATH, using = "//p[text()='Submit']")  
	  private WebElement Submitbtn;	 

	  @FindBy(how = How.XPATH, using = "//p[text()='Your payment has been submitted successfully']")  
	  private WebElement Txtverification;
	 
	 @FindBy(how = How.XPATH, using = "//div[text()='//p[text()='Logout']']")  
	 private WebElement Logout;
	  
	  public WebElement getUserID() {
			return UserID;
		}

		public WebElement getGroupID() {
			return GroupID;
		}

		public WebElement getRemCk() {
			return RemCk;
		}

		public WebElement getContBtn() {
			return ContBtn;
		}

		public WebElement getPassword() {
			return Password;
		}

		public WebElement getLoginbtn() {
			return Loginbtn;
		}

	  public WebElement getVerifyuserID() {
			return VerifyuserID;
		  }
	  public WebElement getMenuoptn() {
			return Menuoptn;
		  }
		  
		  public WebElement getCashoptn() {
			return Cashoptn;
		  }
		  
		  public WebElement getCreateoptn() {
			return Createoptn;
		  }
		  
		  public WebElement getFundtransfersoptn() {
			return Fundtransfersoptn;
		  }
		  
		  public WebElement getsearchfield() {
				return searchfield;
			}
		  public WebElement getSearchedtextresult() {
				return Searchedtextresult;
			  }
		  
		  public WebElement getPaymentmethod() {
				return Paymentmethod;
				
			  }
		  
		  public WebElement payeechose() {
				return payeechose;
				
			  }
		  
		  public WebElement payee() {
				return payee;
				
			  }		  
		  
			  
			  public WebElement getPayamount() {
				return Payamount;
			  }
			  
			  public WebElement getOutsideclick() {
				return Outsideclick;
			  }
			  

			  public WebElement getInvoicedownarrow() {
				return Invoicedownarrow;
			  }
			  
			  public WebElement getinvoicetp() {
					return invoicetp;
				  }
			  
			  public WebElement getInvoicetype() {
				return Invoicetype;
			  }
			  
			  
			  public WebElement getContinuebtn() {
				return Continuebtn;
			  }
			  
			  public WebElement getSubmitbtn() {
				return Submitbtn;
			  }
			  
			  public WebElement getTxtverification() {
				return Txtverification;
			  }
			  
			  public WebElement getLogout() {
				return Logout;
			  }
	  public searchpayee(WebDriver driver){
			PageFactory.initElements(driver, this);
		  }
	 	  
	     
	  /*public void enterlogincredentials() throws InterruptedException {
		  
		  searchpayee obj = new searchpayee(driver);
		  
		  obj.getUserID().sendKeys("user000015");
			obj.getGroupID().sendKeys("uatsgee1");
			obj.getRemCk().click();
			obj.getContBtn().click();
			obj.getPassword().sendKeys("dummyaaaa");
			obj.getLoginbtn().click();
			Thread.sleep(20000);
	  }*/
	    
	  public void verifylogin() throws InterruptedException {
		  searchpayee obj2 = new searchpayee(driver);
		  obj2.VerifyuserID.getText();
		  driver.getTitle();
	  }
	  
	  public void navigateFundtransfers() throws Throwable {
		  searchpayee obj3 = new searchpayee(driver);
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click()", obj3.Menuoptn);
		    Thread.sleep(2000);
		  obj3.Cashoptn.click();
		  obj3.Createoptn.click();
		  obj3.Fundtransfersoptn.click();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  
	  public void searchpaye() throws InterruptedException {
		  searchpayee obj4 = new searchpayee(driver);
		  obj4.searchfield.sendKeys("shp");
		  Thread.sleep(2000);
		 obj4.Searchedtextresult.click();
		  
		  
	  }
	  
	  public void logout() {
		  searchpayee obj5 = new searchpayee(driver);
		  obj5.Logout.click();
	  }
	  
	  public void invoiceselect() throws InterruptedException {
		  searchpayee obj4 = new searchpayee(driver);
		  Thread.sleep(2000);
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click()", obj4.Paymentmethod);
		    
		    JavascriptExecutor js1=(JavascriptExecutor)driver;
		    js1.executeScript("arguments[0].click()", obj4.payeechose);
		    
		    obj4.payeechose.sendKeys("shp");
		    obj4.payee.click();
		  obj4.Payamount.sendKeys("2000");
		  obj4.Outsideclick.click();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  JavascriptExecutor js2=(JavascriptExecutor)driver;
		    js2.executeScript("arguments[0].click()", obj4.invoicetp);
		  
		  obj4.invoicetp.sendKeys(Keys.DOWN, Keys.ENTER);
		  JavascriptExecutor js3=(JavascriptExecutor)driver;
		    js3.executeScript("arguments[0].click()", obj4.Continuebtn);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  obj4.Submitbtn.click();
		  Thread.sleep(2000);
		  		  
	  }
	  
	 
	public void verifypayment() {
		  searchpayee obj4 = new searchpayee(driver);
		   String title = obj4.Txtverification.getText();
		   Assert.assertEquals(title,"YOUR PAYMENT HAS BEEN SUBMITTED SUCCESSFULLY");
		  
		  
	  }
	  

}
