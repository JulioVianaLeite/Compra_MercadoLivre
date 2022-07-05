import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.AcoesMercadoLivre;
import utils.Constantes;
import utils.DriverContext;

class AutomacaoMercadoLivre {

	WebDriver driver;
	AcoesMercadoLivre accont;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constantes.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("https://www.mercadolivre.com.br/");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		accont = new AcoesMercadoLivre();
	}

	@Test
	void test() throws InterruptedException {
		Thread.sleep(4000);
		accont.clickConfirmaçao();
		Thread.sleep(2000);
		accont.clickCategoria();
		Thread.sleep(1000);
		accont.clickTecnologia();
		Thread.sleep(1000);
		accont.clickVideoGames();
		Thread.sleep(3000);
		//accont.clickNoXCep();
		Thread.sleep(3000);
		accont.clickFULLs();
		Thread.sleep(5000);
		accont.clickPS5();
		Thread.sleep(3000);
		accont.clickMaisDe250();
		Thread.sleep(4000);
		accont.clickSaoPaulo();
		Thread.sleep(4000);
		accont.clickNoX();
		Thread.sleep(4000);
		accont.clickCallofDuty();
		Thread.sleep(4000);
		accont.clickJogoCODVSE();
		Thread.sleep(4000);
		accont.clickComprar();
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		//Thread.sleep(10000);
		//driver.quit();
	}

}
