
package TestCases;

import java.time.Duration;


import org.testng.annotations.Test;

import PageObjectModel.HeaderPageObjects;
import Resources.CommonMethods;
import Resources.Constants;
import Resources.baseClass;

public class VerifyHeader extends baseClass {
	@Test
	public void header() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		HeaderPageObjects obj = new HeaderPageObjects(driver);

		driver.manage().window().maximize();

		// Header--
		obj.verifyCurrency().click();

		obj.clickOnTelephone().click();
		
		CommonMethods.handleAssertions(obj.telephonetextnumber().getText(),Constants.expectedtelephonenum,"Error message is not matching");
		
		System.out.println("Telephonenumber- "+obj.telephonetextnumber().getText());
	
		//Assertion for the understanding purpose--
		
		/*SoftAssert a = new SoftAssert();

		String actual =obj.telephonetextnumber().getText();

		String expected = "123456879";
		
		a.assertEquals(actual, expected, "Error message is not matching");

		a.assertAll();
		*/

		obj.verifyMyAccount().click();

		obj.verifyWishlist().click();

		obj.verifyShoppingCart().click();

		obj.verifyCheckout().click();

	}
}
