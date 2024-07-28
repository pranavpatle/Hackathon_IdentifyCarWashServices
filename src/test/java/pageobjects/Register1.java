package pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Excelutilies;

public class Register1 {

	WebDriver driver;
	String file=System.getProperty("user.dir")+"\\Excelsheet\\Input.xlsx";
	String file1=System.getProperty("user.dir")+"\\Excelsheet\\output.xlsx";
	Excelutilies ex;
	Excelutilies ex1;
	
	public Register1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		ex=new Excelutilies(file1);
		ex1=new Excelutilies(file);
	} 
	
	@FindBy(xpath="//ul[@class='nav navbar-nav menu']//a[@class='medium-font'][normalize-space()='Register']")
	WebElement reg;
	
	@FindBy(xpath="//input[@id='signupname']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='signupemail']")
	WebElement mail;
	
	@FindBy(xpath="//*[@id='signuppass']")
	WebElement pas;
	
	
	@FindBy(xpath="//a[normalize-space()='SignUp']")
	WebElement sign;
	
	@FindBy(xpath="//div[@class='alert alert-danger error-message']")
	WebElement error;
	
	
	public void reg1() {
		reg.click();
	}
	public void name1() {
		String input1=ex1.getCellData("Sheet3",0,0);
		name.sendKeys(input1);
	}
	public void email() {
		String input2=ex1.getCellData("Sheet3",0,1);
		mail.sendKeys(input2);
				
	}
	public void pass() {
		String input2=ex1.getCellData("Sheet3",0,2);
		pas.sendKeys(input2);
	}
	
	public void signup1() {
		sign.click();
	}
	
	
	public void Error() throws IOException {
		String message=error.getText();
		System.out.println("------------"+message);
		ex.write_Data("Sheet1", message, 0, 0);
		
	}
}

