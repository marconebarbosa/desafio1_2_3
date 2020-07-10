package guiTest.Pages;

import guiTest.StepDefinition.TestRule;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class pageMagaLu {

	public static WebElement element;

	public static int tempoCurtoEspera = 2000;
	public static int tempoMedioEspera = 5000;

/*
 *  Declaracao de elementos na pagina
 */	 
//	@FindBy(how = How.ID, using = "inpHeaderSearch") static String TxtPesquisaCabecalho;
//	@FindBy(how = How.ID, using = "btnHeaderSearch") static String btnHeaderSearch;
//	@FindBy(how = How.CSS, using = ".button__buy-product-detail") static String btnAdicionarSacola;
//	

	public pageMagaLu() {
		PageFactory.initElements(TestRule.getDriver(), this);

		element = TestRule.getDriver().findElement(By.id("btnFazerLogin"));
	}

	public static void AcessaUrl(String url) throws InterruptedException {
		TestRule.getDriver().get(url);
		
		WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), 100);
		Thread.sleep(tempoMedioEspera);
	}

	public static void Realiza_pesquisa(String descricao) throws InterruptedException {

		TestRule.getDriver().findElement(By.id("inpHeaderSearch")).sendKeys(descricao);
		TestRule.getDriver().findElement(By.id("btnHeaderSearch")).click();

		Thread.sleep(tempoMedioEspera);
	}

	public static void AdicionaNaSacola() {     
		TestRule.getDriver().findElement(By.id("nm-product-cg4b37d163")).click();
		TestRule.getDriver().findElement(By.cssSelector(".button__buy-product-detail")).click();
	};

	public static void AcessaSacola() {
		TestRule.getDriver().get("https://sacola.magazineluiza.com.br/#/");
	};

	public static String RetornaItemSacola() {
		String nome; 
		nome = TestRule.getDriver().findElement((By.cssSelector(".BasketItemProduct-info-title > p:nth-child(1)"))).getText();
		
		return nome;
	};
	
	public static String RetornaPesquisa() {
		String nome; 
		nome = TestRule.getDriver().findElement((By.className("nm-product-name"))).getText();
		
		return nome;
	};


}
