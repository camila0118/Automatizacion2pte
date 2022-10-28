package co.com.sena.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingcartPage {

    public static final Target BTN_PAGESHOES = Target.the("enter the page shoes")
            .locatedBy("//*[@id='menu-item-10']");

    public static final Target BTN_SHOES = Target.the("enter the shoes")
            .locatedBy("//*[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link']");


    public static final Target BTN_SIZE = Target.the("enter the size product")
            .locatedBy("//*[@class='size_select']");


    public static final Target BTN_BUY = Target.the("enter the buy")
            .locatedBy("//*[@class='buy_button']");


    public static final Target BTN_SHOPPING = Target.the("enter the Shopping Cart")
            .locatedBy("//*[@class='button wc-forward']");

    public static final Target TXT_COMPARE = Target.the("see text 'subtotal'")
            .locatedBy("//*[@class='shop_table shop_table_responsive' or @text='Subtotal']");



}

