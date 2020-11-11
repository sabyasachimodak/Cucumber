package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage_POM;
import io.cucumber.java.en.*;

public class LoginPage {

	WebDriver driver = null;
	LoginPage_POM login;

	@Given("The browser is opened")
	public void the_browser_is_opened() {

		System.setProperty("webdriver.chrome.driver", "/Users/dilipmodak/Documents/CucumberJava/src/test/resources/drivers/chromedriver");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("the login page is open")
	public void the_login_page_is_open() {
		driver.get("https://example.testproject.io/web/");
	}

	@When("^the (.*) and (.*) is given$")
	public void the_username_and_passowrd_is_given(String username, String password) {
		
		login = new LoginPage_POM(driver);
		login.setusername(username);
		login.setpassword(password);

		//		driver.findElement(By.id("name")).sendKeys(username);
		//		driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("the login button is clicked")
	public void the_login_button_is_clicked() throws InterruptedException {

		login.clicklogin();

		//		Thread.sleep(2000);
		//		driver.findElement(By.id("login")).click();
	}

	@Then("the user is redirected to the next page")
	public void the_user_is_redirected_to_the_next_page() {

		login.verifylogout();

		//driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
	}

}
