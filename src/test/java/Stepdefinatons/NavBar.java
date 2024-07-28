package Stepdefinatons;

	import org.junit.Assert;
    import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
	import factory.BaseClass;

	import io.cucumber.java.en.Given;

	import io.cucumber.java.en.Then;
	 
	public class NavBar {
	 
		WebDriver driver=BaseClass.getDriver();

		@Given("the user navigates to the Application")

		public void the_user_navigates_to_the_application()

		{

		    System.out.println("Searching for Navbar");

		}

		@Then("the page NavaBar has to be displayed")

		public void the_page_title_has_to_be_displayed() throws InterruptedException

		{

		    WebElement navbar=driver.findElement(By.xpath("//nav[@class='mainmenu']"));

		    if(navbar.isDisplayed())

		    {

				Assert.assertTrue(true);

			}

			else

			{

				Assert.assertTrue(false);

			}

		}

	}



