package co.com.phptravels.stepDefinitions;

import co.com.phptravels.steps.LoginPageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginStepDefinitions {

    @Steps
    LoginPageSteps login;

    @Given("that bob has an active account")
    public void thatBobHasAnActiveAccount() {
        login.openPhpTravelsPage();
    }

    @When("he sends user credentials email {string} and password {string}")
    public void heSendsUserCredentials(String email, String password) {
        login.enterCredentialsToLogin(email, password);
    }

    @Then("he should see the account page {string}")
    public void heShouldSeeTheAccountPage(String accountUrl) {
        login.validationTheAccountPage(accountUrl);
    }
}
