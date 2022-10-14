package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.LoginData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.LoginFailed;
import questions.LoginSuccess;
import tasks.Login;
import tasks.OpenUp;

import java.util.List;

public class LoginStepDefinitions {

    @Before
    public void setStage() {OnStage.setTheStage(new OnlineCast());}

    @Given("^Than I am on the login page$")
    public void thanIAmOnTheLoginPage() throws Exception {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.loginPage());
    }

    @When("Enter my username and password, and click login button")
    public void enterMyUsernameAndPasswordAndClickLoginButton(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withCredentials(LoginData.setData(dataTable).get(0)));
    }

    @Then("I should see the success login message")
    public void iShouldSeeTheSuccessLoginMessage(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginSuccess.message(LoginData.setData(dataTable).get(0))));
    }

    @Then("I should see the error login message")
    public void iShouldSeeTheErrorLoginMessage(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginFailed.message(LoginData.setData(dataTable).get(0))));
    }
}
