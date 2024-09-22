package Utility_project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_project
{
	public static ChromeDriver driver;
public static String un;
public static String pw;
public static String upi;

	public void login_credentials () throws EncryptedDocumentException, IOException
	{
		//FileInputStream file = new FileInputStream("‪C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Assignments\\DDT\\loginsheet.xlsx");
		FileInputStream file = new FileInputStream ("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Assignments\\DDT\\loginsheet.xlsx");
		Workbook w1=WorkbookFactory.create(file);
		un = NumberToTextConverter.toText(w1.getSheet("amazonlogin").getRow(0).getCell(0).getNumericCellValue());
		pw = w1.getSheet("amazonlogin").getRow(0).getCell(1).getStringCellValue();
		upi= w1.getSheet("amazonlogin").getRow(0).getCell(2).getStringCellValue();
	}
	
	
	
}
