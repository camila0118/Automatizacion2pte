package co.com.sena.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClosePage {
    public static final Target BTN_CLOSE = Target.the("enter to close page").located(By.linkText("href=\"https://www.bon-bonite.com/mi-cuenta/customer-logout/?_wpnonce=1b874ffe70\""));

}
