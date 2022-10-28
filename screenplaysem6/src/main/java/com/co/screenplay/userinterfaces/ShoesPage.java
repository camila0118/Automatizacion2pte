package com.co.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoesPage {

    public static final Target SELECT_SHOES = Target.the("select shoes white")
            .locatedBy("//*[@id='wrapper']/div[5]/ul/li[4]/a/img");

    public static final Target SELECT_SIZE = Target.the("select size shoes")
            .locatedBy("//select[@id='pa_talla']");

    //public static final Target BTN_BUY_NOW = Target.the("click in Button 'Comprar ahora'")
    //       .locatedBy("//a[@class='buy_now_link']");

    public static final Target BTN_BUY_NOW = Target.the("click in Button 'Comprar ahora'")
            .locatedBy("//a[text()='Comprar Ahora']");

 //   public static final Target LBL_CAPTURE_MESSAGE = Target.the("capture message confirmation")
   //         .locatedBy("///*[@class='product-name']/a");

    public static final Target LBL_CAPTURE_MESSAGE = Target.the("capture message confirmation")
            .locatedBy("//*[@class='product-name']/a");


}
