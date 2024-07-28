package pageobjects;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Excelutilies;


public class OurCenter1 {
	
	JavascriptExecutor js;
	WebDriver driver;
	Excelutilies ex;
	Excelutilies ex1;
	String file=System.getProperty("user.dir")+"\\Excelsheet\\Input.xlsx";
	String file1=System.getProperty("user.dir")+"\\Excelsheet\\output.xlsx";
	
	
	public OurCenter1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		js=(JavascriptExecutor)driver;
		ex=new Excelutilies(file);
		ex1=new Excelutilies(file1);
		
	}
	
	
	@FindBy(xpath="//ul[@class='nav navbar-nav menu']//li//a[@href='washing-centers.php'][normalize-space()='Our Centers']")
	WebElement center;
	
	@FindBy(xpath="//select[@id='typeeeee']")
	WebElement state;
	
	
	@FindBy(xpath="//*[@id=\"type221\"]/div/select")
	WebElement city;
	
	@FindBy(xpath="//button[@class='btn btn-primary cstm_btn button_stt']")
	WebElement search;
	
	
	
	@FindBy(xpath="//div[@class='col-md-6 col-sm-6 col-xs-12 store-row wow slideInLeft sr2']/div/div[1]")
	List<WebElement> shopname;
	
	public void Center1() 
	{try {
		Thread.sleep(5000);
		center.click();

	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			}
	
	
	
	
	public void shops() throws IOException, InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		long scrollHeight = 0;

		scrollHeight += 400;
		
		int row=ex.getRowCount("Sheet1");
		List<String>names=new ArrayList<String>();
		
		for(int i=0;i<row;i++) 
		{
			String states=ex.getCellData("Sheet1", i, 0);
			String cities=ex.getCellData("Sheet1", i, 1);
		
		Thread.sleep(3000);
		Select statecity=new Select(state);
		statecity.selectByVisibleText(states);
		
		Thread.sleep(3000);
		Select citystate=new Select(city);
		citystate.selectByVisibleText(cities);
		search.click();
		 
		Thread.sleep(2000);
		
		for(WebElement opt:shopname) {
			
			names.add(opt.getText());
			
		}

	    	
		js.executeScript("window.scrollTo(0, " + scrollHeight + ");");	
		}
		
		//int rows1=ex1.getRowCount("Sheet2");
		System.out.println("size : "+names.size());
		int r=0;
		for(String name :names)
		{
			
			
			System.out.println("--------------------shop names are:"+" "+ name);
			ex1.write_Data("Sheet2",name,r,0);
			
			r=r+1;
		}
			
			
		    
	    }
	
	
	}

			
			
		
		
		
		
		
		
		
		
		
		
		
	
	


