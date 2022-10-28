package com.co.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("into the username")
            .locatedBy("//input[@id='user-name']");

    public static final Target TXT_PASSWORD = Target.the("into the Password")
            .locatedBy("//input[@id='password']");

    public static final Target BTN_LOGIN = Target.the("click in the login button")
            .locatedBy("//input[@id='login-button']");


}
