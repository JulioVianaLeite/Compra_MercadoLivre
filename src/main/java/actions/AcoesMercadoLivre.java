package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.PageMercadoLivre;
import utils.DriverContext;

public class AcoesMercadoLivre extends PageMercadoLivre {
	protected WebDriverWait wait;
	
	public AcoesMercadoLivre(){
		wait = new WebDriverWait(DriverContext.getDriver(), 60);
		}
	
	//clicar em Sing In
	public void clickConfirmaçao() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarConfirmaçao)).click();
	}
	
	public void clickCategoria() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarCategorias)).click();
	}
	
	
	public void clickTecnologia() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarTecnologia)).click();
	}
	
	public void clickVideoGames() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarVideoGame)).click();
	}

	public void clickNoXCep() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarNoXCep)).click();
	}
		

	public void clickFULLs() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarFULL)).click();
	}
	
	public void clickPS5() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarPS5)).click();
	}
	
	public void clickMaisDe250() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarMaisDe250)).click();
	}
	
	public void clickSaoPaulo() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarSaoPaulo)).click();
	}
	
	public void clickNoX() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarNoX)).click();
	}
	
	public void clickCallofDuty() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarCallofDuty)).click();
	}
	
	public void clickJogoCODVSE() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarJogoCODVSE)).click();
	}
	
	public void clickComprar() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarComprar)).click();
	}	
	
	
	
	
}
