package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Id_Class {
	WebDriver driver;
	
	//*[contains(text(),"Create New Account")]
  
	@FindBy(xpath = "//*[contains(text(),'Create New Account')]")
	WebElement Createaccount;
	@FindBy(name = "firstname")
	WebElement firstname;
	@FindBy(name = "lastname")
	WebElement lastname;
	@FindBy(name = "reg_email__")
	WebElement reg_email__;
	@FindBy(name = "reg_passwd__")
	WebElement reg_passwd__;
	@FindBy(name = "birthday_day")
	WebElement birthday_day;
	@FindBy(name = "birthday_month")
	WebElement birthday_month;
	@FindBy(name = "birthday_year")
	WebElement birthday_year;
	@FindBy(xpath ="//*[contains(@class,\"_8idr img\")]" )
	WebElement back;
	
	
	//For Login PAge
	
	@FindBy(name="email")
	WebElement name;
	@FindBy(name="pass")
	WebElement pass;
	@FindBy(xpath = "//*[contains(text(),\"Forgotten password?\")]")
	WebElement forgotpassword;
	@FindBy(id="identify_email")
	WebElement pleaseSerach;
	@FindBy(id ="did_submit")
	WebElement searchlogin;
	@FindBy(name="reset_action")
	WebElement notYou;
	
	
	//For Correct LoginNow
	
	@FindBy(xpath="//*[contains(@placeholder,\"Email or phone\")]")
	WebElement emailOrphone;
	@FindBy(xpath="//*[contains(@aria-label,\"Password\")]")
	WebElement emailOrphonePassword;
	//@FindBy(xpath="	//body/div[@id='u_0_2_Am']/div[@id='globalContainer']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]\r\n" + "")
	@FindBy(xpath="//body/div[@id='u_0_2_QE']/div[@id='globalContainer']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]")
	WebElement LogIn;
	
	//*[contains(@placeholder,"Email or phone")]
	
	//body/div[@id='u_0_2_Am']/div[@id='globalContainer']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]

	public Id_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void CreateAccount() {
		Createaccount.click();
	}
	

	public void enterFirstname(String arg1) {
		firstname.sendKeys(arg1);
	}
	
	public void enterLastname(String arg2) {
		lastname.sendKeys(arg2);
	}

	public void enterReg_email__(String arg3) {
		reg_email__.sendKeys(arg3);
	}
	public void enterReg_passwd__(String arg4) {
		reg_passwd__.sendKeys(arg4);
	}

	public void enterBirthday_day(String arg5) {
		birthday_day.sendKeys(arg5);
	}

	public void enterBirthday_month(String arg6) {
		birthday_month.sendKeys(arg6);
	}

	public void enterBirthday_year(String arg7) {
		birthday_year.sendKeys(arg7);
	}
	
	public void Crossbutton() {
		back.click();
		
		
		///////////////////////////////////////////////
	}
	public void emailEnter(String args) {
		name.sendKeys(args);
	}
	public void Enterpass(String args) {
		pass.sendKeys(args);
	}
	public void forgot() {
		forgotpassword.click();
	}
	public void searchByEmail(String args) {
		pleaseSerach.sendKeys(args);
	}
	public void SearchLogin() {
		searchlogin.click();
	}
	public void ClickNotYou() {
		notYou.click();
	}
	///////////////////////////////////////////////////////
	
	public void EnteremailOrPhone(String args) {
		emailOrphone.sendKeys(args);
	}
	public void EnterpasswordReal(String args) {
		emailOrphonePassword.sendKeys(args);
	}
	public void LogIn() {
		LogIn.click();
}

}
