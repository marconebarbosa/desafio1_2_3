package guiTest.Pages;

import guiTest.StepDefinition.TestRule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


public class pageUnimed {

    //ELEMENTOS


    public pageUnimed(){
        PageFactory.initElements(TestRule.getDriver(),this);
    }

    public static void AcessaUrl(String url) {
     // Actions actions = new Actions(TestRule.getDriver());
      TestRule.getDriver().get(url);
      //TestRule.getDriver().//actions.click();
       // test.getDriver().get(url);
    }

}


