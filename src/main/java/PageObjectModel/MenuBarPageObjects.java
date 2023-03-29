package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuBarPageObjects {

	// This driver dont have scope--
	public WebDriver driver;
	
	//MenuBar x-path--
	private By desktop = By.xpath("(//a[@class='dropdown-toggle'])[2]");
	
	private By laptopandnotebooks = By.xpath("(//a[@class='dropdown-toggle'])[3]");
	
	private By components = By.xpath("(//a[@class='dropdown-toggle'])[4]");
	
	private By tablets = By.xpath("//a[text()='Tablets']");
	
	private By software = By.xpath("//a[text()='Software']");
	
	private By phoneandPDAs = By.xpath("//a[text()='Phones & PDAs']");
	
	private By cameras = By.xpath("//a[text()='Cameras']");

	private By mp3players = By.xpath("(//a[@class='dropdown-toggle'])[5]");

	public MenuBarPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement verifyDesktop() {

		return driver.findElement(desktop);
	}
	public WebElement verifyLaptopAndNotebooks() {

		return driver.findElement(laptopandnotebooks);
	}
	public WebElement verifyComponents() {

		return driver.findElement(components);
	}
	public WebElement verifyTablets() {

		return driver.findElement(tablets);
	}
	public WebElement verifySoftware() {

		return driver.findElement(software);
	}
	public WebElement verifyPhonesAndPDAs() {

		return driver.findElement(phoneandPDAs);
	}
	public WebElement verifyCameras() {

		return driver.findElement(cameras);
	}

	public WebElement verifyMP3Players() {

		return driver.findElement(mp3players);
	}


}
