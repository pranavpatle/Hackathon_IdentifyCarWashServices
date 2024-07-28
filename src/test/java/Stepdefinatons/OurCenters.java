package Stepdefinatons;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import pageobjects.OurCenter1;


public class OurCenters {
   WebDriver driver;
	
	
	OurCenter1 oc=new OurCenter1((BaseClass.getDriver())) ;
	
	@Given("the user should click on the Our Center")
	public void the_user_should_click_on_the_our_center() {
		BaseClass.getLogger().info("click on ourcenter "); 
		oc.Center1();
	    
	}

	@Then("Select the state and city and capture the center name for any three locations")
	public void select_the_state_and_city_and_capture_the_center_name_for_any_three_locations() throws IOException, InterruptedException {
		BaseClass.getLogger().info("getting all shopnames with respect to the city and state "); 
		oc.shops();

	}
}