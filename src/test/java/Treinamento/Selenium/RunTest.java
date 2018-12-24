package Treinamento.Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.FormPage;
import pages.HomePage;

import java.awt.Toolkit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class RunTest {
	static WebDriver driver;
	static WebElement element;
	static HomePage homePage;
	static FormPage formPage;

	
   
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pichau\\git\\repository\\Selenium\\src\\main\\java\\resources\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", this.getClass().
		//		getClassLoader().getResource("chromedriver.exe").getPath());
		
		 		 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
	
		homePage = new HomePage(driver);
		formPage = new FormPage(driver);
		
	}

	@After
	public void tearDownAfterClass() throws Exception {
	driver.close();
	}

	@Test
	public void test() throws Exception {				
		homePage.entrarTelaInicial();
		homePage.clickAbrirForm();
		Thread.sleep(5000);
		//Preenchimento dos dados da primeira página
		formPage.selecionarCarro("Volvo");
		formPage.selecionarQtdLugares("4");
		formPage.selecionarPerfomance("10");
		formPage.selecionarDataFabricacao("20/11/2018");
		formPage.selecionarCombustivel("Electric Power");
		formPage.selecionarPreco("75000");
		formPage.selecionarAnnualMilage("500");
		
		//botão próxima página
		formPage.clickNext();
		
		//Preenchimento dos dados da segunda página
		formPage.preencherNome("Aurelion");
		formPage.preencherSobrenome("Sol");
		formPage.preencherDataNascimento("27/10/1997");
		formPage.clickGender();
		formPage.preencherEndereco("Chambiges");
		formPage.selecionarPais("France");
		formPage.preencherCep("94500");
		formPage.preencherCidade("Paris");
		formPage.selecionarProfissao("Employee");
		formPage.clickHobbie();
		
		//botão próxima página
		formPage.clickNext();
		
		//Preenchimento dos dados da terceira página
		formPage.preencherDataInicio("03/03/2019");
		formPage.selecionarInsurancesum("7");
		formPage.selecionarMeritrating("Super");
		formPage.selecionarDamageinsurance("Full");
		formPage.clickOptionProducts();
		formPage.selecionarCortesia("Yes");
		
		//botão próxima página
		formPage.clickNext();
		
		//Preenchimento dos dados da quarta página
		formPage.clickPreco();
		
		//botão próxima página
		formPage.clickNext();
		
		//Preenchimento dos dados da quarta página
		formPage.preencherEmail("aurelio.sol@gmail.com");
		formPage.preencherFone("35252805");
		formPage.preencherUserName("AuSol18");
		formPage.preencherSenha("Asol7520");
		formPage.preencherConfirmarSenha("Asol7520");
		formPage.clickSend();
		formPage.clickOK();
		

	}
}
