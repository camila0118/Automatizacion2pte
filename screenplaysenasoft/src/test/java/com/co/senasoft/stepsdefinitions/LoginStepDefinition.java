package com.co.senasoft.stepsdefinitions;

import com.co.senasoft.models.Credentials;
//import com.co.senasoft.questions.CompareProduct;
import com.co.senasoft.questions.CompareProduct;
import com.co.senasoft.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Mauro");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^He user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^the user enter the credentials$")
    public void theUserEnterTheCredentials(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(credentials));
    }

    @Then("^he could see the products$")
    public void heCouldSeeTheProducts() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareProduct.compare()
        , Matchers.equalTo("Mauricio")));

    }

}
