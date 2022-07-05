package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverPrincipal;
import actions.AcoesMercadoLivre;

public class mercedolivrestep {
	
	DriverPrincipal principal = new DriverPrincipal();
	WebDriver driver = principal.AbrirUrl();
	AcoesMercadoLivre action = PageFactory.initElements(driver, AcoesMercadoLivre.class);
	
	public mercedolivrestep() throws Exception {

	}
	

	@Given("o usuario acesse {string}")
	public void usuario_acesse(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@And("confirme o acesso dos cookies")
	public void confirme_o_acesso_dos_cookies() throws InterruptedException {
		Thread.sleep(2000);
	    action.clickConfirmaçao();
	    Thread.sleep(2000);
	}

	@And("escolha a categoria e tipo de produto desejado")
	public void escolha_a_categoria_e_tipo_de_produto_desejado() throws InterruptedException {
		action.clickCategoria();
		Thread.sleep(2000);
		action.clickTecnologia();
		Thread.sleep(2000);
		action.clickVideoGames();
		Thread.sleep(2000);
	}

	@When("a pagina abre o usuario pode escolher a entrega FULL")
	public void a_pagina_abre_o_usuario_pode_escolher_a_entrega_full() throws InterruptedException {
		action.clickFULLs();
		Thread.sleep(2000);
	}

	@And("escolhe qual console, valor e regiao do protudo que ele deseja")
	public void escolhe_qual_console_valor_e_regiao_do_protudo_que_ele_deseja() throws InterruptedException {
		action.clickPS5();
		Thread.sleep(2000);
		action.clickMaisDe250();
		Thread.sleep(2000);
		action.clickSaoPaulo();
		Thread.sleep(2000);
	}

	@And("escolhendo a franquia e o jogo desejado")
	public void escolhendo_a_franquia_e_o_jogo_desejado() throws InterruptedException {
		action.clickNoX();
		Thread.sleep(2000);
		action.clickCallofDuty();
		Thread.sleep(2000);
		action.clickJogoCODVSE();
		//Thread.sleep(20000);
	}

	@Then("o usuario pode visualizar a descricao do produto")
	public void o_usuario_pode_visualizar_a_descricao_do_produto() throws InterruptedException {
		driver.get("https://www.mercadolivre.com.br/call-of-duty-vanguard-standard-edition-activision-ps5-fisico/p/MLB18577159?pdp_filters=state:TUxCUFNBT085N2E4%7Cshipping:fulfillment%7Cprice:250-*%7Ccategory:MLB186456#searchVariation=MLB18577159&position=1&search_layout=grid&type=product&tracking_id=f267f534-cece-4c34-b6cd-f7cc2b9aea42");
		assertEquals("Call of Duty: Vanguard Standard Edition Activision PS5 Físico | Frete grátis", driver.getTitle());
		//Thread.sleep(2000);
	}

	@And("finalizando o pedido do produto")
	public void finalizando_o_pedido_do_produto() {
		action.clickComprar();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
