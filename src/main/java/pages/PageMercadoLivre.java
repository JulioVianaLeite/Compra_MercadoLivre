package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.DriverContext;

//Classe onde estar�o os mapeamentos da p�gina

public class PageMercadoLivre{
	
	
	//Construtor
	public PageMercadoLivre(){
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[1]/div[2]/button[1]")
	protected WebElement clicarConfirmaçao;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Categorias')]")
	protected WebElement clicarCategorias;

	@FindBy(how=How.XPATH, using="//a[contains(text(),'Tecnologia')]")
	protected WebElement clicarTecnologia;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Video Games')]")
	protected WebElement clicarVideoGame;
	
	@FindBy(how=How.XPATH, using="//body/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
	protected WebElement clicarNoXCep;
	
	@FindBy(how=How.XPATH, using="//input[@id='shipping_highlighted_fulfillment']")
	protected WebElement clicarFULL;
	
	@FindBy(how=How.XPATH, using="//body/main[@id='root-app']/div[1]/div[4]/div[1]/aside[1]/section[1]/div[4]/ul[1]/li[4]/a[1]")
	protected WebElement clicarPS5;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Mais de R$250')]")
	protected WebElement clicarMaisDe250;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'São Paulo')]")
	protected WebElement clicarSaoPaulo;
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div/div/div[2]/div/button")
	protected WebElement clicarNoX;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"root-app\"]/div/div[4]/div/aside/section[2]/div[7]/ul/li[2]/a")
	protected WebElement clicarCallofDuty;
	
	@FindBy(how=How.XPATH, using="//h2[contains(text(),'Call of Duty: Vanguard Standard Edition Activision')]")
	protected WebElement clicarJogoCODVSE;
	
	@FindBy(how=How.XPATH, using="//body/main[@id='root-app']/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/button[1]")
	protected WebElement clicarComprar;
	

	
	
	
	
	
	
	
	
}
