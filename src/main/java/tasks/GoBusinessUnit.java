package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.StartSharpMenu;
import userinterfaces.menu.BusinessUnitsPage;

public class GoBusinessUnit implements Task {

    public static GoBusinessUnit page() {
        return Tasks.instrumented(GoBusinessUnit.class);
    }


    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StartSharpMenu.ORGANIZATION_MENU_OPTION),
                Click.on(StartSharpMenu.ORGANIZATION_BUSINESS_UNIT_MENU_OPTION),
                Click.on(BusinessUnitsPage.NEW_BUSINESS_UNIT_BUTTON)
        );
    }
}
