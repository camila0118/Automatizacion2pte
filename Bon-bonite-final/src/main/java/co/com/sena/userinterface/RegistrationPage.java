package co.com.sena.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPage {


    public static final Target TXT_IDENT = Target.the("enter the identification")
            .locatedBy("//input[@id='reg_username']");

    public static final Target TXT_CORREO = Target.the("enter the correo")
            .locatedBy("//input[@id='reg_email']");


    public static final Target TXT_PASSWORD2 = Target.the("enter the password2")
            .locatedBy("//input[@id='reg_password']");

    public static final Target BTN_REGISTRATION = Target.the("Click on the button 'registrarse'")
            .locatedBy("//button[@class='woocommerce-Button button']");

    public static final Target BTN_CHECK = Target.the("Click on the button 'info'")
            .locatedBy("//input[@id='newsletter_authorization']");

    public static final Target BTN_CHECK2 = Target.the("Click on the button 'auto'")
            .locatedBy("//input[@id='privacy_policy_reg']");


}

