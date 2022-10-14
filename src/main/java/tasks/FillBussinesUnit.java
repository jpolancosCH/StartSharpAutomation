package tasks;

import models.BusinessUnitData;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterfaces.menu.BusinessUnitsPage;

public class FillBussinesUnit implements Task {

    private BusinessUnitData businessUnitData;

    public FillBussinesUnit(BusinessUnitData businessUnitData) {
        this.businessUnitData = businessUnitData;
    }

    public static FillBussinesUnit form(BusinessUnitData businessUnitData) {
        return Tasks.instrumented(FillBussinesUnit.class, businessUnitData);
    }


    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(businessUnitData.getName()).into(BusinessUnitsPage.NAME_INPUT),
                Click.on(BusinessUnitsPage.PARENT_UNIT_DIV),
                Enter.theValue(businessUnitData.getParentUnit()).into(BusinessUnitsPage.PARENT_UNIT_INPUT),
                Hit.the(Keys.ENTER).into(BusinessUnitsPage.PARENT_UNIT_INPUT),
                Click.on(BusinessUnitsPage.SAVE_BUTTON)
        );
    }
}
