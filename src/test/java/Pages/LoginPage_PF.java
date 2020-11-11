package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	@FindBy(id="name")
	WebElement username_txt;
	
	@FindBy(id="password")
	WebElement password_txt;
	
	@FindBy(id="login")
	WebElement login_Button;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, LoginPage_PF.class);
	}
	
	public void enterusername (String username) {
		username_txt.sendKeys(username);
	}
	
	public void enterpassword (String password) {
		password_txt.sendKeys(password);
	}
	
	public void clicklogin() {
		login_Button.click();
	}
	
}
