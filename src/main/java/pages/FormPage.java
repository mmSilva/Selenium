package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import generics.GenericMethods;

public class FormPage extends PageObject {
	GenericMethods gem;
	
	public FormPage(WebDriver driver) {
		super(driver);
		gem = new GenericMethods(driver);
	}
	
	@FindBy(how = How.ID, using = "make")
	protected WebElement marca;
	
	@FindBy(how = How.ID, using = "model")
	protected WebElement modelo;
	
	@FindBy(how = How.ID, using = "cylindercapacity")
	protected WebElement capacidade;
	
	@FindBy(how = How.ID, using = "engineperformance")
	protected WebElement performance;
	
	@FindBy(how = How.ID, using = "dateofmanufacture")
	protected WebElement dataFabricacao;
	
	@FindBy(how = How.ID, using = "numberofseats")
	protected WebElement lugares;
	
	@FindBy(how = How.ID, using = "numberofseatsmotorcycle")
	protected WebElement luagresMoto;
	
	@FindBy(how = How.ID, using = "fuel")
	protected WebElement combustivel;
	
	@FindBy(how = How.ID, using = "payload")
	protected WebElement cargaUtil;
	
	@FindBy(how = How.ID, using = "totalweight")
	protected WebElement pesoTotal;
	
	@FindBy(how = How.ID, using = "listprice")
	protected WebElement preco;
	
	@FindBy(how = How.ID, using = "annualmileage")
	protected WebElement annualmileage;
	
	//fim primeira pagina
	
	@FindBy(how = How.ID, using = "nextenterinsurantdata")
	protected WebElement btnNext;
	
	@FindBy(how = How.ID, using = "preventervehicledata")
	protected WebElement btnPrev;
	
	@FindBy(how = How.ID, using = "firstname")
	protected WebElement nome;
	
	@FindBy(how = How.ID, using = "lastname")
	protected WebElement sobrenome;

	@FindBy(how = How.ID, using = "birthdate")
	protected WebElement nascimento;
	
	@FindBy(how = How.ID, using = "gendermale")
	protected WebElement genero;
	
	@FindBy(how = How.ID, using = "country")
	protected WebElement pais;
	
	@FindBy(how = How.ID, using = "streetaddress")
	protected WebElement endereco;
	
	@FindBy(how = How.ID, using = "zipcode")
	protected WebElement cep;
	
	@FindBy(how = How.ID, using = "city")
	protected WebElement cidade;
	
	@FindBy(how = How.ID, using = "occupation")
	protected WebElement profissao;
	
	@FindBy(how = How.ID, using ="skydiving")
	protected WebElement skydiving;
	
	@FindBy(how = How.ID, using = "startdate")
	protected WebElement dataInicio;
	
	@FindBy(how = How.ID, using = "insurancesum")
	protected WebElement insurancesum;
	
	@FindBy(how = How.ID, using = "meritrating")
	protected WebElement meritrating;
	
	@FindBy(how = How.ID, using = "damageinsurance")
	protected WebElement damageinsurance;
	
	@FindBy(how = How.ID, using ="EuroProtection")
	protected WebElement optionProducts;
	
	@FindBy(how = How.ID, using = "courtesycar")
	protected WebElement courtesycar;
	
	@FindBy(how = How.ID, using = "selectultimate")
	protected WebElement selectPrice;
	
	@FindBy(how = How.ID, using = "email")
	protected WebElement email;
	
	@FindBy(how = How.ID, using = "phone")
	protected WebElement phone;
	
	@FindBy(how = How.ID, using = "username")
	protected WebElement username;
	
	@FindBy(how = How.ID, using = "password")
	protected WebElement password;
	
	@FindBy(how = How.ID, using = "confirmpassword")
	protected WebElement confirmpassword;
	
	@FindBy(how = How.ID, using = "sendemail")
	protected WebElement btnSendForm;
	
	@FindBy(how = How.ID, using = "confirm")
	protected WebElement btnOK;

	
	//Métodos dos botões do formulário
	public void clickNext(){
		wait.until(ExpectedConditions.elementToBeClickable(btnNext)).click();
	}
	public void clickPrev(){
		wait.until(ExpectedConditions.elementToBeClickable(btnPrev)).click();
	}
	
	public void clickOK(){
		wait.until(ExpectedConditions.elementToBeClickable(btnOK)).click();
	}
	
	public void clickSend(){
		wait.until(ExpectedConditions.elementToBeClickable(btnSendForm)).click();
	}
	
	
	//Métodos preenchimento de dados no formulário
	
	public void selecionarCarro(String carro) {
		gem.selectByVisibleText(marca, carro);
	}
	public void selecionarQtdLugares(String qtd) {
		gem.selectByVisibleText(lugares, qtd);
	}
	
	public void selecionarModelo(String tipo) {
		gem.selectByVisibleText(modelo, tipo);
	}
	
	public void selecionarPerfomance(String dado) {
		gem.selectByVisibleText(performance, dado);
	}
	
	public void selecionarDataFabricacao(String data) {
		gem.selectByVisibleText(dataFabricacao, data);
	}
	
	public void selecionarCombustivel(String energia) {
		gem.selectByVisibleText(combustivel, energia);
	}
	public void selecionarPreco(String valor) {
		gem.selectByVisibleText(preco, valor);
	}
	
	public void selecionarAnnualMilage(String valor) {
		gem.selectByVisibleText(annualmileage, valor);
	}
	
	public void preencherNome(String seuNome) {
		gem.selectByVisibleText(nome, seuNome);
	}
	
	public void preencherSobrenome(String seuSobrenome) {
		gem.selectByVisibleText(sobrenome, seuSobrenome);
	}
	
	public void preencherDataNascimento(String aniversario) {
		gem.selectByVisibleText(nascimento, aniversario);
	}
	
	public void clickGender(){
		wait.until(ExpectedConditions.elementToBeClickable(genero)).click();
	}

	public void preencherEndereco(String rua) {
		gem.selectByVisibleText(endereco, rua);	
	}
	
	public void selecionarPais(String opcaoPais) {
		gem.selectByVisibleText(pais, opcaoPais);
	}
	
	public void preencherCep(String zipCode) {
		gem.selectByVisibleText(cep, zipCode);
	}
		
	public void preencherCidade(String string) {
			gem.selectByVisibleText(cidade, string);
	}
	
	public void selecionarProfissao(String occupation) {
		gem.selectByVisibleText(profissao, occupation);
	}
	
	public void clickHobbie() {
		wait.until(ExpectedConditions.elementToBeClickable(skydiving)).click();
	}
	
	public void preencherDataInicio(String startDate) {
		gem.selectByVisibleText(dataInicio, startDate);
	}
	
	public void selecionarInsurancesum(String insurancesumOP) {
		gem.selectByVisibleText(insurancesum, insurancesumOP);
	}
	
	public void selecionarMeritrating(String meritratingOP) {
		gem.selectByVisibleText(meritrating, meritratingOP);
	}
	
	public void selecionarDamageinsurance(String damageinsuranceOP) {
		gem.selectByVisibleText(damageinsurance, damageinsuranceOP);
	}
	
	public void clickOptionProducts() {
		wait.until(ExpectedConditions.elementToBeClickable(optionProducts)).click();
	}
	
	public void selecionarCortesia(String yes) {
		gem.selectByVisibleText(courtesycar, yes);
	}
	
	public void clickPreco() {
		wait.until(ExpectedConditions.elementToBeClickable(selectPrice)).click();;
	}
	
	public void preencherEmail(String mail) {
		gem.selectByVisibleText(email, mail);
	}
	
	public void preencherFone(String fone) {
		gem.selectByVisibleText(phone, fone);
	}
	
	public void preencherUserName(String nick) {
		gem.selectByVisibleText(username, nick);
	}
	
	public void preencherSenha(String senha) {
		gem.selectByVisibleText(password, senha);
	}	
	
	public void preencherConfirmarSenha(String confirmarSenha) {
		gem.selectByVisibleText(confirmpassword, confirmarSenha);
	}
	
			
}
