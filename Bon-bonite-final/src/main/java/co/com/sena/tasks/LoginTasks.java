package co.com.sena.tasks;

import co.com.sena.models.RegitrationData;
import co.com.sena.userinterface.ClosePage;
import co.com.sena.userinterface.HomePage;
import co.com.sena.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomePage.BTN_ENTER));
        actor.attemptsTo(Enter.theValue("1061694589").into(LoginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue("1234maob!!").into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_SUBMIT));

        //los datos ingresados estan quemados por la razon que las dependencias no dejaron ejecutar el data table
        // y no me dejaba avanzar.

        //  actor.attemptsTo(Click.on(ClosePage.BTN_CLOSE));


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // actor.attemptsTo(Click.on(HomePage.BTN_ENTER));
        // actor.attemptsTo(Enter.theValue("1234567").into(LoginPage.TXT_USERNAME));
        // actor.attemptsTo(Enter.theValue("kacnjkv").into(LoginPage.TXT_PASSWORD));
        // actor.attemptsTo(Click.on(LoginPage.BTN_SUBMIT));
    }


    public static LoginTasks enter() {

        return Tasks.instrumented(LoginTasks.class);
    }
}
