package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.FooterPageObjects;
import Resources.baseClass;

public class VerifyFooter extends baseClass {

	@Test
	public void footer() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		FooterPageObjects obj2 = new FooterPageObjects(driver);

		driver.manage().window().maximize();

		// Footer (No. of count of links)--
		for (int i = 0; i < obj2.VerifyIECM().size(); i++) {

			obj2.VerifyIECM().get(i).click();

			System.out.println("text- " + obj2.VerifyIECM().get(i).getText());

		}

	}

}
