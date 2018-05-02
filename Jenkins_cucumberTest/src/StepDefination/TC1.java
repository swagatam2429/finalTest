package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC1 
{
	
	
	WebDriver driver;
	WebElement searchButton;
	
	@Given("^open firefox and go to youtube$")
	public void open_firefox_and_go_to_youtube() throws InterruptedException 
	{
		
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(10000);
	    
	}

	@When("^search for the search button$")
	public void search_for_the_search_button()
	{
		
		searchButton= driver.findElement(By.xpath(".//*[@id='search-icon-legacy']"));
		if(searchButton.isDisplayed())
		{
			

			System.out.println("Button found");
		}
		else
		{
			
			System.out.println("Button not found");
		}
	    
	}
	    
	

	@Then("^we are able to find the button$")
	public void we_are_able_to_find_the_button()
	{
		
		System.out.println("Button Found . . .");
	    
	}

	@Then("^close the browser$")
	public void close_the_browser() 
	
	{
		
		driver.quit();
		System.out.println("Browser Quit . . .");
	    
	}


}
