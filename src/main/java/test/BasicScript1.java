package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript1 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		driver.get("https://www.saucedemo.com/");

		// title of the page
		String title = driver.getTitle();
		System.out.println("title is : " + title);

		// get the username element and fill it with standard_user
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");

		// or directly :
		// driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// the password element
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// the login button
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		System.out.println("login button is: " + loginButton.getAttribute("value"));
		loginButton.click();

		// driver.close();
	}

}
