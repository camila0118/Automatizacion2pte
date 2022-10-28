package co.com.sena.stepdefinitions;

import co.com.sena.models.RegitrationData;
import co.com.sena.tasks.RegistrationTasks;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegistrationStepDefinitions {

    @When("enter requested data")
    public void enterRequestedData() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationTasks.enter());

    }

    @Then("he user enters the page")
    public void heUserEntersThePage() {

    }
}
