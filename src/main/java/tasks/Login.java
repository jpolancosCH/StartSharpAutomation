package tasks;

import models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.StartSharpLoginPage;

public class Login implements Task {

    private LoginData loginData;

    public Login(LoginData loginData) {
        this.loginData = loginData;
    }

    public static Login withCredentials(LoginData loginData) {
        return Tasks.instrumented(Login.class, loginData);
    }


    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(loginData.getUsername()).into(StartSharpLoginPage.USERNAME_INPUT),
                Enter.theValue(loginData.getPassword()).into(StartSharpLoginPage.PASSWORD_INPUT),
                Click.on(StartSharpLoginPage.LOGIN_BUTTON)
        );
    }


}
