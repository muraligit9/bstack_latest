package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class payments_transactions_page_pom 
{
	public WebDriver d;

	public payments_transactions_page_pom(WebDriver d) 
	{
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
	public void actionClick(WebElement e) {
		Actions a = new Actions(d);
		a.moveToElement(e).perform();
	}
	
	public By sortbutton_without_sorting=By.xpath("//span[contains(@class,'13k2sdk') and contains(@class,'sort')]");
	
	public By sortbutton_after_sorting=By.xpath("//span[@class='css-13k2sdk']/child::*");
	

	@FindBy(xpath="//span[@class='css-13k2sdk']/child::*")
	public WebElement sortbutton_after_sorting_element;
	
	@FindBy(xpath="//div[contains(@class,'ListTablesstyles__ContentContainer-eZbvQv') and contains(@class,'anvBj')]/div/span")
	public WebElement amount_first_row;
	
	@FindBy(xpath="//div[contains(@class,'PaymentRefNo__RefCard-lbIgNx') and contains(@class,'eOoDqt')]/span")
	public WebElement payment_ref_first_row;
	
	@FindBy(xpath="//div[contains(@class,'ListTablesstyles__ContentContainer-eZbvQv') and contains(@class,'anvBj')]/preceding::div[@aria-colindex='4']/preceding-sibling::div[2]//div[contains(@class,'ListTablesstyles__ContentContainer-eZbvQv') and contains(@class,'hfrVec')]/div[2]/span")
	public WebElement pay_from_first_row;
	
	@FindBy(xpath="//div[contains(@class,'ListTablesstyles__ContentContainer-eZbvQv') and contains(@class,'anvBj')]/preceding::div[@aria-colindex='4']/preceding-sibling::div[1]//div[contains(@class,'ListTablesstyles__ContentContainer-eZbvQv') and contains(@class,'hfrVec')]/div/span")
	public WebElement pay_to_first_row;
	
	@FindBy(xpath="//div[contains(@class,'ListTablesstyles__ContentContainer-eZbvQv') and contains(@class,'anvBj')]/preceding::div[@aria-colindex='4']/following-sibling::div//div[contains(@class,'ListTablesstyles__ContentContainer-eZbvQv') and contains(@class,'hfrVec')]/div/span")
	public WebElement payment_date_first_row;
	
	@FindBy(xpath="//div[contains(@class,'ListTablesstyles__ContentContainer-eZbvQv') and contains(@class,'hfrVec')]/div/span")
	public WebElement payment_type_first_row;
	
	@FindBy(xpath="//div[contains(@class,'ListTablesstyles__ContentContainer-eZbvQv') and contains(@class,'hfrVec')]/preceding::div[@aria-colindex='2']/following-sibling::div//div[contains(@class,'ListTablesstyles__ContentContainer-eZbvQv') and contains(@class,'hfrVec')]/div/span")
	public WebElement status_first_row;
	
	@FindBy(xpath="//button[@title='Move Left']")
	public WebElement Move_left_button;
	
	@FindBy(xpath="//button[@title='Move Right']")
	public WebElement Move_right_button;
	
	@FindBy(xpath="//div[text()='PAYMENT TYPE']")
	public WebElement Payment_type_header;
	
	@FindBy(xpath="//div[@title='Filter']")
	public WebElement filter;
	
	@FindBy(xpath="//div[contains(text(), \"AMOUNT\")]")
	public WebElement amount;

	@FindBy(xpath="//div[@type=\"button\"]/div[@class=\"css-81x7r1 placeholder-6ov3cz\"]")
	public WebElement select_amount;
	
	@FindBy(xpath="//div[@type=\"button\"]/div[@class=\"css-81x7r1 placeholder-6ov3cz\"]/following-sibling::input")
	public WebElement input_amount_type;
	
	@FindBy(xpath="//input[@id=\"scbf-range-3\"]")
	public WebElement amount_from;
	
	@FindBy(xpath="//input[@id=\"scbf-range-4\"]")
	public WebElement amount_to;
	
	@FindBy(xpath="//button[@class=\"css-mad3ld submit css-19rt01d\"]")
	public WebElement apply;
	
	@FindBy(xpath="//button[@title=\"Remove filter\"]")
	public WebElement remove_filter;
	
	@FindBy(xpath="//button[@class=\"css-mad3ld checkboxModeButton css-kup8xj\"]")
	public WebElement multiSelect;
	
	@FindBy(xpath="//button[contains(.,\"Show selected\")]")
	public WebElement showselectedItem;
	
	@FindBy(xpath="//button[contains(.,\"Actions\")]")
	public WebElement actions;
	
	@FindBy(xpath="(//div[contains(text(),\"DELETE\")])")
	public WebElement delete;
	
	@FindBy(xpath="(//div[contains(text(),\"EXPORT\")])")
	public WebElement export;
	
	@FindBy(xpath="(//div[contains(text(),\"PRINT\")])")
	public WebElement print;
	
	@FindBy(xpath="//div[@title='Filter']")
	public WebElement filter_button;
	
	@FindBy(xpath="//span[text()='Apply']")
	public WebElement Apply_button;
	
	@FindBy(xpath="//div[text()='CHEQUE NUMBER']")
	public WebElement cheque_number;
	
	@FindBy(xpath="//span[text()='export list']")
	public WebElement export_list;
	
	@FindBy(xpath="//button[contains(@class,'BlotterRowActionsCellstyles__StyledButton-eexkQM') and contains(@class,'iFXORq')]")
	public WebElement three_dots_button;
	
	@FindBy(xpath="//table[contains(@class,'ActionsItemstyles__StyledContainer-cPBaBu') and contains(@class,'iVDDWa')]/div")
	public WebElement three_dots_content;
	
	public By three_dots_content_locator=By.xpath("//table[contains(@class,'ActionsItemstyles__StyledContainer-cPBaBu') and contains(@class,'iVDDWa')]/div");
	
	@FindBy(xpath="//button[contains(@class,'CloseButton')]")
	public WebElement three_dots_close_button;
	
	@FindBy(xpath="//span[text()='export list']")
	public WebElement Export_list;
	
	@FindBy(xpath="//p[text()='Straight2Bank Nextgen allows the details to be exported in one of the following formats, at a time.']")
	public WebElement Text_check_export_list;
	
	@FindBy(xpath="//p[contains(text(),'Straight2Bank')]/following-sibling::div//div[@class='css-1uzcl8k']//*[contains(@class,'css-i8h7w')]")
	public WebElement drop_down_export_list;
	
	@FindBy(xpath="//div[@class='css-9335k7']//div[contains(@class,'css-1d4bw0k') and contains(@class,'css-1cz1nne')]/div")
	public WebElement drop_down_content;
	
	public By drop_down_content_locator=By.xpath("//div[@class='css-9335k7']//div[contains(@class,'css-1d4bw0k') and contains(@class,'css-1cz1nne')]/div");
	
	@FindBy(xpath="//span[text()='EXPORT']")
	public WebElement Export_button;
	
	@FindBy(xpath="//div[contains(@class,'css-k008qs') and contains(@class,'e8xb8ym0')]")
	public WebElement page_navigation_check;
	
	@FindBy(xpath="//div[contains(@class,'css-192t0m5') and contains(@class,'e8xb8ym2')]/following-sibling::button")
	public WebElement page_number;
	
	public By page_number_locator=By.xpath("//div[contains(@class,'css-192t0m5') and contains(@class,'e8xb8ym2')]/following-sibling::button");
    
	@FindBy(xpath="//button[@direction='right']")
	public WebElement navigate_right_button;
	
	@FindBy(xpath="//button[@direction='left']")
	public WebElement navigate_left_button;
	
	public WebElement selectPaymentReference(int i) {
	WebElement select = d.findElement(By.xpath("//div[@aria-rowindex='" + i +"']"+"/div[@aria-colindex=\"1\"]/div/div/span/label/input"));
	return select;	
	
	}
}
