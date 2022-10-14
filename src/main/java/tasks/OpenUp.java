package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.StartSharpLoginPage;

public class OpenUp implements Task {

    private StartSharpLoginPage startSharpLoginPage;

    public static OpenUp loginPage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(startSharpLoginPage)
        );
    }

}
