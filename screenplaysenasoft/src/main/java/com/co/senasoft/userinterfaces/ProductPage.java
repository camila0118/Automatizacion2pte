package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target COMPARE_PRODUCT = Target.the("compare the product")
            .locatedBy("//*[text()='Sauce Labs Backpack']");

}
