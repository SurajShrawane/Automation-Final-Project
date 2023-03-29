package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterPageObjects {

	// This driver dont have scope--
	public WebDriver driver;

	//Footer (No. of count of links)----
	private By icem = By.xpath("(//footer//div[@class='row']//div//ul//li)//a");

	public FooterPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public List<WebElement> VerifyIECM() {

		return driver.findElements(icem);
	}

}
