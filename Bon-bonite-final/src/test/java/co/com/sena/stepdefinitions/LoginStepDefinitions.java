package co.com.sena.stepdefinitions;

import co.com.sena.tasks.LoginTasks;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp() {

        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("he user is on the page")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
    }

    @When("he user his log")
    public void heUserHisLog() {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTasks.enter());
    }

    @Then("he could see id")
    public void heCouldSeeId() {

    }

}
