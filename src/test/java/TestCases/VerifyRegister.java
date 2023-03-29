package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.RegisterPageObjects;
import Resources.Constants;
import Resources.baseClass;

public class VerifyRegister extends baseClass {

	@Test
	public void Register() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		RegisterPageObjects rpo = new RegisterPageObjects(driver);

		driver.manage().window().maximize();

		// Register--
		rpo.verifyMyAccount().click();

		rpo.verifyRegister().click();

		rpo.enterFirstName().sendKeys(Constants.firstname);

		rpo.enterLastName().sendKeys(Constants.lastname);

		rpo.enterEmail().sendKeys(Constants.email);

		rpo.enterTelephone().sendKeys(Constants.telephone);

		rpo.enterPassword().sendKeys(Constants.password1);

		rpo.enterConfirmPassword().sendKeys(Constants.confirmpassword);

	}
}
