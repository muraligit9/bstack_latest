package pageFactory; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.driverutils;



public class Messagespom  extends driverutils {  

  @FindBy(how = How.XPATH, using = "//p[text()='Messages']")  
  private WebElement MsgBtn;	 

  @FindBy(how = How.XPATH, using = "//span[@class='alert-badge']")  
  private WebElement Msgunrdpop;
  @FindBy(how = How.XPATH, using = "//span[@class='sc-scb-53-filter custom-position']")  
  private WebElement filter;
  @FindBy(how = How.XPATH, using = "//div[@class='cp-Panels ember-view']/child::div[1]/a/span")  
  private WebElement revbtn;
  @FindBy(how = How.XPATH, using = "//label[contains(text(),'FROM')]/following::div/div/div/input")  
  private WebElement fromcal;
  @FindBy(how = How.XPATH, using = "//label[contains(text(),'FROM')]/following::div/div/div/span[1]")  
  private WebElement fromico;
  @FindBy(how = How.XPATH, using = "//label[contains(text(),'TO')]/following::div/div/div/input")  
  private WebElement tocal;
  @FindBy(how = How.XPATH, using = "//label[contains(text(),'TO')]/following::div/div/div/span[1]")  
  private WebElement toico;

  @FindBy(how = How.XPATH, using = "//button[@class='s2b-button-primary  filters-action']")  
  private WebElement applybtn;
  
  @FindBy(how = How.XPATH, using = "//li[@class='message-row  message-row--selected ']/child::div/div/div[1]/div[3]/label")  
  private WebElement fstMsgbdy;
  
  @FindBy(how = How.XPATH, using = "//li[@class='message-row  message-row--selected ']/child::div/div/div[1]/div[1]")  
  private WebElement fstMsgbdydt;

  @FindBy(how = How.XPATH, using = "//div[@class='s2b-label--medium ember-view']/child::label")  
  private WebElement fstMsgbdyac;
  
  @FindBy(how = How.XPATH, using = "//span[@class='sc-scb-31-list']")  
  private WebElement mulSel;
  @FindBy(how = How.XPATH, using = "//div[@class='select-all']")  
  private WebElement selAll;
  @FindBy(how = How.XPATH, using = "//span[text()='Actions']")  
  private WebElement action;
  @FindBy(how = How.XPATH, using = "//p[text()='Mark as unread']")  
  private WebElement markunread;
  


  
  public Messagespom(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
  
  public WebElement getMsgBtn() {
	return MsgBtn; 
  }
  
  public WebElement getMsgunrdpop() {
	return Msgunrdpop;
  }
  public WebElement getFilter() {
		return filter;
	  }
  public WebElement getRevbtn() {
		return revbtn;
	  }

  public WebElement getFromcal() {
		return fromcal;
	  }
  public WebElement getFromico() {
		return fromico;
	  }
  public WebElement getTocal() {
		return tocal;
	  }
  public WebElement getToico() {
		return toico;
	  }
  public WebElement getApplybtn() {
		return applybtn;
	  }
  public WebElement getFstMsgbdy() {
		return fstMsgbdy;
	  }
  public WebElement getFstMsgbdydt() {
		return fstMsgbdydt;
	  }
  
  
  
  public WebElement getFstMsgbdyac() {
		return fstMsgbdyac;
	  }
  public WebElement getMulSel() {
		return mulSel;
	  }
  public WebElement getSelAll() {
		return selAll;
	  }
  
  public WebElement getAction() {
		return action;
	  }
  public WebElement getMarkunread() {
		return markunread;
	  }
  

  
    
}