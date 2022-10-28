package com.co.screenplay.stepsdefinitions;

import com.co.screenplay.exceptions.MessageProductException;
import com.co.screenplay.questions.ValidationShoes;
import com.co.screenplay.tasks.BuyShoes;
import com.co.screenplay.utils.Constants;
import cucumber.api.java.After;
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

public class BuyStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp() {

        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Mauricio");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^he user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
    }

    @When("^he user select a product$")
    public void heUserSelectAProduct() {

        OnStage.theActorInTheSpotlight().attemptsTo(BuyShoes.click());
    }


    @Then("^he could see product$")
    public void heCouldSeeProduct() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationShoes.compare()
                , Matchers.is(Matchers.equalTo("Sandalias color caramelo con detalles color blanco, vainilla y oro en cuero - 3")))
                .orComplainWith(MessageProductException.class,
                        Constants.MESSAGE_PRODUCT));
    }


}
