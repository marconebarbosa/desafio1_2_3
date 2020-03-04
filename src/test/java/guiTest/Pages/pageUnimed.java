package guiTest.Pages;

import guiTest.StepDefinition.TestRule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.time.Duration;

public class pageUnimed {

    //ELEMENTOS
   public static WebElement element;



    public pageUnimed(){
        PageFactory.initElements(TestRule.getDriver(),this);

        //ELEMENTOS
        element = TestRule.getDriver().findElement(By.id("btnFazerLogin"));
    }

    public static void AcessaUrl(String url) throws InterruptedException {
     Actions actions = new Actions(TestRule.getDriver());
     TestRule.getDriver().get(url);
     //TestRule.getDriver().//actions.click();
     //test.getDriver().get(url);
        WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), 100);
        element.click();
        wait.wait(1000);
    }



}


