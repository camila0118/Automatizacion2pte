package com.co.stepsdefinitions;

import com.co.exceptions.CaptureError;
import com.co.models.Credentials;
import com.co.questions.CompareProduct;
import com.co.tasks.Login;
import com.co.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefinition {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Isa");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^he user is in the webpage$")
    public void heUserIsInTheWebpage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^he user login$")
    public void heUserLogin(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.heUseris(credentials));

    }

    @Then("^he could see login successful$")
    public void heCouldSeeLoginSuccessful() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareProduct.compare()
        , Matchers.is(Constants.COMPARE_PRODUCTS)).orComplainWith(CaptureError.class
        ,Constants.MESSAGE_ERROR_PRODUCT));

    }

}
