package questions;

import models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.StartSharpLoginPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginFailed implements Question<Boolean> {

    private LoginData loginData;

    public LoginFailed(LoginData loginData) {
        this.loginData = loginData;
    }

    public static LoginFailed message(LoginData loginData) {
        return new LoginFailed(loginData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(StartSharpLoginPage.ERROR_MESSAGE, isVisible()).forNoMoreThan(10).seconds());
        String errorMessage = Text.of(StartSharpLoginPage.ERROR_MESSAGE).answeredBy(actor);
        return loginData.getErrorMessage().equals(errorMessage);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }

}

