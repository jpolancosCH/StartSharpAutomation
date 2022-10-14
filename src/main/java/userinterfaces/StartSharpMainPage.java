package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class StartSharpMainPage extends PageObject {
    public static final Target WELCOME_MESSAGE = Target.the("Message to validate the successfully login").located(By.xpath("//h1[contains(text(),'Dashboard')]"));
}
