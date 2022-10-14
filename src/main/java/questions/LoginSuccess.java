package questions;


import models.BusinessUnitData;
import models.LoginData;
import userinterfaces.StartSharpMainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class LoginSuccess implements Question<Boolean> {

    private LoginData loginData;

    public LoginSuccess(LoginData loginData) {
        this.loginData = loginData;
    }

    public static LoginSuccess message(LoginData loginData) {
        return new LoginSuccess(loginData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(StartSharpMainPage.WELCOME_MESSAGE, isVisible()).forNoMoreThan(10).seconds());
        String welcomeMessage = Text.of(StartSharpMainPage.WELCOME_MESSAGE).answeredBy(actor);
        return loginData.getSuccessMessage().equals(welcomeMessage);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }

}

