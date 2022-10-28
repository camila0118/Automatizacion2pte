package co.com.sena.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class InicioPage {

    public static final Target BTN_SHOES = Target.the("enter to page shoes")
            .locatedBy("//*[@id='menu-item-10']/a");

    public static final Target BTN_LOGIN = Target.the("Select option menu")
            .locatedBy("//*[@id='burger']");
    public static final Target BTN_ENTER = Target.the("Select option my account")
            .locatedBy("//div[@class='myaccount']");
}


// public static final Target BTN_BUY = Target.the("Select option menu")
//      .locatedBy("//button[@class='calltoaction']");

//   public static final Target BTN_SELECT = Target.the("Select option talla")
//        .locatedBy("//select[@id='pa-talla']");


//  public static final Target BTN_AHORA = Target.the("Select option buy")
//    .locatedBy("//button[@class='buy_now_button']");


//  public static final Target BTN_FINBUY = Target.the("Select option fin")
//   .locatedBy("//button[@class='checkout-button button alt wc-forward']");


//  public static final Target BTN_USER = Target.the("Select option use")
//   .locatedBy("//button[@class='woocommerce-info']");
