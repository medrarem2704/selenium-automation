package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Log;

public class LoginPage {
	
	private WebDriver driver;
	
	// login page locators
//	private By usernameField = By.id("user-name");
//	private By passwordField = By.id("password");
//	private By loginButton = By.id("login-button");
	
	// finding web elements using Page Factory
	@FindBy(id="user-name")
	WebElement usernameField;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		Log.info("Entering username: " + username);
		
		usernameField.sendKeys(username);
		//driver.findElement(usernameField).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		Log.info("Entering password: **********");
		
		passwordField.sendKeys(password);
		//driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickLogin() {
		Log.info("Clicking login button");
		
		loginButton.click();
		//driver.findElement(loginButton).click();
	}
	
	public String getPageText() {
		return driver.getTitle();
	}
	

}
