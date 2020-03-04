package guiTest.TestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSelenium {


     public static void main(String[] args){
        //Declara
        System.setProperty("webdriver.chrome.driver","src//test//resources//drivers//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();


        //Elementos Pagina Inicial
     //   WebElement GuiaMedico = driver.findElement(By.linkText("https://www.unimed.coop.br/guia-medico"));
      //  WebElement element=     driver.findElement(By.xpath("//input[@name='emailid']"));

        //driver.get("https://www.unimed.coop.br/");
         String url = "https://www.google.com/";
        AcessaUrl(driver, url);
        // driver.get(url);
    }

    // Dado que o usuário acessa o site "https://www.unimed.coop.br"
    public static void AcessaUrl(ChromeDriver driver, String url){
        driver.get(url);
    }



}







            //  E navega para "Guia Médico"
            //public void ClicaGuitMedico(){
              //  driver.get("https://www.unimed.coop.br/");
            //}








            // Cenário: valida apresentação de especialidade e cidade
            // Quando pesquisa médicos na cidade "Rio de Janeiro"
            // Então o sistema exibe uma lista de medicos com "Especialidade"
//            // E exibe a "Cidade"
//            WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
//            element.sendKeys("abc@gmail.com");
//                    WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
//            button.click();





           // Cenário: valida apresentação de especialidade e cidade
           // Quando pesquisa médicos na cidade "Rio de Janeiro"
           // Então o sistema exibe uma lista de medicos com "Especialidade"
           // E exibe a "Cidade"

//            Cenário: resultados não podem conter São Paulo
//            Quando pesquisa médicos na cidade "Rio de Janeiro"
//            Então o sistema não pode exibir a cidade de "São Paulo" nas "3" primeiras páginas



