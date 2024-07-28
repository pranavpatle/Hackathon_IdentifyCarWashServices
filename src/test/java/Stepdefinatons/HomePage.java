package Stepdefinatons;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CarItem1;
import pageobjects.Homepage1;
import pageobjects.OurCenter1;



public class HomePage {
	WebDriver driver;
	
	Homepage1 hp;
	OurCenter1 oc;
	CarItem1 ci;
	
	
	@Given("the user is on the Doorstepwash home page")
	public void the_user_is_on_the_doorstepwash_home_page(){
		 BaseClass.getLogger().info("Go to Doorstep ");  
	    
	    
	}

	@When("the User select Service type as Car")
	public void the_user_select_service_type_as_car() throws IOException  {
		 BaseClass.getLogger().info("selecting the cars");
		    hp=new Homepage1(BaseClass.getDriver());
		    hp.selectingcar(); 
	}

	@When("the User select SubCategory as SUV")
	public void the_user_select_sub_category_as_suv() throws InterruptedException, IOException {
		BaseClass.getLogger().info("selecting the sub category");
	    hp=new Homepage1(BaseClass.getDriver());
	    hp.selectsub();
	    
	}

	@When("User should click on {string}")
	public void user_should_click_on(String string) {
		 BaseClass.getLogger().info("clicking on search");
		    hp=new Homepage1(BaseClass.getDriver());
		    hp.search1();
	    
	}

	@Then("User should see all service name and amount")
	public void user_should_see_all_service_name_and_amount() throws IOException {
		 BaseClass.getLogger().info("serives with amount");
		    ci=new CarItem1(BaseClass.getDriver());
		    ci.serviceprice();
	}




}
