package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    ChromeDriver driver =new ChromeDriver();
	  
	    FileInputStream f=new FileInputStream("./excel/data.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		driver.get(url);
		
		String us = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.id("email")).sendKeys(us);
		
		String pwd = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		//driver.findElement(By.id("last")).click();

	}

}
//apache POI 3rd party tool to read data from excel