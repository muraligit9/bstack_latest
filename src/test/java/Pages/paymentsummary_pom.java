package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentsummary_pom 
{
	public WebDriver d;

	public paymentsummary_pom(WebDriver d) 
	{
		this.d=d;
		PageFactory.initElements(d, this);
	}

	@FindBy(xpath="//label[.='YOUR REFERENCE']/../following-sibling::div//label[contains(.,*)]")
	WebElement your_ref;
	
	@FindBy(xpath="//label[.='PAYMENT REFERENCE']/../following-sibling::div//label[contains(.,*)]")
	WebElement payment_ref;
	
	@FindBy(xpath="//label[.='UETR Number']/../following-sibling::div//label")
	WebElement uetr_number;
	
	@FindBy(xpath="//label[.='PAY FROM']/../following-sibling::div//label")
	WebElement pay_from;
	
	@FindBy(xpath="//label[.='PAY TO']/../following-sibling::div//label")
	WebElement pay_to;
	
	@FindBy(xpath="//label[.='DEBIT AMOUNT']/../following-sibling::div//label")
	WebElement debit_amount;
	
	@FindBy(xpath="//label[.='PAYMENT TYPE']/../following-sibling::div//label")
	WebElement payment_type;
}
