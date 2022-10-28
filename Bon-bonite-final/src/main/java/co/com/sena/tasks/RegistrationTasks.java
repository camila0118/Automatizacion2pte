package co.com.sena.tasks;

import co.com.sena.models.RegitrationData;
import co.com.sena.userinterface.HomePage;
import co.com.sena.userinterface.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegistrationTasks implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomePage.BTN_ENTER));
        actor.attemptsTo(Enter.theValue("1061684156").into(RegistrationPage.TXT_IDENT));
        actor.attemptsTo(Enter.theValue("davsanacona@misena.edu.co").into(RegistrationPage.TXT_CORREO));
        actor.attemptsTo(Enter.theValue("/12345678maob**--").into(RegistrationPage.TXT_PASSWORD2));
        try {Thread.sleep(2000); } catch (InterruptedException e) {e.printStackTrace();}
        actor.attemptsTo(Click.on(RegistrationPage.BTN_CHECK));
        actor.attemptsTo(Click.on(RegistrationPage.BTN_CHECK2));
        actor.attemptsTo(Click.on(RegistrationPage.BTN_REGISTRATION));
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
    }

    public static RegistrationTasks enter() {return Tasks.instrumented(RegistrationTasks.class);}
}

//los datos que ingrese estan quemado por la razon que por dependencias no me lo validaba.
//los checkbox estan con click porque con SelectFromOptions.byVisibleText("").from(RegistrationPage.BTN_CHECK);
//Realmente no se son malas practicas. me imagino que si, pero ya lo ire solucionando.
//123456msomcvdiofmij