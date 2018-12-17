package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageObject {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;
		
	public PageObject (WebDriver driver) {
		PageObject.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}
}
