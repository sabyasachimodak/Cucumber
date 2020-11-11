package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM {

	By username_txt = By.id("name");
	By password_txt = By.id("password");
	By login_Button = By.id("login");
	By logout_Button = By.id("logout");

	WebDriver driver;

	public LoginPage_POM(WebDriver driver) {
		this.driver=driver;
	}

	public void setusername(String username) {
		driver.findElement(username_txt).sendKeys(username);
	}

	public void setpassword (String password) {
		driver.findElement(password_txt).sendKeys(password);
	}

	public void clicklogin () {
		driver.findElement(login_Button).click();
	}

	public void verifylogout() {
		driver.findElement(logout_Button).isDisplayed();
	}

	public void fulllogin(String username, String password) {
		driver.findElement(username_txt).sendKeys(username);
		driver.findElement(password_txt).sendKeys(password);
		driver.findElement(login_Button).click();
		driver.findElement(logout_Button).isDisplayed();
	}

}
