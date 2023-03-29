package TestCases;

import java.io.IOException;
import java.time.Duration;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.Constants;
import Resources.baseClass;

public class VerifyLogin extends baseClass {
	@Test(dataProvider = "testData")
	public void login(String username, String password) throws IOException, InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		LoginPageObjects lpo = new LoginPageObjects(driver);

		driver.manage().window().maximize();
		
		//Login--
		lpo.verifyMyAccount().click();

		lpo.VerifyLogin().click();

		lpo.enterUsername().sendKeys(username);

		lpo.enterPassword().sendKeys(password);

		lpo.clickOnButton().click();

	}

	@DataProvider
	public Object[][] testData() {
		Object[][] data = new Object[1][2];

		data[0][0] = Constants.username;
		data[0][1] = Constants.password;

		return data;

	}

}
