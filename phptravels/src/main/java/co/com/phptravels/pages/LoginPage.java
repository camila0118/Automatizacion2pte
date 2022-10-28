package co.com.phptravels.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.phptravels.net/login")
public class LoginPage extends PageObject {

    @FindBy(name = "username")
    WebElement emailBox;

    @FindBy(name = "password")
    WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"loginfrm\"]/button")
    WebElement btnLogin;


    public void enterEmail(String email){
        emailBox.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordBox.sendKeys(password);
    }
    public void clickOnLoginButton(){
        btnLogin.click();
    }

    public String resultUrl(){
        return getDriver().getCurrentUrl();
    }
}
