package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObjects {

	public WebDriver driver;

	//Register--
	private By myAccount = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]");

	private By register = By.xpath("//a[text()='Register']");

	private By firstname = By.xpath("//input[@name='firstname']");

	private By lastname = By.xpath("//input[@name='lastname']");

	private By email = By.xpath("//input[@name='email']");

	private By telephone = By.xpath("//input[@name='telephone']");

	private By password1 = By.xpath("//input[@name='password']");

	private By confirmpassword = By.xpath("//input[@name='confirm']");

	public RegisterPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement verifyMyAccount() {

		return driver.findElement(myAccount);
	}

	public WebElement verifyRegister() {

		return driver.findElement(register);
	}

	public WebElement enterFirstName() {

		return driver.findElement(firstname);
	}

	public WebElement enterLastName() {

		return driver.findElement(lastname);
	}

	public WebElement enterEmail() {

		return driver.findElement(email);
	}

	public WebElement enterTelephone() {

		return driver.findElement(telephone);
	}

	public WebElement enterPassword() {

		return driver.findElement(password1);
	}

	public WebElement enterConfirmPassword() {

		return driver.findElement(confirmpassword);
	}
}
