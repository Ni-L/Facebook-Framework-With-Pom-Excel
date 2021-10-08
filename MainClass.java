package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainClass {
		WebDriver driver;
		Id_Class fb;
		
		@BeforeTest
		
		public void setup() throws IOException {
	     	System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver1/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://en-gb.facebook.com/");
			//driver.findElement(By.name("Create New Account"));
			System.out.println("***********SETUP***********");
		
			}
		       

		@Test(priority=0)
		public void enter_userDetails() {
			fb = new Id_Class(driver);
			fb.CreateAccount();
			fb.enterFirstname("Nilima");
			fb.enterLastname("Wadal");
			fb.enterReg_email__("User@gmail.com");
			fb.enterReg_passwd__("Nil");
			fb.enterBirthday_day("22");
			fb.enterBirthday_month("Aug");
			fb.enterBirthday_year("1999");
			fb.Crossbutton();
			System.out.println("***********TEST CASE 1***********");

			
		}
		@Test(priority=1)
		public void backtoLogin() throws IOException
		{
		
			File src=new File("./ExcelData/dataexcel.xlsx");

			// load file
			FileInputStream fis=new FileInputStream(src);

			// Load workbook
			XSSFWorkbook wb =new XSSFWorkbook(fis);

			// Load sheet- Here we are loading first sheetonly
			XSSFSheet sh1 = wb.getSheetAt(0);

			//get all rows in the sheet
			int rowCount = sh1.getLastRowNum()-sh1.getFirstRowNum();
			//iterate over all the rows in Excel and put data in the form.
			for(int i=1;i<=rowCount;i++ ) {
				//Returns the cell at the given (0 based) index
				//Get the value of the cell as a string
				//XSSFRow representing the rownumber or null if its not defined on the sheet
//			fb.emailEnter("nilima@gmail.com");
//			fb.Enterpass("Nili34682");
//			
			fb.emailEnter(sh1.getRow(i).getCell(0).getStringCellValue());			
//			//email.sendKeys(sh1.getRow(i).getCell(0).getStringCellValue());
			fb.Enterpass(sh1.getRow(i).getCell(1).getStringCellValue());
//			//password.sendKeys(sh1.getRow(i).getCell(1).getStringCellValue());//
			System.out.println("***********TEST CASE 2***********");

//		}
			}	
		}
		@Test(priority=2)
		public void forgotPassword()
		{
			fb.forgot();
			fb.searchByEmail("9130266736");
			fb.SearchLogin();
		    fb.ClickNotYou();
			System.out.println("***********TEST CASE 3***********");
			fb.EnteremailOrPhone("98989898989");
			fb.EnterpasswordReal("Nilima@96");
			driver.close();

		}
		@Test(priority=3)
		public void correctLogin()
		{
			driver.get("www.google.com");
			//fb.LogIn();
			
			
		}
		@AfterTest
		public void turncate()
		{
			driver.quit();
		}
}