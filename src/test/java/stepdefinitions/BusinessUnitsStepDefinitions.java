package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.BusinessUnitData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.CreationBusinessUnit;
import tasks.FillBussinesUnit;
import tasks.GoBusinessUnit;
import userinterfaces.menu.BusinessUnitsPage;
import userinterfaces.menu.MeetingsPage;

public class BusinessUnitsStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Than I am on the business units page and click on the new button$")
    public void thanIAmOnTheBusinessUnitsPage() {
        OnStage.theActorCalled("Julian").wasAbleTo(GoBusinessUnit.page());
    }

    @When("I enter the business unit data")
    public void iEnterTheBusinessUnitData(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillBussinesUnit.form(BusinessUnitData.setData(dataTable).get(0)));
    }

    @Then("I should see the business unit list data")
    public void iShouldSeeTheBusinessUnitListData(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CreationBusinessUnit.successfully(BusinessUnitData.setData(dataTable).get(0))));
    }
}
