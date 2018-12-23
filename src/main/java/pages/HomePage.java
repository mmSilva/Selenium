package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageObject {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.ID, using = "nav_automobile")
	protected WebElement automobileMenuButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"app_sub_title\"]")
	protected WebElement vehicleInsurance;
	
	public void entrarTelaInicial() {
		driver.get("http://sampleapp.tricentis.com/101/index.php");
	}
	
	public void clickAbrirForm(){
		wait.until(ExpectedConditions.elementToBeClickable(automobileMenuButton)).click();
	}
	

}
