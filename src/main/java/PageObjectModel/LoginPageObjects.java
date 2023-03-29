package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	// This driver dont have scope--
	public WebDriver driver;
	
	//Login Page x-path--
	private By myAccount = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]");

	private By login = By.xpath("//a[text()='Login']");

	private By username = By.xpath("//input[@id='input-email']");

	private By password = By.xpath("//input[@id='input-password']");

	private By clickonloginbutton = By.xpath("//input[@type='submit']");

	public LoginPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement verifyMyAccount() {

		return driver.findElement(myAccount);

	}

	public WebElement VerifyLogin() {

		return driver.findElement(login);
	}

	public WebElement enterUsername() {

		return driver.findElement(username);
	}

	public WebElement enterPassword() {

		return driver.findElement(password);
	}

	public WebElement clickOnButton() {

		return driver.findElement(clickonloginbutton);
	}
}
