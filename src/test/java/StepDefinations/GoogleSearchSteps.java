package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver= null;
	
	@Given("The browser is open")
	public void the_browser_is_open() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/dilipmodak/Documents/CucumberJava/src/test/resources/drivers/chromedriver");
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.get("https://www.google.com/");
	   
	}

	@When("user enters a text in google search box")
	public void user_enters_a_text_in_google_search_box() {
	    driver.findElement(By.name("q")).sendKeys("Sabyasachi Modak");
	}

	@And("hits enter")
	public void hits_enter() {
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is naviagted to the search page")
	public void user_is_naviagted_to_the_search_page() {
	    driver.getPageSource().contains("Sabyasachi Modak - Dublin, Ireland");
	    driver.close();
	    driver.quit();
	}

}
