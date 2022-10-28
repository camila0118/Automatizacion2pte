package co.com.phptravels.steps;

import co.com.phptravels.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginPageSteps {

    LoginPage loginPage;

    @Step
    public void openPhpTravelsPage(){
        loginPage.open();
    }

    @Step
    public void enterCredentialsToLogin(String email, String password){
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
    }

    @Step
    public void validationTheAccountPage(String resultPageUrl){
        Assert.assertEquals(loginPage.resultUrl(), resultPageUrl);
    }

}
