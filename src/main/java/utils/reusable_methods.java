package utils;

import java.util.ArrayList;
import java.util.List;

import java.io.File;  
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;  
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row;  

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class reusable_methods 
{
	public  WebDriver d;

	public reusable_methods(WebDriver d) 
	{
		// TODO Auto-generated constructor stub
		this.d=d;
	}
	
	public  int count_of_webelements(By by)
	{
		
		List<WebElement> l=d.findElements(by);
		return l.size();
	}
	
}  

