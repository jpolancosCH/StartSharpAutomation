package questions;

import models.BusinessUnitData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import userinterfaces.menu.BusinessUnitsPage;

public class CreationBusinessUnit  implements Question<Boolean> {
    private BusinessUnitData businessUnitData;
    private BusinessUnitsPage businessUnitsPage;

    public CreationBusinessUnit(BusinessUnitData businessUnitData) {
        this.businessUnitData = businessUnitData;
    }
    public static CreationBusinessUnit successfully(BusinessUnitData businessUnitData) {
        return new CreationBusinessUnit(businessUnitData);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(BusinessUnitsPage.REFRESH_BUTTON));
        String newUnit = businessUnitsPage.getBusinessUnitLink(businessUnitData.getName()).getText();
        return businessUnitData.getName().equals(newUnit);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }



}
