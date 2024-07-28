package pageobjects;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Excelutilies;

public class Homepage1 {
	WebDriver driver;
	
	Excelutilies ex;
	String file=System.getProperty("user.dir")+"\\Excelsheet\\Input.xlsx";
	public Homepage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		ex=new Excelutilies(file);
	}
	
	
	
	@FindBy(xpath="//div[@class='service-search col-md-4 col-sm-12 no-padding']//select[@name='brand']")
	WebElement car;
	
	
	@FindBy(xpath="//div[@class='service-search col-md-4 col-sm-12 no-padding']//select[@id='phone_id']")
	WebElement sub;
	
	////div[@class='service-search col-md-4 col-sm-12 no-padding']//select[@id='phone_id']
	@FindBy(xpath="//a[@class='btn']")
	WebElement search;
	
	
	public void selectingcar() throws IOException {
		car.click();
		String inputcar=ex.getCellData("Sheet2",0,0);
		
		Select c1=new Select(car);
    	c1.selectByVisibleText(inputcar);
	}
	
	public void selectsub() throws InterruptedException, IOException {
		sub.click();
		Thread.sleep(2000);
		String inputSub=ex.getCellData("Sheet2",0,1);
		Select c2=new Select(sub);
		c2.selectByVisibleText(inputSub);
		
	}
	public void search1() {
		search.click();
	}
	
	
	
	
	
	
	
}
