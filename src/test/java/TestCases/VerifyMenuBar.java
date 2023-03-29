package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.MenuBarPageObjects;
import Resources.baseClass;

public class VerifyMenuBar extends baseClass {
	@Test
	public void MenuBar() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		MenuBarPageObjects obj1 = new MenuBarPageObjects(driver);

		driver.manage().window().maximize();

		// MenuBar--
		obj1.verifyDesktop().click();

		obj1.verifyLaptopAndNotebooks().click();

		obj1.verifyComponents().click();

		obj1.verifyTablets().click();

		obj1.verifySoftware().click();

		obj1.verifyPhonesAndPDAs().click();

		obj1.verifyCameras().click();

		obj1.verifyMP3Players().click();

	}

}
