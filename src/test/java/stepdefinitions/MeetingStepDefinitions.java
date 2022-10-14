package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.MeetingData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.CreationMeeting;
import tasks.FillMeeting;
import tasks.GoMeetings;

public class MeetingStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());}

    @Given("^Than I am on the meeting page and click on the new button$")
    public void thanIAmOnTheMeetingPage() {
        OnStage.theActorCalled("Julian").wasAbleTo(GoMeetings.page());
    }

    @When("I enter the meting data")
    public void iEnterTheMetingData(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillMeeting.form(MeetingData.setData(dataTable).get(0)));
    }

    @Then("I should see the meeting list data")
    public void iShouldSeeTheMeetingListData(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CreationMeeting.successfully(MeetingData.setData(dataTable).get(0))));
    }
}
