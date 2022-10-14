package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.StartSharpMenu;
import userinterfaces.menu.BusinessUnitsPage;
import userinterfaces.menu.MeetingsPage;

public class GoMeetings implements Task {

    public static GoMeetings page() {
        return Tasks.instrumented(GoMeetings.class);
    }


    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StartSharpMenu.MEETING_MENU_OPTION),
                Click.on(StartSharpMenu.MEETING_MEETINGS_MENU_OPTION),
                Click.on(MeetingsPage.NEW_MEETING_BUTTON)
        );
    }
}
