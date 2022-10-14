package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://serenity.is/demo/Account/Login/")
public class StartSharpLoginPage extends PageObject {
    public static final Target USERNAME_INPUT = Target.the("Input where we type the username").located(By.id("LoginPanel0_Username"));
    public static final Target PASSWORD_INPUT = Target.the("Input where we type the password").located(By.id("LoginPanel0_Password"));
    public static final Target LOGIN_BUTTON = Target.the("Button to confirm the login").located(By.id("LoginPanel0_LoginButton"));
    public static final Target ERROR_MESSAGE = Target.the("Button to confirm the login").located(By.xpath("//div[@class='toast toast-error']//child::div[@class='toast-message']"));

}
