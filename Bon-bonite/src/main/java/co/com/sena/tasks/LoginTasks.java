package co.com.sena.tasks;

import co.com.sena.models.LoginData;
import co.com.sena.userinterface.InicioPage;
import co.com.sena.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class LoginTasks implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(InicioPage.BTN_ENTER));
        actor.attemptsTo(Enter.theValue("1061694589").into(LoginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue("1234maob!!").into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_SUBMIT));
    }

    public static LoginTasks enter() {

        return Tasks.instrumented(LoginTasks.class);
    }

}


//  actor.attemptsTo(Click.on(InicioPage.BTN_BUY));
//  SelectFromOptions.byVisibleText("35-5").from(InicioPage.BTN_SELECT);
// actor.attemptsTo(Click.on(InicioPage.BTN_AHORA));
// actor.attemptsTo(Click.on(InicioPage.BTN_FINBUY));
//  actor.attemptsTo(Click.on(InicioPage.BTN_USER));

