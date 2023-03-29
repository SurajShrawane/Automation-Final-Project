package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterPageObjects {
	
	// This driver dont have scope--
	public WebDriver driver;

	////Footer (No. of count of links)----
	private By icem = By.xpath("(//footer//div[@class='row']//div//ul//li)//a");

	public FooterPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}
	public List<WebElement> VerifyIECM() {

		return driver.findElements(icem);
	}

	
	/*private By aboutus = By.xpath("//a[text()='About Us']");

	private By deliveryinformation = By.xpath("//a[text()='Delivery Information']");

	private By privacypolicy = By.xpath("//a[text()='Privacy Policy']");

	private By termsandconditions = By.xpath("//a[text()='About Us']");

	//Customer Service--
	private By contactus = By.xpath("//a[text()='Contact Us']");

	private By returns = By.xpath("//a[text()='Returns']");

	private By sitemap = By.xpath("//a[text()='Site Map']");

	//Extras--
	private By brands = By.xpath("//a[text()='Brands']");

	private By giftcertificates = By.xpath("//a[text()='Gift Certificates']");

	private By affiliate = By.xpath("//a[text()='Affiliate']");

	private By specials = By.xpath("//a[text()='Specials']");

	//My Account--
	private By myaccount = By.xpath("//a[text()='My Account']");

	private By orderhistory = By.xpath("//a[text()='Order History']");

	private By wishlist = By.xpath("//a[text()='Wish List']");

	private By newsletter = By.xpath("//a[text()='Newsletter']");
*/
	

	/*public WebElement verifyAboutus() {

		return driver.findElement(aboutus);
	}

	public WebElement verifyDeliveryInformation() {

		return driver.findElement(deliveryinformation);
	}

	public WebElement verifyPrivacyPolicy() {

		return driver.findElement(privacypolicy);
	}

	public WebElement verifyTermsAndConditions() {

		return driver.findElement(termsandconditions);
	}

	public WebElement verifyContactUs() {

		return driver.findElement(contactus);
	}

	public WebElement verifyReturns() {

		return driver.findElement(returns);
	}

	public WebElement verifySiteMap() {

		return driver.findElement(sitemap);
	}

	public WebElement verifyBrands() {

		return driver.findElement(brands);
	}

	public WebElement verifyGiftCertificates() {

		return driver.findElement(giftcertificates);
	}

	public WebElement verifyAffiliate() {

		return driver.findElement(affiliate);
	}

	public WebElement verifySpecials() {

		return driver.findElement(specials);
	}

	public WebElement verifyMyAccount() {

		return driver.findElement(myaccount);
	}

	public WebElement verifyOrderHistory() {

		return driver.findElement(orderhistory);
	}

	public WebElement verifyWishList() {

		return driver.findElement(wishlist);
	}

	public WebElement verifyNewsletter() {

		return driver.findElement(newsletter);
	}*/
}
