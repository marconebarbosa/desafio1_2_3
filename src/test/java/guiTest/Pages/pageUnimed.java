package guiTest.Pages;

import guiTest.TestRunner.TestRule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



public class pageUnimed {

    //WebElement menuPrincipal = driver.findElement(By.id("menuPrincipal"));
   // WebElement BuscaDetalhada = driver.findElement(By.id("busca_detalhada"));
   // WebElement Unidade = driver.findElement(By.className("form-escolher-unimed-gm"));

    public pageUnimed(){
        PageFactory.initElements(TestRule.getDriver(),this);

    }

    public static void AcessaUrl(String url) {
        TestRule.getDriver().get(url);
    }

    public static void clickGuiaMedico() {
    }
}


