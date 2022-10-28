package co.com.senasoft.tasks;


import co.com.senasoft.models.Logindata;
import co.com.senasoft.ui.Initialpage;
import co.com.senasoft.ui.Loginpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Initialpage.BTN_LOGIN));
        actor.attemptsTo(Enter.theValue("1061694589").into(Loginpage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue("camidorado0118").into(Loginpage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(Loginpage.BTN_SUBMIT));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static Login enter() {
        return Tasks.instrumented(Login.class);
    }
}
