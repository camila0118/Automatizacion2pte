package co.com.sena.tasks;

import co.com.sena.userinterface.HomePage;
import co.com.sena.userinterface.ShoppingcartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ShoppingcartTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ShoppingcartPage.BTN_PAGESHOES));
        actor.attemptsTo(Scroll.to(ShoppingcartPage.BTN_SHOES));
        actor.attemptsTo(Click.on(ShoppingcartPage.BTN_SHOES));
        actor.attemptsTo(Click.on(ShoppingcartPage.BTN_SIZE));
        SelectFromOptions.byValue("35").from(ShoppingcartPage.BTN_SIZE);
        // actor.attemptsTo(Click.on(ShoppingcartPage.BTN_PAGESHOES));
        // actor.attemptsTo(Click.on(ShoppingcartPage.BTN_BUY));
        // actor.attemptsTo(Click.on(ShoppingcartPage.BTN_SHOPPING));

    }

    public static ShoppingcartTasks click() {
        return Tasks.instrumented(ShoppingcartTasks.class);
    }
}
