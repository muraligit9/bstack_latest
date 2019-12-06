package Pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import utils.reusable_methods;


public class payment_summary 
{
	
	public static WebDriver d;
	 
	 public payment_summary(WebDriver d) {
		 this.d =  d;
	 }

	
	Actions a;
	WebDriverWait wait;
	reusable_methods r_use;
	
	
	public void clicking_on_menu() throws InterruptedException
	{
		menupage_pom mainpage=new menupage_pom(d);
		paymentsummary_pom pay_sum=new paymentsummary_pom(d);
		wait=new WebDriverWait(d, 30);
		r_use=new reusable_methods(d);
		
		
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)d;
		a=new Actions(d);
		//a.moveToElement(mainpage.arrow_button).click();
		/*
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(mainpage.arrow_button));
			js.executeScript("arguments[0].click();",mainpage.arrow_button);
		}
		catch(Exception e)
		{
			System.out.println("exception which occured due to clicking on arrow button is handled");
		}
		
		try 
		{
		js.executeScript("arguments[0].click();",mainpage.close_button);
		}
		catch(Exception e)
		{
			System.out.println("exception which occured due to clicking on close button is handled");
		}
		*/
		wait.until(ExpectedConditions.elementToBeClickable(mainpage.Menu_tab));
		js.executeScript("arguments[0].click();",mainpage.Menu_tab);
		wait.until(ExpectedConditions.elementToBeClickable(mainpage.Cash_tab));
		js.executeScript("arguments[0].click();",mainpage.Cash_tab);
		wait.until(ExpectedConditions.elementToBeClickable(mainpage.manage_tab));
		js.executeScript("arguments[0].click();",mainpage.manage_tab);
		wait.until(ExpectedConditions.elementToBeClickable(mainpage.Transactions_tab));	
		js.executeScript("arguments[0].scrollIntoView();",mainpage.Transactions_tab);
		js.executeScript("arguments[0].click();",mainpage.Transactions_tab);
		Thread.sleep(2000);
		
		while((r_use.count_of_webelements(mainpage.payments_table_locator))<1)
		{
			Thread.sleep(1000);
		}
		
	}
	
	public void click_transactions_click_payment_link() throws InterruptedException
	{
		
		menupage_pom mainpage=new menupage_pom(d);
		paymentsummary_pom pay_sum=new paymentsummary_pom(d);
		wait=new WebDriverWait(d, 30);
		JavascriptExecutor js=(JavascriptExecutor)d;
		
		wait.until(ExpectedConditions.elementToBeClickable(mainpage.payments_table));
		wait.until(ExpectedConditions.elementToBeClickable(mainpage.first_payment_link));
		js.executeScript("arguments[0].click();",mainpage.first_payment_link);
		Thread.sleep(3000);
	}
	
	public void verify_payment_summary() throws InterruptedException
	{
		menupage_pom mainpage=new menupage_pom(d);
		paymentsummary_pom pay_sum=new paymentsummary_pom(d);
		r_use=new reusable_methods(d);
		wait=new WebDriverWait(d, 30);
		JavascriptExecutor js=(JavascriptExecutor)d;
		//wait.until(ExpectedConditions.elementToBeClickable(mainpage.loading_xpath));
		while(r_use.count_of_webelements(mainpage.loading_xpath)>0)
		{
			Thread.sleep(1000);
		}
		/*try
		{
		while(!((r_use.count_of_webelements(mainpage.loading_xpath))==0))
		{
			Thread.sleep(1000);
		}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("exception occured");
		}*/
		wait.until(ExpectedConditions.elementToBeClickable(pay_sum.your_ref));
		System.out.println("your reference: "+pay_sum.your_ref.getText());
		System.out.println("payment reference: "+pay_sum.payment_ref.getText());
		System.out.println("uetr number: "+pay_sum.uetr_number.getText());
		System.out.println("pay from: "+pay_sum.pay_from.getText());
		System.out.println("pay to: "+pay_sum.pay_to.getText());
		//System.out.println("debit amount: "+pay_sum.debit_amount.getText());
		System.out.println("payment type: "+pay_sum.payment_type.getText());
		
	}
	
	public void clicking_sorting_button() throws InterruptedException
	{
		
		payments_transactions_page_pom pay_rows=new payments_transactions_page_pom(d);
		JavascriptExecutor js=(JavascriptExecutor)d;
		wait=new WebDriverWait(d, 30);
		a=new Actions(d);
		
		List<WebElement> l=d.findElements(pay_rows.sortbutton_without_sorting);
		for(int i=0;i<l.size();i++)
		{
			//Thread.sleep(15000);
			
			wait.until(ExpectedConditions.elementToBeClickable(l.get(i)));
			js.executeScript("arguments[0].click();",l.get(i));
			wait.until(ExpectedConditions.elementToBeClickable(pay_rows.sortbutton_after_sorting));
			System.out.println("after first click on sorting button displayed first row values are as below: ");
			System.out.println("payment ref value is: "+pay_rows.payment_ref_first_row.getText());
			System.out.println("pay from value is: "+pay_rows.pay_from_first_row.getText());
			System.out.println("pay to value is: "+pay_rows.pay_to_first_row.getText());
			System.out.println("amount value is: "+pay_rows.amount_first_row.getText());
			System.out.println("payment date is: "+pay_rows.payment_date_first_row.getText());
			
			String amount_value_after_first_sort=pay_rows.amount_first_row.getText();
			wait.until(ExpectedConditions.elementToBeClickable(pay_rows.sortbutton_after_sorting));
			Thread.sleep(5000);
			
			//js.executeScript("arguments[0].click();",pay_rows.sortbutton_after_sorting_element);
			//a.moveToElement(pay_rows.sortbutton_after_sorting).click();
			//js.executeScript("arguments[0].click();",pay_rows.sortbutton_after_sorting_element);
			try
			{
				a.moveToElement(pay_rows.sortbutton_after_sorting_element).click().build().perform();
			}
			catch(Exception e)
			{
				wait.until(ExpectedConditions.elementToBeClickable(l.get(i)));
				js.executeScript("arguments[0].click();",l.get(i));
				wait.until(ExpectedConditions.elementToBeClickable(pay_rows.sortbutton_after_sorting));
				a.moveToElement(pay_rows.sortbutton_after_sorting_element).click().build().perform();
			}
			
			while((pay_rows.amount_first_row.getText().equals(amount_value_after_first_sort)))
					{
				      Thread.sleep(1000);
					}
			
			System.out.println("after second click on sorting button displayed first row values are as below: ");
			System.out.println("payment ref value is: "+pay_rows.payment_ref_first_row.getText());
			System.out.println("pay from value is: "+pay_rows.pay_from_first_row.getText());
			System.out.println("pay to value is: "+pay_rows.pay_to_first_row.getText());
			System.out.println("amount value is: "+pay_rows.amount_first_row.getText());
			System.out.println("payment date is: "+pay_rows.payment_date_first_row.getText());
			
			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.elementToBeClickable(pay_rows.sortbutton_after_sorting_element));
			Thread.sleep(2000);
			
			//js.executeScript("arguments[0].click();",pay_rows.sortbutton_after_sorting_element);
			a.moveToElement(pay_rows.sortbutton_after_sorting_element).click().build().perform();;
			//js.executeScript("arguments[0].click();",pay_rows.sortbutton_after_sorting_element);
			//System.out.println(i+" loop is completed");
		}
		wait.until(ExpectedConditions.elementToBeClickable(pay_rows.Move_right_button));
		js.executeScript("arguments[0].click();",pay_rows.Move_right_button);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(pay_rows.sortbutton_without_sorting));
		
		l=d.findElements(pay_rows.sortbutton_without_sorting);
		for(int i=0;i<l.size();i++)
		{
			
			//wait.until(ExpectedConditions.elementToBeClickable(pay_rows.Payment_type_header));
			wait.until(ExpectedConditions.elementToBeClickable(l.get(i)));
			/*js.executeScript("arguments[0].click();",l.get(i));
			wait.until(ExpectedConditions.elementToBeClickable(pay_rows.sortbutton_after_sorting_element));
			System.out.println("after first click on payment type button of amount, displayed first row values are as below: ");
			System.out.println("payment ref value is: "+pay_rows.payment_ref_first_row.getText());*/
			//System.out.println("payment type: "+pay_rows.payment_type_first_row.getText());
			//System.out.println("status is: "+pay_rows.status_first_row.getText());
			
			/*String amount_value_after_first_sort=pay_rows.amount_first_row.getText();
			wait.until(ExpectedConditions.elementToBeClickable(pay_rows.sortbutton_after_sorting));
			
			js.executeScript("arguments[0].click();",pay_rows.sortbutton_after_sorting);
			
			while((pay_rows.amount_first_row.getText().equals(amount_value_after_first_sort)))
					{
				      Thread.sleep(1000);
					}
			
			
			
			System.out.println("after second click on sorting button of payment type, displayed first row values are as below: ");
			System.out.println("payment ref value is: "+pay_rows.payment_ref_first_row.getText());*/
			//System.out.println("payment type: "+pay_rows.payment_type_first_row.getText());
			//System.out.println("status is: "+pay_rows.status_first_row.getText());
		
		    
			
		}
		
		try{
			wait.until(ExpectedConditions.elementToBeClickable(pay_rows.Move_left_button));
		}
		catch(Exception e)
		{
			this.navigating_between_columns();
		}
		js.executeScript("arguments[0].click();",pay_rows.Move_left_button);
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(pay_rows.sortbutton_without_sorting));
		
		
			
	}
	
	public void navigating_between_columns()
	{
		payments_transactions_page_pom pay_rows=new payments_transactions_page_pom(d);
		JavascriptExecutor js=(JavascriptExecutor)d;
		wait=new WebDriverWait(d, 30);
		a=new Actions(d);
		wait.until(ExpectedConditions.elementToBeClickable(pay_rows.Move_right_button));
		js.executeScript("arguments[0].click();",pay_rows.Move_right_button);
		wait.until(ExpectedConditions.elementToBeClickable(pay_rows.sortbutton_without_sorting));
		wait.until(ExpectedConditions.elementToBeClickable(pay_rows.Move_left_button));
		js.executeScript("arguments[0].click();",pay_rows.Move_left_button);
		
	}
	
	public void clicking_on_three_dots()
	{
		payments_transactions_page_pom pay_rows=new payments_transactions_page_pom(d);
		JavascriptExecutor js=(JavascriptExecutor)d;
		wait=new WebDriverWait(d, 30);
		
        wait.until(ExpectedConditions.elementToBeClickable(pay_rows.three_dots_button));
	    
	    js.executeScript("arguments[0].click();",pay_rows.three_dots_button);
	}
	
	public void verifying_menu_present_under_three_dots_and_close_same()
	{
		payments_transactions_page_pom pay_rows=new payments_transactions_page_pom(d);
		JavascriptExecutor js=(JavascriptExecutor)d;
		wait=new WebDriverWait(d, 30);
		a=new Actions(d);
		 wait.until(ExpectedConditions.elementToBeClickable(pay_rows.three_dots_content));
		    List<WebElement> li=d.findElements(pay_rows.three_dots_content_locator);
		    System.out.println("Menu under three dots are as follows:");
		    for(int i=0;i<li.size();i++)
		    {
		    	a.moveToElement(li.get(i)).build().perform();
		    	System.out.println(li.get(i).getText());
		    }
		    
		    wait.until(ExpectedConditions.elementToBeClickable(pay_rows.three_dots_close_button));
		    a.moveToElement(pay_rows.three_dots_close_button).build().perform();
		    js.executeScript("arguments[0].click();",pay_rows.three_dots_close_button);
	}
	public void clicking_on_filter_button()
	{
		payments_transactions_page_pom pay_rows=new payments_transactions_page_pom(d);
		JavascriptExecutor js=(JavascriptExecutor)d;
		wait=new WebDriverWait(d, 30);
		a=new Actions(d);
		wait.until(ExpectedConditions.elementToBeClickable(pay_rows.filter_button));
	    js.executeScript("arguments[0].click();",pay_rows.filter_button);
	    a=new Actions(d);
	    a.moveToElement(pay_rows.filter_button).click().build().perform();
	    
	}
	
	public void filter_pop_up_validation()
	{
		payments_transactions_page_pom pay_rows=new payments_transactions_page_pom(d);
		JavascriptExecutor js=(JavascriptExecutor)d;
		wait=new WebDriverWait(d, 30);
		a=new Actions(d);
		wait.until(ExpectedConditions.elementToBeClickable(pay_rows.Apply_button));
	    js.executeScript("arguments[0].scrollIntoView();",pay_rows.Apply_button);
	    a.moveToElement(pay_rows.Apply_button).build().perform();
	    js.executeScript("arguments[0].scrollIntoView();",pay_rows.cheque_number);
	    a.moveToElement(pay_rows.cheque_number).build().perform();
	    wait.until(ExpectedConditions.elementToBeClickable(pay_rows.filter_button));
	    js.executeScript("arguments[0].scrollIntoView();",pay_rows.filter_button);
	    a.moveToElement(pay_rows.filter_button).build().perform();
	    a.moveToElement(pay_rows.export_list).build().perform();
	    wait.until(ExpectedConditions.elementToBeClickable(pay_rows.filter_button));
	    a.moveToElement(pay_rows.filter_button).click().build().perform();
	}
	
	public void clicking_on_export_list_button()
	{
		
		payments_transactions_page_pom pay_rows=new payments_transactions_page_pom(d);
		JavascriptExecutor js=(JavascriptExecutor)d;
		wait=new WebDriverWait(d, 30);
		a=new Actions(d);
		
		 wait.until(ExpectedConditions.elementToBeClickable(pay_rows.Export_list));
		    
		    a.moveToElement(pay_rows.Export_list).click().build().perform();
		   
		
	}
	
	public void selecting_drop_down_for_required_format_to_download_from_export_list()
    {
		payments_transactions_page_pom pay_rows=new payments_transactions_page_pom(d);
		JavascriptExecutor js=(JavascriptExecutor)d;
		wait=new WebDriverWait(d, 30);
		a=new Actions(d);
		 
	    wait.until(ExpectedConditions.elementToBeClickable(pay_rows.Text_check_export_list));
	    
	    a.moveToElement(pay_rows.drop_down_export_list).click().build().perform();
	    
	    wait.until(ExpectedConditions.elementToBeClickable(pay_rows.drop_down_content));
	    
	    List<WebElement> lis=d.findElements(pay_rows.drop_down_content_locator);
	    for(int i=0;i<lis.size();i++)
	    {
	    	if((lis.get(i).getText()).equals("xls"))
	    			{
	    		        a.moveToElement(lis.get(i)).click().build().perform();
	    			}
	    }
	    
	    wait.until(ExpectedConditions.elementToBeClickable(pay_rows.Export_button));
	    a.moveToElement(pay_rows.Export_button).click().build().perform();
	    wait.until(ExpectedConditions.elementToBeClickable(pay_rows.Export_list));
    }
	
	public void checking_navigation_bar_presence()
	{
		
		payments_transactions_page_pom pay_rows=new payments_transactions_page_pom(d);
		JavascriptExecutor js=(JavascriptExecutor)d;
		wait=new WebDriverWait(d, 30);
		try {
		wait.until(ExpectedConditions.elementToBeClickable(pay_rows.page_navigation_check));
		}
		catch(Exception e)
		{
			if(((d.findElements(pay_rows.page_number_locator)).size())==0)
			{
				System.out.println("there is only one page so navigation not possible");
			}
		}
		
		
		
		
	}
	
	    public void navigating_through_navigation_bar()
	    {
	    	payments_transactions_page_pom pay_rows=new payments_transactions_page_pom(d);
			JavascriptExecutor js=(JavascriptExecutor)d;
			wait=new WebDriverWait(d, 30);
			a=new Actions(d);
			
			try {
			List<WebElement> li=d.findElements(pay_rows.page_number_locator);
			
			for(int i=1;i<li.size();i++)
			{
				a.moveToElement(li.get(i)).click().build().perform();
				wait.until(ExpectedConditions.elementToBeClickable(pay_rows.payment_ref_first_row));
				if(i==10)
				{
					a.moveToElement(pay_rows.Move_right_button).click().build().perform();
					wait.until(ExpectedConditions.elementToBeClickable(pay_rows.payment_ref_first_row));
					a.moveToElement(pay_rows.Move_left_button).click().build().perform();
					wait.until(ExpectedConditions.elementToBeClickable(pay_rows.payment_ref_first_row));
					a.moveToElement(li.get(i-10)).click().build().perform();
					wait.until(ExpectedConditions.elementToBeClickable(pay_rows.payment_ref_first_row));
					break;
				}
			}
			}
			catch(Exception e)
			{
				if(((d.findElements(pay_rows.page_number_locator)).size())==0)
				{
					System.out.println("there is only one page so navigation not possible");
				}
			}
	    }
		//////////////// 
		public void filterByAmount() throws InterruptedException
		{
			
			payments_transactions_page_pom filteramount=new payments_transactions_page_pom(d);
			wait=new WebDriverWait(d, 30);
			
			System.out.println("Select the filter by amount");
			filteramount.filter.click();
			
			System.out.println("select the amount type");
			filteramount.amount.click();
			filteramount.input_amount_type.sendKeys("HKD", Keys.ENTER);
			
			System.out.println("Amount from and Amount TO");
			filteramount.amount.click();
			filteramount.amount_from.sendKeys("10");
			filteramount.amount_to.click();
			Actions a = new Actions(d);
			a.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).build().perform();
			a.sendKeys(Keys.BACK_SPACE).build().perform();
			filteramount.amount_to.sendKeys("100");
			
			System.out.println("Click on apply");
			filteramount.actionClick(filteramount.apply);
			filteramount.apply.click();
			
	}

	public void removeFilter() {
		payments_transactions_page_pom filteramount=new payments_transactions_page_pom(d);
		filteramount.remove_filter.click();
	}
	
	public void multiSelect() {
		payments_transactions_page_pom multiselect=new payments_transactions_page_pom(d);
		
		System.out.println("Click on multi select");
		multiselect.multiSelect.click();
		
	}
	
	public void selectPaymentReference() {
	payments_transactions_page_pom multiselect=new payments_transactions_page_pom(d);
	System.out.println("select the item");
	multiselect.selectPaymentReference(3).click();
	
	System.out.println("Show selected items");
	multiselect.showselectedItem.click();
	}
	
	@SuppressWarnings("deprecation")
	public void onActionsClick() {
		
		System.out.println("Click on Actions");
		payments_transactions_page_pom actionsObj=new payments_transactions_page_pom(d);
		actionsObj.actions.click();
		
		System.out.println("Verfiy the Action Options");
		Assert.assertEquals("DELETE", actionsObj.delete.getText());
		Assert.assertEquals("EXPORT", actionsObj.export.getText());
		Assert.assertEquals("PRINT", actionsObj.print.getText());
		
	}
}
