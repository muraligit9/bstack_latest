package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class menupage_pom 
{
	public WebDriver d;
   public menupage_pom(WebDriver d)
   {
	   this.d=d;
	   PageFactory.initElements(d, this);
   }
   
   @FindBy(xpath="//div[contains(text(),'Menu')]")
   public WebElement Menu_tab;
   
   @FindBy(xpath="//label[contains(.,'Cash')]")
   public WebElement Cash_tab;
   
   @FindBy(xpath="//label[contains(.,'Manage')]")
   public WebElement manage_tab;
   
   @FindBy(xpath="//label[text()='Transactions']")
   public WebElement Transactions_tab;
   
   @FindBy(xpath="//div[contains(@class,'ReactVirtualized__Table__Grid')]")
   public WebElement payments_table;
   
   public By payments_table_locator=By.xpath("//div[contains(@class,'ReactVirtualized__Table__Grid')]");
   
   @FindBy(xpath="//div[contains(@class,'PaymentRefNo__RefCard-lbIgNx')]")
   public WebElement first_payment_link;
   
   public By first_payment_link_locator=By.xpath("//div[contains(@class,'PaymentRefNo__RefCard-lbIgNx')]");
   
   @FindBy(xpath="//div[@class='orbit-container']//span[contains(@class,'skip-arrow')]")
   public WebElement arrow_button;
   
   public By skip_arrow_locator=By.xpath("//div[@class='orbit-container']//span[contains(@class,'skip-arrow')]");
   
   @FindBy(xpath="//div[@class='orbit-container']//span[contains(@class,'close-icon-right')]")
   public WebElement close_button;
   
   public By close_button_locator=By.xpath("//div[@class='orbit-container']//span[contains(@class,'close-icon-right')]");
   
   public By loading_xpath=By.xpath("//label[text()='Loading... Please wait...']");
   
   
}
