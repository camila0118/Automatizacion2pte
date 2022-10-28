package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import okhttp3.Credentials;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.CompareProduct;
import tasks.Login;
import java.util.List;

public class LoginStepDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Cami");
        OnStage.theActorInTheSpotlight().can((BrowseTheWeb.with(hisBrowser)));
    }

    @Given("^el usuario esta en la pagina$")
    public void elUsuarioEstaEnLaPagina() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://develdfp.cloudsenactpi.net/#/home"));

    }

    @When("^el suario ingresa credenciales$")
    public void elSuarioIngresaCredenciales(List<Credentials>credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(credentials));

    }

    @Then("^el usuario aparece logueado$")
    public void elUsuarioApareceLogueado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareProduct.compare(),
                Matchers.equalTo("Camila")));

    }
}
