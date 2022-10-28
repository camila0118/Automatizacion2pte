package com.co.serenity.tasks;

import com.co.serenity.models.Data;
import com.co.serenity.userinterfaces.InitialPage;
import com.co.serenity.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(InitialPage.BTN_LOGIN));
        actor.attemptsTo(Enter.theValue("mccotazo9@misena.edu.co").into(LoginPage.TXT_EMAIL),
                Enter.theValue("12345").into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_SIGNIN));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static Login On() {
        return Tasks.instrumented(Login.class);
    }
}
