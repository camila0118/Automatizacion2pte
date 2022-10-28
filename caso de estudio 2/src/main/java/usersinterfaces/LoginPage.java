package usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("enter the username")
            .locatedBy("//input[@id='usuario']");

    public static final Target TXT_PASSWORD = Target.the("enter the password")
            .locatedBy("//input[@id='password']");

    public static final Target BTN_LOGIN = Target.the("click the button")
            .locatedBy("//input[@class='btn my-4 btn-naranja-sena']");


}
