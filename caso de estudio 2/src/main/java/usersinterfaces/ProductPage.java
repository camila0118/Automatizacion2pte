package usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target COMPARE_PRODUCT = Target.the("check the notes")
            .locatedBy("//*[text()='Copyright © 2021 Fábrica de software - Centro de Teleinformática y Producción Industrial - Regional Cauca']");

}
