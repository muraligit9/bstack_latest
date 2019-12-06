package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverutils {
	
	public  static WebDriver driver;
	

	public static WebDriver driver() throws IOException
	{
		if(driver==null) {
		ConfigFileReader util =new ConfigFileReader();
		if(util.isLocal().equals("true")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			return driver=new ChromeDriver();
		} else {
			List<List<String>> driverDetails = driverDetails();
			for(List<String> browserData : driverDetails) {
				String browserName = browserData.get(0);
				String browserVersion = browserData.get(1);
				String os = browserData.get(2);
				String os_version = browserData.get(3);
				System.out.print("======"+browserName +"========" + browserVersion + "=======" + os + "======" +os_version);
				
				driver=	BrowserStack.getRemoteDriver(browserName, browserVersion, os, os_version);
				return driver;
			}
 		}
	}
		return driver;
	}
		
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\muralim\\git\\TechFish_Test1\\geckodriver.exe");
//		return driver=new FirefoxDriver();
	
	@SuppressWarnings("unchecked")
	public static List<List<String>> driverDetails() throws IOException{
		

		List<String> driverData = new ArrayList<String>(); 
		
		List listOfDriver = new ArrayList<List<String>>();
 			
		FileInputStream fis=new FileInputStream(new File("resources\\SelectDriver.xlsx"));  
		//creating workbook instance that refers to .xls file  
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		//creating a Sheet object to retrieve the object  
		XSSFSheet sheet=wb.getSheetAt(0);  
		//evaluating cell type   
		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
		for(Row row: sheet)     //iteration over row using for each loop  
		{  
			if(row.getRowNum()>0) {
		for(Cell cell: row)    //iteration over cell using for each loop  
		{  
			driverData.add(cell.getStringCellValue());
			System.out.println(cell.getStringCellValue());
		}  
		System.out.println();  
		}
			listOfDriver.add(driverData);	
		}
		return listOfDriver;  
	}
}
