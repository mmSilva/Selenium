package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.PageObject;

public class GenericMethods extends PageObject {

	public GenericMethods(WebDriver driver) {
		super(driver);
		}
		
	public void selectByVisibleText(WebElement element, String value) {
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
		}

}
