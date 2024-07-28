package pageobjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Excelutilies;

public class CarItem1
{
	WebDriver driver;
	
	String file1=System.getProperty("user.dir")+"\\Excelsheet\\output.xlsx";
	Excelutilies ex;
	public CarItem1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		ex=new Excelutilies(file1);
	}
	   @FindBy(xpath="//*[@id=\"statics\"]/div/div/div/div/div/div[3]/div/div/div/div/b[1]")
	   List<WebElement> service;
	
		@FindBy(xpath="//*[@id=\"statics\"]/div/div/div/div/div/div[3]/div/div/div/div/b[2]")
		List<WebElement> price;
		
		
	public void serviceprice() throws IOException {
		
		for(int r=0;r<5;r++) {
			String sname=service.get(r).getText();
			String amt=price.get(r).getText();
			
			for(int c=0;c<=2;c++)
			{
				ex.write_Data("Sheet0",sname,r,0);
				ex.write_Data("Sheet0",amt,r,1);
				
				
				}
			System.out.println(sname);
			System.out.println(amt);
	         }
		
	    }

}


















